import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.Assert.assertTrue;

class HomePage //Начальная страница
{
    private final WebDriver driver;
    private final By firstButtonOrder = By.className("Button_Button__ra12g"); // Локатор кнопки заказа
    private final By buttonCookies = By.id("rcc-confirm-button"); // Локатор кнопки cookie
    public HomePage(WebDriver driver)
    {
      this.driver = driver;
    }
     public void clickFirstButtonOrder()// Метод нажатия на кнопку Заказать
     {
       driver.findElement(firstButtonOrder).click();
     }
     public void clickButtonCookies()// Метод нажатия на кнопку cookie
     {
      driver.findElement(buttonCookies).click();
     }
    public void page()// Метод передаваемый в тестовый класс practicum
    {
        clickFirstButtonOrder();
        clickButtonCookies();
    }
}
class PageFormOrderScooter // Страница формы заказа Для кого самокат
{
    private final WebDriver driver;
    private final By nameField = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input");
   //Локатор поля Имени
    private final By surnameField = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input");
   // Локатор поля Фамилии
    private final By addressField = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/input");
  // Локатор поля Адреса
    private final By telephoneField = By.xpath("/html/body/div/div/div[2]/div[2]/div[5]/input");
   // Локатор поля Телефон
    private final By metroStationField = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div/input");
   // Локатор поля Станции метро
    private final By clickMetroStation = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[2]");
   // Локатор клика по Станции метро
    private final By buttonFurther = By.xpath("/html/body/div/div/div[2]/div[3]/button");
    // Локатор кнопки Далее
    public PageFormOrderScooter(WebDriver driver)

    {
        this.driver = driver;
    }
    public void setName(String name) // Метод заполняет поле Имени
    {
        driver.findElement(nameField).sendKeys(name);
    }
    public void setSurname(String surname)// Метод заполняет поле Фамилии
    {
        driver.findElement(surnameField).sendKeys(surname);
    }
    public void setAddress(String address)// Метод заполняет поле Адреса
    {
        driver.findElement(addressField).sendKeys(address);
    }
    public void metroStation()// Метод производит Скрол и клик по Станции Метро
    {
        driver.findElement(metroStationField).click();
        WebElement element = driver.findElement(clickMetroStation);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(clickMetroStation).click();
    }
    public void setTelephone(String telephone)// Метод заполняет поле Телефон
    {
       driver.findElement(telephoneField).sendKeys(telephone);
    }
    public void clickButtonFurther()// Метод кликает по кнопке Далее
    {
        driver.findElement(buttonFurther).click();
    }
    // Метод передаваемый в тестовый класс practicum
    public void formScooter(String name, String surname, String address, String telephone){
        setName(name);
        setSurname(surname);
        setAddress(address);
        metroStation();
        setTelephone(telephone);
        clickButtonFurther();
    }
}
class PageFormOrderRent
{
    private final WebDriver driver;
    // Локатор поля Даты
    private final By dateField = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/input");
    // Локатор клика кнопки  по дате
    private final By clickDate = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[5]");
    // Локатор клика поля Срок Аренды
    private final By timeDuration = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div[1]");
    // Локатор клика кнопки определенного Срока Аренды
    private final By clickTimeDuration = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[7]");
    // Локатор клика по чекбоксу Цвет самоката
    private final By scooterColour = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/label[1]");
    // Локатор поля Комментарий
    private final By commentField = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/input");
    // Локатор клика кнопки Заказать
    private final By secondButtonOrder = By.xpath("/html/body/div/div/div[2]/div[3]/button[2]");
    //Локатор клика кнопки Да
    private final By buttonYes = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]");
    //Локатор сообщения об успешном оформлении заказа
    private final By messageOrder = By.xpath("/html/body/div/div/div[2]/div[5]");
    public PageFormOrderRent(WebDriver driver)
    {
        this.driver = driver;
    }
    public void choiceDate() //Метод кликает по полю Дата
    {
        driver.findElement(dateField).click();
        driver.findElement(clickDate).click();
    }
    public void choiceTimeDuration() //Метод производит Скрол и клик по полю Срок аренды
    {
        driver.findElement(timeDuration).click();
        WebElement elementTimeRent = driver.findElement(clickTimeDuration);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", elementTimeRent);
        driver.findElement(clickTimeDuration).click();
    }
    public void choiceCommentField()//Метод кликает по чекбоксу Цвет самоката
    {
        driver.findElement(scooterColour).click();
    }
    public void setComment(String comment)//Метод заполняет поле Комментарий
    {
        driver.findElement(commentField).sendKeys(comment);
    }
    public void clickButtonOrder()//Метод кликает по кнопке Заказать
    {
        driver.findElement(secondButtonOrder).click();
    }
    public void clickButtonYes()//Метод кликает по кнопке Да
    {
        driver.findElement(buttonYes).click();
    }
    public boolean isMessageOrderVisible()//Метод проверяет видимость сообщения об успешном оформлении заказа
    {
        return driver.findElement(messageOrder).isDisplayed();

    }
    public void formRent(String comment)// Метод передаваемый в тестовый класс practicum
    {
        choiceDate();
        choiceTimeDuration();
        choiceCommentField();
        setComment(comment);
        clickButtonOrder();
        clickButtonYes();
    }
}
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
