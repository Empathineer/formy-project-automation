package Selenium_EssT;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.reflect.Field;
import org.openqa.selenium.interactions.Actions;
import java.util.List;


public class DatePickers {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("04/01/20");
        dateField.sendKeys(Keys.RETURN);

        driver.quit();
    }
}
