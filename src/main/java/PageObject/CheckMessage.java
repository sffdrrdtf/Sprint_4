package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CheckMessage {
    private final WebDriver driver;
    //Локатор локатор блока вопросов
    private final By blockQuestButton = By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div");
    public CheckMessage(WebDriver driver) {
        this.driver = driver;
    }
    //Метод скрола кнопок блока с вопросами "Вопросы о главном"
    public void scrollToBlockQuestButton() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",
                driver.findElement(blockQuestButton));
    }
    //Метод клика на кнопку вопроса и получения текста
    public String getAnswerToFAQ(int numAnswer) {
        WebElement quest = driver.findElement(By.id("accordion__heading-" + numAnswer));
        quest.click();
        WebElement textAnswer = driver.findElement(By.id("accordion__panel-" + numAnswer));
        return textAnswer.getText();
    }
}
