package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExamle {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("laurakyarova@gmail.com");
        WebElement password=driver.findElement(By.name("pass"));
        password.sendKeys("123375klddf");
        WebElement logIn= driver.findElement(By.name("login"));
        //clicks logIn button
        logIn.click();
    }
}
