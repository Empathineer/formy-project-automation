package Selenium_EssT;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException  {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();

        // Changes driver's focus to the alert message
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();

//        driver.quit();

    }
}
