package org.example.pages;

import org.example.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class SearchResultPage extends BasePage {
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    String searchInputBox = "search-input";

    String searchOutputList = "//li[contains(@class, 'search-result-item')]/a";

    public void searchFor(String search) {
        WebElement searchInput = driver.findElement(By.id(searchInputBox));
        searchInput.sendKeys(search);
    }

    public void open10thResult() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.of(2, ChronoUnit.SECONDS));
        List<WebElement> searchResults = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(searchOutputList)));
        if (searchResults.size() >= 10) {
            searchResults.get(9).click();
        }
    }
}
