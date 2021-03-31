package Selenium_EssT;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();


        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        // We want to get the window handles for the two tabs that are open
        String originalHandle = driver.getWindowHandle();

        // Loop iterates through handles
        for(String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }

        // Switch to the handle for the tab that was opened originally
        driver.switchTo().window(originalHandle);

//        driver.quit();

    }
}
