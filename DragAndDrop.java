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
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement image = driver.findElement(By.id("image"));

        WebElement box = driver.findElement(By.id("box"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(image, box).build().perform();


        driver.quit();
    }
}
