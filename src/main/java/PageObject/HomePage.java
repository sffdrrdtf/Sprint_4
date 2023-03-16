package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class HomePage //Начальная страница
{
    private final WebDriver driver;
    // Локатор 2 кнопок заказа, вверху и в низу главной страницы
    private final By clickTwoButtonsOrder = By.xpath("//button[text()='Заказать']");
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    // Метод нажатия на кнопки Заказать по их индексу расположения
    public void clickButtonsOrder(int clickBtn)
    {
        WebElement elementScrollToBtn = driver.findElement(clickTwoButtonsOrder);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", elementScrollToBtn);
        List<WebElement> elementsVClickTwoBtn = driver.findElements(clickTwoButtonsOrder);
        elementsVClickTwoBtn.get(clickBtn).click();
    }
}
