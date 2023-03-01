package PageObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class PracticumTests {
    private final String name;
    private final String surname;
    private final String address;
    private final String telephone;
    private final String comment;
    public PracticumTests(String name, String surname, String address, String telephone, String comment )
    {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.telephone = telephone;
        this.comment = comment;
    }
    @Parameterized.Parameters
    public static Object[][] getOrders()
    {
        return new Object[][]
                {
                        {"Сергей", "Бунитруль", "Сосновая 2", "+79998887766", "Не звонить, ребенок спит"},
                        {"Виктор", "Иванов", "Яровая 40", "+79998887766", "Добрый день, будьте добры, привезите самокат после 3"}
                };
    }
    @Test
    public void ordersTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        // Загружается главная страница
        driver.get("https://qa-scooter.praktikum-services.ru/");
        //Создаем объект главной страницы
        HomePage objHomePage = new HomePage(driver);
        // Метод кликает по кнопкам Заказать и cookie
        objHomePage.page();
        //Создаем объект страницы Для кого Скутер?
        PageFormOrderScooter objPageFormOrderScooter = new PageFormOrderScooter(driver);
        // Метод заполнения полей name, surname, address, telephone, metroStation.
        objPageFormOrderScooter.formScooter(name, surname, address, telephone);
        //Создаем объект страницы Про Аренду
        PageFormOrderRent objPageFormOrderRent = new PageFormOrderRent(driver);
        //Метод заполнения полей страницы Про Аренду
        objPageFormOrderRent.formRent(comment);
        // Производит проверку видимости сообщения об успешном заказе
        assertTrue(objPageFormOrderRent.isMessageOrderVisible());
        //Закрываем браузер
        driver.quit();
    }
}
