package Selenium_EssT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/*
 * Implicit Waits are waits with a specified amount of time before throwing no such element exception.
 * The Default wait time is 0, and it doesn't depend on a certain element state, just time.
 * */


public class ExplicitWait {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));

        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));

        autocompleteResult.click();

        driver.quit();
    }
}
