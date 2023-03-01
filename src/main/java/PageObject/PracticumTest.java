package PageObject;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.Assert.assertEquals;

public class PracticumTest {
    @Test
    public void Test() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        // Загружается главная страница
        driver.get("https://qa-scooter.praktikum-services.ru/");
        //Клик по кнопке cookie
        driver.findElement(By.id("rcc-confirm-button")).click();
        //Создаем объект класса CheckFirstMessage который кликает по 1 кнопки вопроса и проверяет текст
        CheckMessage objCheckMessage = new CheckMessage(driver);
        objCheckMessage.firstText();
        //Локатор получения текста 1 вопроса
        String text = driver.findElement(By.xpath("//*[@id=\"accordion__panel-0\"]/p")).getText();
        String actual = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        assertEquals(actual,text);
        //Закрываем браузер
        driver.quit();
    }
    @Test
    public void TestTwo() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        // Загружается главная страница
        driver.get("https://qa-scooter.praktikum-services.ru/");
        //Клик по кнопке cookie
        driver.findElement(By.id("rcc-confirm-button")).click();
        //Создаем объект класса CheckFirstMessage который кликает по 2 кнопки вопроса и проверяет текст
        CheckMessage objCheckMessage = new CheckMessage(driver);
        objCheckMessage.secondText();
        //Локатор получения текста 2 вопроса
        String text = driver.findElement(By.xpath("//*[@id=\"accordion__panel-1\"]/p")).getText();
        String actual = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        assertEquals(actual,text);
        //Закрываем браузер
        driver.quit();
    }
    @Test
    public void TestThree(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        // Загружается главная страница
        driver.get("https://qa-scooter.praktikum-services.ru/");
        //Клик по кнопке cookie
        driver.findElement(By.id("rcc-confirm-button")).click();
        //Создаем объект класса CheckFirstMessage который кликает по 3 кнопки вопроса и проверяет текст
        CheckMessage objCheckMessage = new CheckMessage(driver);
        objCheckMessage.thirdText();
        //Локатор получения текста 3 вопроса
        String text = driver.findElement(By.xpath("//*[@id=\"accordion__panel-2\"]/p")).getText();
        String actual = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        assertEquals(actual,text);
        //Закрываем браузер
        driver.quit();
    }
    @Test
    public void TestFour(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        // Загружается главная страница
        driver.get("https://qa-scooter.praktikum-services.ru/");
        //Клик по кнопке cookie
        driver.findElement(By.id("rcc-confirm-button")).click();
        //Создаем объект класса CheckFirstMessage который кликает по 4 кнопки вопроса и проверяет текст
        CheckMessage objCheckMessage = new CheckMessage(driver);
        objCheckMessage.fourthText();
        //Локатор получения текста 4 вопроса
        String text = driver.findElement(By.xpath("//*[@id=\"accordion__panel-3\"]/p")).getText();
        String actual = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        assertEquals(actual,text);
        //Закрываем браузер
        driver.quit();
    }
    @Test
    public void TestFifth(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        // Загружается главная страница
        driver.get("https://qa-scooter.praktikum-services.ru/");
        //Клик по кнопке cookie
        driver.findElement(By.id("rcc-confirm-button")).click();
        //Создаем объект класса CheckFirstMessage который кликает по 5 кнопки вопроса и проверяет текст
        CheckMessage objCheckMessage = new CheckMessage(driver);
        objCheckMessage.fifthText();
        //Локатор получения текста 5 вопроса
        String text = driver.findElement(By.xpath("//*[@id=\"accordion__panel-4\"]/p")).getText();
        String actual = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        assertEquals(actual,text);
        //Закрываем браузер
        driver.quit();
    }
    @Test
    public void TestSix(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        // Загружается главная страница
        driver.get("https://qa-scooter.praktikum-services.ru/");
        //Клик по кнопке cookie
        driver.findElement(By.id("rcc-confirm-button")).click();
        //Создаем объект класса CheckFirstMessage который кликает по 6 кнопки вопроса и проверяет текст
        CheckMessage objCheckMessage = new CheckMessage(driver);
        objCheckMessage.sixthText();
        //Локатор получения текста 6 вопроса
        String text = driver.findElement(By.xpath("//*[@id=\"accordion__panel-5\"]/p")).getText();
        String actual = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        assertEquals(actual,text);
        //Закрываем браузер
        driver.quit();
    }
    @Test
    public void TestSeven(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        // Загружается главная страница
        driver.get("https://qa-scooter.praktikum-services.ru/");
        //Клик по кнопке cookie
        driver.findElement(By.id("rcc-confirm-button")).click();
        //Создаем объект класса CheckFirstMessage который кликает по 7 кнопки вопроса и проверяет текст
        CheckMessage objCheckMessage = new CheckMessage(driver);
        objCheckMessage.seventhText();
        //Локатор получения текста 7 вопроса
        String text = driver.findElement(By.xpath("//*[@id=\"accordion__panel-6\"]/p")).getText();
        String actual = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        assertEquals(actual,text);
        //Закрываем браузер
        driver.quit();
    }
    @Test
    public void TestEight(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        // Загружается главная страница
        driver.get("https://qa-scooter.praktikum-services.ru/");
        //Клик по кнопке cookie
        driver.findElement(By.id("rcc-confirm-button")).click();
        //Создаем объект класса CheckFirstMessage который кликает по 8 кнопки вопроса и проверяет текст
        CheckMessage objCheckMessage = new CheckMessage(driver);
        objCheckMessage.eighthText();
        //Локатор получения текста 8 вопроса
        String text = driver.findElement(By.xpath("//*[@id=\"accordion__panel-7\"]/p")).getText();
        String actual = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        assertEquals(actual,text);
        //Закрываем браузер
        driver.quit();
    }
}

