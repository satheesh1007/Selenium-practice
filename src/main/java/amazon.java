import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class amazon {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.instagram.com/accounts/login/?next=https%3A%2F%2Fwww.instagram.com%2Fterms%2Faccept%2F%3F__coig_login%3D1");

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("satheesh");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Satheesh2000");
        driver.findElement(By.xpath("//button[contains(.,'Log in') and @type='submit']")).click();



    }
}
