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
    public void allClickBtnTextsQuestion(int clickTextQuestion) {
        List<WebElement> elementsVClickTexts = driver.findElements(allClickBtnText);
        elementsVClickTexts.get(clickTextQuestion).click();
    }
    //Метод получения текста по его индексу
    public void allGetTextsQuestion(int actualGetText) {
        List<WebElement> elementsVClickTexts = driver.findElements(getTexts);
        elementsVClickTexts.get(actualGetText).getText();
    }
    //Метод получения текста по его индексу для проверки как ожидаемый результат
    public void allGetTextsQuestion1(int expectedGetText) {
        List<WebElement> elementsVClickTexts = driver.findElements(getTexts);
        elementsVClickTexts.get(expectedGetText).getText();
    }
    // Метод передаваемый в тестовый класс "Test"
    public void allText(int clickTextQuestion, int actualGetText, int expectedGetText) {
        scrollCollectMessages();
        allClickBtnTextsQuestion(clickTextQuestion);
        allGetTextsQuestion(actualGetText);
        allGetTextsQuestion1(expectedGetText);
    }
}

