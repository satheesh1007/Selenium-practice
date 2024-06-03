import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseScrollTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement checkbox = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_25']"));
        Actions action = new Actions(driver);
        action.scrollToElement(checkbox).build().perform();

        action.click(checkbox).build().perform();



    }

}
