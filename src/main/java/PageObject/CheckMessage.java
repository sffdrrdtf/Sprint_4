package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CheckMessage {
    private final WebDriver driver;
    //Локатор текстов Ответов на вопросы
    private final By accordionQuestButton = By.className("accordion__button");
    public CheckMessage(WebDriver driver) {
        this.driver = driver;
    }
    //Метод клика на кнопку вопроса и получения текста
    public String getAnswerToFAQ(int numAnswer) {
        WebElement Quest = driver.findElement(By.id("accordion__heading-" + numAnswer));
        Quest.click();
        WebElement textAnswer = driver.findElement(By.id("accordion__panel-" + numAnswer));
        return textAnswer.getText();
    }
    //Метод скрола кнопок блока с вопросами "Вопросы о главном"
    public By getAccordionQuestButton() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",
                driver.findElement(By.className("accordion__button")));
        return accordionQuestButton;
    }
}
