import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertOperations {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://onlyfullstack.blogspot.com/2020/03/best-demo-website-to-practice-selenium.html#alert-tutorial");
    // Simple Alert
//        driver.findElement(By.xpath("//a[normalize-space()='Simple Alert']")).click();
//        Alert alert = driver.switchTo().alert();
//        String alertText = alert.getText();
//        System.out.println("Alert text =  " + alertText);
//                alert.accept();

    // Confirm Alert
//        driver.findElement(By.xpath("//a[normalize-space()='Confirm Alert']")).click();
//        Alert confirmAlert = driver.switchTo().alert();
//        String confirmAlertText = confirmAlert.getText();
//        System.out.println("Confirm Alert text = " + confirmAlertText);
//        confirmAlert.dismiss();

    //promptAlert
        driver.findElement(By.xpath("//a[normalize-space()='Prompt Alert']")).click();
        Alert promptAlert = driver.switchTo().alert();
        String promptAlertText = promptAlert.getText();
        System.out.println("Prompt Alert text = " + promptAlertText);
        promptAlert.accept();


    }
}
