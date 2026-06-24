package org.prog.session22;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.prog.session11.steps.WebSteps.driver;

public class hwiPhone {

    @Test
    public void myTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://allo.ua/ua/catalogsearch/result/?q=iphone");
        driver.manage().deleteAllCookies();

        try {
            driver.get("https://allo.ua/ua/catalogsearch/result/?q=iphone");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            try {
                // Example selectors - inspect the actual popup
                WebElement closeButton = wait.until(
                        ExpectedConditions.elementToBeClickable(
                                By.cssSelector(
                                        "button[class*='close'], .close, .popup-close"
                                )
                        )
                );

                closeButton.click();

                System.out.println("Notification popup closed.");

            } catch (TimeoutException e) {
                System.out.println("Popup not displayed.");
            }

            /*driver.get("https://allo.ua/ua/products/mobile/apple-iphone-17-pro-256gb-deep-blue-aluminum.html");*/

            WebElement goods = driver.findElement(By.xpath("//h1[contains(text()), 'Apple iPhone 17 Pro 256GB Deep Blue (MG8J4)')]"));
            if (goods != null && goods.isDisplayed()){
                WebElement price = goods.findElement(By.className("v-pb__price__row"));
                // тут проверяете что в элементе price есть символ гривны
            }

            System.out.println(goods);

                /*driver.findElements(By.tagName("₴")).get(10).click();*/
            }

/*            String priceText = priceElement.getText();

            assertTrue(
                    priceText.contains("₴"),
                    "Price should contain the hryvnia symbol (₴). Actual text: " + priceText
            );*/
/*            WebElement currency = driver.findElement(By.xpath("//a[contains(@href, 'price__current-currency>₴</span>')]"));
            currency.sendKeys("₴");
            currency.sendKeys(Keys.ENTER);*/
        } finally {
            driver.quit();
        }


        /*  driver.get("https://allo.ua/ua/products/mobile/apple-iphone-17-pro-256gb-deep-blue-aluminum.html");*/

      /*  WebElement iPhone = driver.findElement(By.xpath("//a[contains(@href, 'Blue')]"));
        if (iPhone != null && iPhone.isDisplayed()) {

         driver.findElements(By.tagName("button")).get(10).click();
        }
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Ben Affleck");
        search.sendKeys(Keys.ENTER);
            driver.quit();
*/

    }
}