package Selenium_EssT;

// Test Framework Libraries
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.lang.reflect.Field;
import org.openqa.selenium.interactions.Actions;

// Data Struct Libraries
import java.sql.Struct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Image Libraries
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Retrieves and stores information from Aquatic Experts in a taxonomy structured schema
 * <p>
 * If the field in the {@link com.google.protobuf.Descriptors.Descriptor} exists in the {@link Message}, the value is
 * retrieved and converted using {@link #getFieldValue(Descriptors.FieldDescriptor, Object, DataType)}.
 * Otherwise, the field value is {@code null}.
 * The extraction honors the order of the {@code Descriptor}.
 *
 * @param dsc the Protobuf Descriptor with all fields
 * @param msg the Message with the current field values
 * @param fishSchema the Dataset schema for Saltware fishes
 * @return a list of converted values
 *
 * Methods to consider:
 * - Explicit Waits w/ Expected Conditions
 * - Dropdown Menu selection
 */
public class LocateCSS extends Object {
    public static void main(String[] args) throws InterruptedException{


        WebDriver driver = new FirefoxDriver();

        String baseUrl = "https://aquatic-experts.com/saltwater.html";

        driver.get(baseUrl);

        // Maximize test window
        driver.manage().window().maximize();

        // navigate to the Saltwater
        WebElement fishLink = driver.findElement(By.linkText("FISH"));
        fishLink.click();



        // 2. Retrieve all order names

        // Method 2a. Retrieve order elements by xpath using substring or order suffix "formes"

        // Testing to see if we can retrieve the
//        WebElement firstOrderTag = driver.findElement(By.xpath("/html/body/div[2]/table[3]/tbody/tr[1]/td"));
//        System.out.println(firstOrderTag.getText());

        List <WebElement> orderTags = driver.findElements(By.xpath("//*[text()[contains(.,'formes')]]" ));

        // Iterate through extracted order elements and read innertext 
        for (int i = 0; i < orderTags.size(); i++) {

            WebElement orderTag = orderTags.get(i); // returns a single WebElement
            String orderText = orderTag.getText();

            // Strip any non-alphabets form the string
            orderText = orderText.replaceAll("[^a-zA-Z0-9]", "");

            System.out.println("Order: " + orderText);

            //Get first parent <tbody> tag of this order tag
            // Method a. Returns only immediate parent node us JS
//            WebElement parentJS = (WebElement) ((JavascriptExecutor) driver).executeScript(
//                    "return arguments[0].parentNode;", orderTag);

            // Method b. Returns only immediate parent node via xpath
            WebElement parentXpath = orderTag.findElement(By.xpath(".."));

            // Method c. Walks up DOM tree using JS until it reaches the closest ancestor which is a tbody
//            String selector = "tbody";
            WebElement closestTbody = (WebElement) ((JavascriptExecutor) driver).executeScript(
                    "return arguments[0].closest(\"tbody\");", orderTag);
//
            // Verifying that the order <tbody> tag was retrieved
            System.out.println(closestTbody.getTagName());

            /*
            * TBD: The order in which to extract the image on content within each Order body.
            * */

            // Create a hashmap to store all the images for each order
            HashMap orderTable = new HashMap();

            // Get all child nodes starting from the 5th child under the order <tbody>


            // Extract images within this tbody
            List <WebElement> orderImgs = (List <WebElement>) ((JavascriptExecutor) driver).executeScript(
                    "return arguments[0].getElementsByTagName(\"img\");", closestTbody);

            System.out.println("Family Images:");
            for (WebElement familyImg: orderImgs) {
                String imgSrc = familyImg.getAttribute("src");
                System.out.println(imgSrc);

                // Open image link in new tab and switch back to base url tab
                // Find sibling node with family suffix "-dae".

                // 1) Go up tree to closest ancestor which is a <td> and move laterally to sibling
                WebElement closestTd = (WebElement) ((JavascriptExecutor) driver).executeScript(
                        "return arguments[0].closest(\"td\");", familyImg);

                System.out.println("Closest td tag is: " + closestTd.getLocation());

                // 3) Move laterally to nearest sibling which contains the attribute value or family suffix "-dae"
//                WebElement familyTag = closestTd.findElement(By.xpath("//*[text()[contains(.,'dae')]]" ));
                WebElement familyTag = closestTd.findElement(By.xpath("//*[text()[contains(., 'dae')]]"));
//                WebElement familyTag = closestTd.findElement(By.xpath("//td[contains(text()," + "'dae')]"));
//
//
                String familyText = familyTag.getText();
                System.out.println("Family name: " + familyText);

//                if (families.size() != 0) {
//                    families.get(1).click();
//                } else {
//                    System.out.println("");
//                }

            }




//            // Hold tab handles for each family iteration in an array
//            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//            driver.switchTo().window(tabs.get(1)); //switches to new tab

            // Write image to fish schema image field

            // Create order struct from
        }


        // 3. Get all row elements under 3rd child <tr>. This start depth remains the same for every

//        // We want to get the window handles for the two tabs that are open
//        String originalHandle = driver.getWindowHandle();
//
//        // Loop iterates through handles
//        for(String handle1: driver.getWindowHandles()) {
//            driver.switchTo().window(handle1);
//        }
//
//        // Switch to the handle for the tab that was opened originally
//        driver.switchTo().window(originalHandle);

        driver.quit();

    }
}
