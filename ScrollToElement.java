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


public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));

        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Dumbo");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("03/29/21");

        Thread.sleep(1000);

        driver.quit();
    }

}
