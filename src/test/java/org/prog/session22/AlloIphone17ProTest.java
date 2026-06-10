package org.prog.session22;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

    public class AlloIphone17ProTest {

        private WebDriver driver;
        private WebDriverWait wait;

        @BeforeEach
        void setUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        }

        @Test
        void selectIphone17Pro() {

// Open site
            driver.get("https://allo.ua");

// Clear cookies
            driver.manage().deleteAllCookies();

// Reload page so cookie banner appears again
            driver.navigate().refresh();

// Click "Zezwalaj"
            WebElement allowButton = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//button[normalize-space()='Zezwalaj']")
                    )
            );
            allowButton.click();

// Open iPhone 17 Pro catalog
            driver.get(
                    "https://allo.ua/ua/products/mobile/apple-iphone-17-pro-256gb-deep-blue-aluminum.html"
            );

// Select first available product
            WebElement firstProduct = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.cssSelector("a.product-card__title")
                    )
            );

            String productName = firstProduct.getText();
            firstProduct.click();

// Verify product page opened
            wait.until(ExpectedConditions.urlContains("/products/"));

            Assertions.assertFalse(
                    driver.getTitle().isBlank(),
                    "Product page was not opened"
            );

            System.out.println("Selected product: " + productName);
        }

        @AfterEach
        void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }