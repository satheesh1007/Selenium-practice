import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        //From
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Adampur (AIP)']")).click();
        //To
        driver.findElement(By.xpath("(//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT'])[1]")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Chennai (MAA)']")).click();

       // driver.quit();
    }

}
