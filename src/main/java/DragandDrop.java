import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
    public static void main(String[] args) {
       WebDriver driver= new ChromeDriver();
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        //Element which needs to drag.
        WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));

        //Element on which need to drop.
        WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));

        //Using Action class for drag and drop.
        Actions act=new Actions(driver);

        //Dragged and dropped.
        act.dragAndDrop(From, To).build().perform();
    }
}
