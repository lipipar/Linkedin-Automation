package TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class CheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");
        List <WebElement> AllCheckboxes =  driver.findElements(By.xpath("//input[@type='checkbox']"));

        int size = AllCheckboxes.size();
        System.out.println(size);


        for(int i = 0; i<size; i++) {

            AllCheckboxes.get(i).click();

        }
        driver.quit();
    }
}
