package com.yourcompany.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public void searchFor(String searchTerm) {
        driver.findElement(By.name("search")).sendKeys(searchTerm);
        driver.findElement(By.name("go")).click();
    }

    public void clickOnFirstLink() {
        driver.findElement(By.cssSelector("h1#firstHeading a")).click();
    }
}