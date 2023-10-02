package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/input-form-locator.php");
        driver.manage().window().maximize();

        //locate the webElement first name
        WebElement firstName=driver.findElement(By.id("first_name"));
        //use send keys to send the data to webElement
        firstName.sendKeys("Laura");
        //locate the webelement
        WebElement lastName=driver.findElement(By.name("last_name"));
        lastName.sendKeys("Kyarova");

        WebElement email=driver.findElement(By.className("form-control-01"));
        email.sendKeys("laurakyarova@gmail.com");

        Thread.sleep(2000);
        WebElement submitBtn=driver.findElement(By.tagName("button"));
        submitBtn.click();

        //locate the webelement link
        WebElement linkBtn=driver.findElement(By.linkText("Link"));
        linkBtn.click();


    }
}
