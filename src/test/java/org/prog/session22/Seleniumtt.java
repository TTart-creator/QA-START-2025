package org.prog.session22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.prog.session11.steps.WebSteps.driver;

/*
public class Seleniumtt {
*/

/*    @Test
    public void myTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement cookies = driver.findElement(By.xpath("//a[contains(@href, 'cookies')]"));
        if (cookies != null && cookies.isDisplayed()) {

            driver.findElements(By.tagName("button")).get(10).click();
        }
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Ben Affleck");
        search.sendKeys(Keys.ENTER);
        driver.quit();

    }*/


  /*  @Test
    public void myTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement iPhone = driver.findElement(By.xpath("//a[contains(@href, 'Blue')]"));
        if (iPhone != null && iPhone.isDisplayed()) {


            driver.findElements(By.tagName("button")).get(10).click();
        }
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Ben Affleck");
        search.sendKeys(Keys.ENTER);
        driver.quit();
    }
*/





 /*   @Test
    public void myIframeTest() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_test");
        driver.findElement(By.id("accept-choices")).click();

        WebElement runButton = driver.findElement(By.id("runbtn"));
        System.out.println("Run Button state:" + runButton.isDisplayed());

        WebElement iframe = driver.findElement(By.id("iframeresult"));
        driver.switchTo().frame(iframe);

        WebElement innerBtn = driver.findElement(By.xpath("//button[@type= 'button']"));
        System.out.println("innerBtn.state: " + innerBtn.isDisplayed());
        driver.quit();

    }

    public class WebTest {
        @AfterSuite
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }*/


