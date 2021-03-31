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

public class FileUpload {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();


        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileUploadField= driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("/images/nemo.jpg");


//        driver.quit();

    }
}
