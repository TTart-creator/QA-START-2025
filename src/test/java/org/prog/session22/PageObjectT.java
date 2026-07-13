//package org.prog.session22;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//
//import static org.prog.session11.steps.WebSteps.driver;
//
//public class PageObjectT {
//
//    @BeforeSuite
//    public void initWebDriver(){
//        driver = new ChromeDriver();
//    }
//
//    @Test
//    public void myTest() {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com");
//
//        WebElement cookies = driver.findElement(By.xpath("//a[contains(@href, 'cookies')]"));
//        if (cookies != null && cookies.isDisplayed()) {
//
//            driver.findElements(By.tagName("button")).get(10).click();
//        }
//        WebElement search = driver.findElement(By.name("q"));
//        search.sendKeys("Ben Affleck");
//        search.sendKeys(Keys.ENTER);
//        driver.quit();
//
//    }*/
//    @AfterSuite
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}
