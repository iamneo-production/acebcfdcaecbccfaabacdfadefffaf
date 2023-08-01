package features.stepdefinitions;

public class SearchSteps {
    
}
package com.yourcompany.stepdefinitions;

import com.yourcompany.pageobjects.HomePage;
import com.yourcompany.utils.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SearchSteps {
    private WebDriver driver;
    private HomePage homePage;

    @Given("I am on the Wikipedia homepage")
    public void iAmOnTheWikipediaHomepage() {
        driver = WebDriverFactory.getWebDriver("chrome"); // or read browser choice from properties file
        homePage = new HomePage(driver);
        homePage.openHomePage("https://en.wikipedia.org/");
    }

    @When("I search for {string}")
    public void iSearchFor(String searchTerm) {
        homePage.searchFor(searchTerm);
    }

    @Then("I see search results for {string}")
    public void iSeeSearchResultsFor(String searchTerm) {
        String pageTitle = driver.getTitle();
        Assert.assertTrue("Search results for " + searchTerm + " are shown", pageTitle.contains(searchTerm));
        driver.quit();
    }

    @When("I click on the first link")
    public void iClickOnTheFirstLink() {
        homePage.clickOnFirstLink();
    }

    @Then("I should be redirected to the {string} article")
    public void iShouldBeRedirectedToTheArticle(String articleTitle) {
        String pageTitle = driver.getTitle();
        Assert.assertTrue("The article title should be " + articleTitle, pageTitle.contains(articleTitle));
        driver.quit();
    }
}