package SeleniumTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class FirstAmazonTest {
 private WebDriver browser;
 private WebDriverWait wait;
 private final By ACCEPT_COOKIES_BTN = By.id("sp-cc-accept");
 private final By CONTINUE_BTN = By.xpath(".//input[@data-action-type=\"DISMISS\"]");
 private final By BEST_SELLERS_BTN = By.xpath(".//a[@href=\"/-/en/gp/bestsellers/?ref_=nav_cs_bestsellers\"]");
 private final By BOOKS_BTN = By.xpath(".//a[@href=\"/-/en/gp/bestsellers/books/ref=zg_bs_nav_0\"]");
 private final By BOOK_NR4 = By.xpath(".//img[@alt=\"Frag doch mal ... die Maus: Daily Calendar 2023 - My Calendar for Every Day\"]");


@Test
    public void amazonTest() {
        String menuItemToSelect = "Best Sellers";

        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://www.amazon.de");

        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        try {
            browser.findElement(ACCEPT_COOKIES_BTN).click();
        } catch (NoSuchElementException e){
        };
    wait.until(ExpectedConditions.elementToBeClickable(CONTINUE_BTN));
    browser.findElement(CONTINUE_BTN).click();

    wait.until(ExpectedConditions.elementToBeClickable(BEST_SELLERS_BTN));
    browser.findElement(BEST_SELLERS_BTN).click();

    wait.until(ExpectedConditions.elementToBeClickable(BOOKS_BTN));
    browser.findElement(BOOKS_BTN).click();

    String expected = browser.findElement(By.xpath(".//div[@id='gridItemRoot'][4]//div[@class='zg-grid-general-faceout']/div/div[2]/div/a")).getAttribute("title");

    wait.until(ExpectedConditions.elementToBeClickable(BOOK_NR4));
    browser.findElement(BOOK_NR4).click();

    String actual = browser.findElement(By.xpath(".//span[@id='acrPopover']")).getAttribute("title");

    System.out.println(expected);

    System.out.println(actual);

    if (expected.equals(actual)){
        System.out.println("test pass");
    } else {
        System.out.println("test fail");
    }

    }
}
