package Selenium_EssT;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));

        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        Thread.sleep(1000);

        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));

        autocompleteResult.click();

        driver.quit();
    }
}
