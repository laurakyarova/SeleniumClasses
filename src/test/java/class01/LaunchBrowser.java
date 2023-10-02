package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumOptions;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        //declare the instance of WebDriver
        WebDriver driver=new ChromeDriver();

        //use driver.get() method
        driver.get("https://www.google.com");

        //maximize ur window
        driver.manage().window().maximize();

        //get the url of the website
        String currentUrl=driver.getCurrentUrl();
        System.out.println("the current Url is:"+currentUrl);

        //get title
        String title= driver.getTitle();
        System.out.println("the title of the page is "+title);

        //added a wait for 2 seconds to slow the coding of window
        Thread.sleep(2000);

        //close the browser
        driver.quit();
    }
}
