package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/cssSelector.php");
        driver.manage().window().maximize();


        //        fill in the profile id
        WebElement profileID = driver.findElement(By.cssSelector("input[id='profileID']"));
        profileID.sendKeys("moazzamSadiq");

        //fill in the profile name
        WebElement profileName = driver.findElement(By.cssSelector("input#profileBox"));
        profileName.sendKeys("hello");

        //feedback from jenny
        WebElement feedbackJenny = driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
        feedbackJenny.sendKeys("website isn`t working");

        // contains method to fill course topic
        WebElement courseTopics=driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopics.sendKeys("selenium");

        //        using starts with
        WebElement introToAdv = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        introToAdv.sendKeys("welcome");

        //        ends with
        WebElement conclusion = driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("all is good");

    }
}
