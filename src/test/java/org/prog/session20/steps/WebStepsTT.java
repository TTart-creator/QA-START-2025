package org.prog.session20.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.prog.session8.page.GooglePage;
import org.testng.Assert;

public class WebStepsTT {

    public static ChromeDriver driver;
    private GooglePage googlePage = new GooglePage(driver);


    @Given("I load google page")
    public void loadGooglePage() {
        googlePage.loadPage();
    }

    @Given("I accept cookies if they are present")
    public void acceptCookies() {
        if (googlePage.isCookiesPresent()) ;
        googlePage.acceptCookiesIfPresent();
    }

    @When("I set search to random person name")
    public void setSearchRandomPersonName() {
        googlePage.setSearchFieldValue(DBStepsTT.RandomPersonName);

    }

    @Then("Search field contains random person name")
    public void searchFieldWithRandomPersonName() {
        Assert.assertEquals(googlePage.getSearchFieldValue(),
                DBStepsTT.RandomPersonName,
                "Search field expected to contain random person name, but it didn't");

    }
}








