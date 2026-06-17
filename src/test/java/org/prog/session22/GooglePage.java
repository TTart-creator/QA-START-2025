/*package org.prog.session22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {

    private WebDriver driver;

    public void loadPage(){
        driver.get("https://www.google.com");
    }
    public void AcceptCookiesIfPresent(){
        WebElement cookies = driver.findElement(By.xpath("//a[contains(@href, 'cookies')]"));
        if (cookies != null && cookies.isDisplayed()) {
            driver.findElements(By.tagName("button")).get(10).click();
        }
        }

}
    public void searchForSomething(){
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Ben Affleck");
        search.sendKeys(Keys.ENTER);

    }
}*/
