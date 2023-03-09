package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CheckMessage {
    private final WebDriver driver;
    //Локатор коллекции сообщений
    private final By collectMessage = By.className("Home_FAQ__3uVm4");
    //Локатор коллекции Блока вопросов
    private final By allClickBtnText = By.xpath("//div[@class='accordion__item']");
    //Локатор текстов Ответов на вопросы
    private final By getTexts = By.xpath("//p");

    public CheckMessage(WebDriver driver) {
        this.driver = driver;
    }

    //Метод скрола от header до блока с вопросами "Вопросы о главном"
    public void scrollCollectMessages() {
        WebElement element = driver.findElement(collectMessage);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    //Метод клика на кнопку вопроса по его индексу
    public void allClickBtnTextsQuestion(int textQuestion) {
        List<WebElement> elementsVClickTexts = driver.findElements(allClickBtnText);
        elementsVClickTexts.get(0).click();
        elementsVClickTexts.get(1).click();
        elementsVClickTexts.get(2).click();
        elementsVClickTexts.get(3).click();
        elementsVClickTexts.get(4).click();
        elementsVClickTexts.get(5).click();
        elementsVClickTexts.get(6).click();
        elementsVClickTexts.get(7).click();
    }
    // Метод передаваемый в тестовый класс "Test"
    public void allText(int textQuestion) {
        scrollCollectMessages();
        allClickBtnTextsQuestion(textQuestion);
    }
    //Метод получения текста ответа на вопрос по его индексу
    public boolean checkAllMessagesGetText()
    {
        List<WebElement> elements = driver.findElements(getTexts);
        for(WebElement element:elements)
        {
           var text = element.getText();
           if(text == null && text.isEmpty())
           {
               return false;
           }
        }
        return true;
    }
}
