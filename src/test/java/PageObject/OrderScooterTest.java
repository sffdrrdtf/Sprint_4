package PageObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class OrderScooterTest {
    private WebDriver driver;
    private final String name;
    private final String surname;
    private final String address;
    private final String telephone;
    private final String comment;
    private final int clickBtn;

    public OrderScooterTest( int clickBtn, String name, String surname, String address, String telephone, String comment)
    {
        this.clickBtn = clickBtn;
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
                        {0,"Сергей", "Бунитруль", "Сосновая 2", "+79998887766", "Не звонить, ребенок спит"},
                        {1,"Виктор", "Иванов", "Яровая 40", "+79998887766", "Добрый день, будьте добры, привезите самокат после 3"}
                };
    }
    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.navigate().to("https://qa-scooter.praktikum-services.ru/");
    }
    @Test
    public void ordersTest() {
        //Создаем объект главной страницы
        driver.findElement(By.id("rcc-confirm-button")).click();
        HomePage objHomePage = new HomePage(driver);
        // Метод кликает по кнопкам Заказать и cookie
        objHomePage.page(clickBtn);
        //Создаем объект страницы Для кого Скутер?
        PageFormOrderScooter objPageFormOrderScooter = new PageFormOrderScooter(driver);
        // Метод заполнения полей name, surname, address, telephone, metroStation.
        objPageFormOrderScooter.formScooter( name,  surname,  address, telephone);
        //Создаем объект страницы Про Аренду
        PageFormOrderRent objPageFormOrderRent = new PageFormOrderRent(driver);
        //Метод заполнения полей страницы Про Аренду
        objPageFormOrderRent.formRent(comment);
        // Производит проверку видимости сообщения об успешном заказе
        assertTrue(objPageFormOrderRent.isMessageOrderVisible());
    }
    @After
    public void closePage()
    {
        driver.quit();
    }
}
