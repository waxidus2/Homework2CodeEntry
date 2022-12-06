import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TicketsTest {
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class = \"gogogo\"]");

    private  final By FIRST_NAME = By.id("name");
    private final  By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By BOOKK_BTN = By.id("book2");
    private final By DESTANATION = By.xpath(".//div[@class=\"infoTxt\"]");



    private WebDriver browser;
    private WebDriverWait wait;

    @Test
    public void reservationChack() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.qaguru.lv:8089/tickets/");

        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        select(FROM, "RIX");
        select(TO, "SFO");

        Select airportFrom = new Select(browser.findElement(FROM));
        airportFrom.selectByValue("RIX");

        Select airportTo = new Select(browser.findElement(TO));
        airportTo.selectByValue("SFO");
        browser.findElement(GO_BTN).click();




        type(FIRST_NAME, "Anton");//First Name
        type(LAST_NAME, "Vlasov");//Last Name
        type(DISCOUNT, "1234567");//Discount Code
        type(ADULTS, "2");//Adults Count
        type(CHILDREN, "1");//Children Count
        type(BAG, "2");//Bag Count
        select(FLIGHT, "13");//Flight Date

        


        wait.until(ExpectedConditions.elementToBeClickable(BOOKK_BTN));


    }

    private void select(By locator, String value) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(we);
        select.selectByValue(value);
    }

    private void type(By locator, String text) {
        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        input.clear();
        input.sendKeys(text);
    }
}
