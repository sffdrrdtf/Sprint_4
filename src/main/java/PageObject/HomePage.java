package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage //Начальная страница
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
