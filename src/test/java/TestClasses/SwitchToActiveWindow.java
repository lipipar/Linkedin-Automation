package TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement newtabButton = driver.findElement(By.id("new-tab-button"));
        newtabButton.click();

        String originalWindowHandle = driver.getWindowHandle();
        //System.out.println(originalWindowHandle);


        for(String handle1: driver.getWindowHandles())
        {
            driver.switchTo().window(handle1);
        }
          driver.switchTo().window(originalWindowHandle);
        driver.quit();

    }
}
