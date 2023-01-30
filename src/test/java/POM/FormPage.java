package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import TestClasses.Form;

public class FormPage {
    public static void submitform(WebDriver driver)
    {
        driver.findElement(By.id("first-name")).sendKeys("Lipi");
        driver.findElement(By.id("last-name")).sendKeys("Parikh");
        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
        driver.findElement((By.id("radio-button-1"))).click();
        driver.findElement(By.id("checkbox-2")).click();
        Select dropdwn = new Select(driver.findElement(By.id("select-menu")));
        dropdwn.selectByIndex(2);
        driver.findElement(By.id("datepicker")).sendKeys("01/31/2023", Keys.ENTER);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

    }
}
