package org.prog.session22;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class hwiPhone {

    @Test
    public void myTest() {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://allo.ua/ua/catalogsearch/result/?q=iphone");
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Try to close popup if it appears
            try {
                WebElement closeButton = wait.until(
                        ExpectedConditions.elementToBeClickable(
                                By.cssSelector("button[class*='close'], .close, .popup-close")
                        )
                );
                closeButton.click();
                System.out.println("Notification popup closed.");
            } catch (TimeoutException e) {
                System.out.println("Popup not displayed.");
            }

            // Wait for first product card
            WebElement goods = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.cssSelector(".product-card")
                    )
            );

            System.out.println("Product card found.");

            // Example: get product title and price
            WebElement title = goods.findElement(By.cssSelector(".product-card__content"));
            System.out.println("Title: " + title.getText());

            // Adjust selector if needed after checking page HTML
            WebElement price = goods.findElement(By.cssSelector("[class*='price']"));
            System.out.println("Price: " + price.getText());

        } finally {
            driver.quit();
        }
    }
}