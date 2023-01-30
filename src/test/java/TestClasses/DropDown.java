package TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
        dropdown.click();
        WebElement dropdownval2 = driver.findElement(By.linkText("Checkbox"));
        dropdownval2.click();

        driver.quit();

    }
}
