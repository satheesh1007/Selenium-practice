import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class WindowHandling {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

//        driver.findElement(By.id("newWindowBtn")).click();
//        System.out.println(driver.getTitle());
        //String parentWindowHandle
        String  MultipleWindowHandle = driver.getWindowHandle();
        System.out.println("Parent window handle - "+MultipleWindowHandle + driver.getTitle());
        driver.findElement(By.id("newTabBtn")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if(!windowHandle.equals(MultipleWindowHandle)) {
                driver.switchTo().window(windowHandle);
                System.out.println(driver.findElement(By.id("output")).getText());
                driver.findElement(By.id("alertBox")).click();
                System.out.println(driver.switchTo().alert().getText());
                driver.switchTo().alert().accept();
                System.out.println(driver.findElement(By.id("output")).getText());
                try {
                    Thread.sleep(5000);

                }catch (Exception e){}
                driver.close();
            }
        }

        driver.switchTo().window(MultipleWindowHandle);
        driver.findElement(By.id("name")).sendKeys("Satheesh SK");

        try {
            Thread.sleep(5000);

        }catch (Exception e){}
        driver.quit();


    }
}
