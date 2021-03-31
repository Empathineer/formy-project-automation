package Selenium_EssT;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class KeyboardAndMouseInput {

    @Test
    public void startWebDriver(){
//        System.setProperty("webdriver.chrome.driver", "C:/Users/empat/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");
        driver.manage().window().maximize();

        // Define a new webElement and find the text input element by its name
        WebElement name = driver.findElement(By.id("name"));
        name.click();// click into field to activate it
        name.sendKeys("Carissa Chan");


        WebElement button = driver.findElement(By.id("button"));
        button.click();



        driver.quit();
    }


}
