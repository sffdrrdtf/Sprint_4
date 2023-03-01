package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageFormOrderScooter // Страница формы заказа Для кого самокат
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
