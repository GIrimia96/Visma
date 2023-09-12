package org.example.pages;

import org.example.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    String resourceButton = "//button/span[contains(text(), 'Resources')]";
    String startHereButton = "//p[contains(text(), 'Start here')]//span";
    String pricingButton = "//a[contains(@href, 'pricing')]";

    public void navigateToHomePage(String url) {
        driver.get(url);
    }

    public void navigateToResources() {
        driver.findElement(By.xpath(resourceButton)).click();
    }

    public void navigateToStartHere() {
       // waitForElementToBeVisible(startHereButton);
        driver.findElement(By.xpath(startHereButton)).click();
    }

    public void navigateToPricing() {
        driver.findElement(By.xpath(pricingButton)).click();
    }
}