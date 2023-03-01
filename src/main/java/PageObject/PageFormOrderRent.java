package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageFormOrderRent
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
