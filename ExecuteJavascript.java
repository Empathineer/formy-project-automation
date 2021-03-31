package Selenium_EssT;
/*
* JS can be useful for the following examples:
* 1 ) WebDriver fails to click on any element
* 2) Trigger Actions on a page
* 3) Perform movement on a page
* */

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecuteJavascript {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        WebElement closeButton = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", closeButton);

        driver.quit();
    }
}
