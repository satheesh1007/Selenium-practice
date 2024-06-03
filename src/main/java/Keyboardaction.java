import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Keyboardaction {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement checkboxdown = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_25']"));
       // checkboxdown.sendKeys(Keys.DOWN);
       // checkboxdown.sendKeys(Keys.END);
         // checkboxdown.sendKeys(Keys.PAGE_DOWN);
          checkboxdown.sendKeys(Keys.PAGE_UP);
    }
}
