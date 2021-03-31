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


public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();

        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
        autocompleteItem.click();

        Thread.sleep(1000);

        driver.quit();
    }
}
