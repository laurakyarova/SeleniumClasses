package review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExample {
    public static void main(String[] args) throws InterruptedException {
        //declare the instance of WebDriver
        WebDriver driver=new ChromeDriver();

        //use driver.get() method
        driver.get("https://www.facebook.com");

        //maximize ur window
        driver.manage().window().maximize();

        //find the button create new account

        WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccount.click();
        Thread.sleep(1000);

        //        fill in the first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));

        firstName.sendKeys("moazzam");
    }
}
