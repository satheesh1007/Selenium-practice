import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/upload/");
        driver.findElement(By.id("uploadfile_0"))
                .sendKeys("C:\\Users\\user\\IdeaProjects\\Selenium-practice\\uploadfile.txt");

        driver.findElement(By.xpath("//input[@id='terms']"))
                .click();
        driver.findElement(By.xpath("//button[@id='submitbutton']"))
                .click();
        try {
            Thread.sleep(5000);

        }catch (Exception e){}

       // assertEquals(UploadFile.getUploadedFiles(), "chromedriver", "Uploaded files incorrect");

        //assertEquals(UploadFile.getResultMessage(), "UploadFile", "Uploaded files incorrect");
}
}