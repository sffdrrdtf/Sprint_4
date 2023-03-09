package PageObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class CheckMessagesTest {
    private WebDriver driver;
    private final int textQuestion;
    public CheckMessagesTest( int textQuestion)
    {
        this.textQuestion = textQuestion;
    }
    @Parameterized.Parameters
    public static Object[][] getTexts()
    {
        return new Object[][]
                {
                        {0},
                        {1},
                        {2},
                        {3},
                        {4},
                        {5},
                        {6},
                        {7},
                };
    }

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.navigate().to("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void TestOne() {
        //Клик по кнопке cookie
        driver.findElement(By.id("rcc-confirm-button")).click();
        //Создаем объект класса CheckFirstMessage который кликает по 1 кнопки вопроса и проверяет текст
        CheckMessage objCheckMessage = new CheckMessage(driver);
        objCheckMessage.allText(textQuestion);
        var isAllMessageGetText = objCheckMessage.checkAllMessagesGetText();
        assertTrue(isAllMessageGetText);
    }

    @After
    public void closePage() {
        driver.quit();

    }
}