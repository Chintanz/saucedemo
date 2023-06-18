import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Saucedemo {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        //Setup chrome browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        // Maximise Browser
        driver.manage().window().maximize();
        //We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the page title
        String title = driver.getTitle();
        System.out.println("This is the page title: " + title);

        //Print the current URL
        String url = driver.getCurrentUrl();
        System.out.println("Current url: " + url);

        //Print the page source
        System.out.println("Page source" + driver.getPageSource());

        //Enter the username to username field
        driver.findElement(By.name("user-name")).sendKeys("standard_user");

        //Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        //Enter the email to email field
        WebElement loginLink = driver.findElement(By.name("login-button"));
        loginLink.click();

//Close the browser
        driver.close();
    }
}
