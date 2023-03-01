package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckMessage
{
    private final WebDriver driver;
    //Локатор коллекции сообщений
    private final By collectMessage = By.className("Home_FAQ__3uVm4");
    //Локатор кнопки 1 вопроса
    private final By firstClickBtnText = By.xpath("//*[@id=\"accordion__heading-0\"]");
    //Локатор кнопки 2 вопроса
    private final By secondClickBtnText = By.xpath("//*[@id=\"accordion__heading-1\"]");
    //Локатор кнопки 3 вопроса
    private final By thirdClickBtnText = By.xpath("//*[@id=\"accordion__heading-2\"]");
    //Локатор кнопки 4 вопроса
    private final By fourthClickBtnText = By.xpath("//*[@id=\"accordion__heading-3\"]");
    //Локатор кнопки 5 вопроса
    private final By fifthClickBtnText = By.xpath("//*[@id=\"accordion__heading-4\"]");
    //Локатор кнопки 6 вопроса
    private final By sixthClickBtnText = By.xpath("//*[@id=\"accordion__heading-5\"]");
    //Локатор кнопки 7 вопроса
    private final By seventhClickBtnText = By.xpath("//*[@id=\"accordion__heading-6\"]");
    //Локатор кнопки 8 вопроса
    private final By eighthClickBtnText = By.xpath("//*[@id=\"accordion__heading-7\"]");
    public CheckMessage (WebDriver driver)
    {
        this.driver = driver;
    }
    //Метод скрола от header до блока с вопросами "Вопросы о главном"
    public void scrollCollectMessages()
    {
        WebElement element = driver.findElement(collectMessage);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    //Метод нажатия на кнопку вопроса
    public void firstMessage()
    {
        driver.findElement(firstClickBtnText).click();
    }
    // Метод скролла и клика по 1 вопросу передаваемый в тестовый класс "Test"
    public void firstText()
    {
        scrollCollectMessages();
        firstMessage();
    }
    //Метод нажатия на кнопку 2 вопроса
    public void secondMessage()
    {
        driver.findElement(secondClickBtnText).click();
    }
    // Метод скролла и клика по 2 вопросу передаваемый в тестовый класс "TestTwo"
    public void secondText()
    {
        scrollCollectMessages();
        secondMessage();
    }
    //Метод нажатия на кнопку 3 вопроса
    public void thirdMessage()
    {
        driver.findElement(thirdClickBtnText).click();
    }
    // Метод скролла и клика по 3 вопросу передаваемый в тестовый класс "TestThird"
    public void thirdText()
    {
        scrollCollectMessages();
        thirdMessage();
    }
    //Метод нажатия на кнопку 4 вопроса
    public void fourthMessage()
    {
        driver.findElement(fourthClickBtnText).click();
    }
    // Метод скролла и клика по 4 вопросу передаваемый в тестовый класс "TestFourth"
    public void fourthText()
    {
        scrollCollectMessages();
        fourthMessage();
    }
    //Метод нажатия на кнопку 5 вопроса
    public void fifthMessage()
    {
        driver.findElement(fifthClickBtnText).click();
    }
    // Метод скролла и клика по 5 вопросу передаваемый в тестовый класс "TestFifth"
    public void fifthText()
    {
        scrollCollectMessages();
        fifthMessage();
    }
    //Метод нажатия на кнопку 6 вопроса
    public void sixthMessage()
    {
        driver.findElement(sixthClickBtnText).click();

    }
    // Метод скролла и клика по 6 вопросу передаваемый в тестовый класс "TestSixth"
    public void sixthText()
    {
        scrollCollectMessages();
        sixthMessage();
    }
    //Метод нажатия на кнопку 7 вопроса
    public void seventhMessage()
    {
        driver.findElement(seventhClickBtnText).click();
    }
    // Метод скролла и клика по 7 вопросу передаваемый в тестовый класс "TestSeventh"
    public void seventhText()
    {
        scrollCollectMessages();
        seventhMessage();
    }
    //Метод нажатия на кнопку 8 вопроса
    public void eighthMessage()
    {
        driver.findElement(eighthClickBtnText).click();
    }
    // Метод скролла и клика по 8 вопросу передаваемый в тестовый класс "TestEighth"
    public void eighthText()
    {
        scrollCollectMessages();
        eighthMessage();
    }
}

