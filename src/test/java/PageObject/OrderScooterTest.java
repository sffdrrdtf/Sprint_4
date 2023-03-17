package PageObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class OrderScooterTest {
    private WebDriver driver;
    private final String name;
    private final String surname;
    private final String address;
    private final String telephone;
    private final String comment;
    private final int clickBtn;
    private final boolean result;

    public OrderScooterTest( int clickBtn, String name, String surname, String address, String telephone, String comment,boolean result)
    {
        this.clickBtn = clickBtn;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.telephone = telephone;
        this.comment = comment;
        this.result=result;
    }
    @Parameterized.Parameters
    public static Object[][] getOrders()
    {
        return new Object[][]
                {
                        {0,"Сергей", "Бунитруль", "Сосновая 2", "+79998887766", "Не звонить, ребенок спит", true},
                        {1,"Виктор", "Иванов", "Яровая 40", "+79998887766", "Добрый день, будьте добры, привезите самокат после 3", true}
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
        objHomePage.clickButtonsOrder(clickBtn);
        //Создаем объект страницы Для кого Скутер?
        PageFormOrderScooter objPageFormOrderScooter = new PageFormOrderScooter(driver);
        // Метод заполнения полей name, surname, address, telephone, metroStation.
        objPageFormOrderScooter.formScooter( name,  surname,  address, telephone);
        //Создаем объект страницы Про Аренду
        PageFormOrderRent objPageFormOrderRent = new PageFormOrderRent(driver);
        //Метод заполнения полей страницы Про Аренду
        objPageFormOrderRent.formRent(comment);
        // Производит проверку видимости сообщения об успешном заказе
        assertEquals(result,objPageFormOrderRent.isMessageOrderVisible());
    }
    @After
    public void closePage()
    {
        driver.quit();
    }
}
