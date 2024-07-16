
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class DemoApplication {
    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Actions actions = new Actions(driver);

        driver.get("https://magento.softwaretestingboard.com/");

        WebElement search = driver.findElement(By.id("search"));

        search.click();
        search.sendKeys("Shoes");

        driver.findElement(By.cssSelector("[type=submit]")).click();

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(scrFile, new File("./screenshots/image.png"));
//        TakesScreenshot screenshot = (TakesScreenshot) driver;
//        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
//        File destinationFile = new File("image.png");
//        try {
//
//            FileUtils.copyFile(screenshotFile, destinationFile);
//        } catch (IOException e) {
//            throw new RuntimeException(e);

            wait.until((d) ->
                    d.findElement(By.cssSelector("[data-ui-id=\"page-title-wrapper\"]")));

            WebElement title =
                    driver.findElement(By.cssSelector("[data-ui-id=\"page-title-wrapper\"]"));
            if (title.getText().contains("Shoes")) {
                System.out.println("It contains Shoes");
            } else {
                System.out.println("It does not contains Shoes");
            }

            wait.until((d) -> d.findElement(By.id("ui-id-5")));
            actions.moveToElement(driver.findElement(By.id("ui-id-5"))).perform();

            wait.until((d) -> d.findElement(By.id("ui-id-17")));
            actions.moveToElement(driver.findElement(By.id("ui-id-17"))).perform();

            wait.until((d) -> d.findElement(By.id("ui-id-20")));
            driver.findElement(By.id("ui-id-20")).click();

            driver.get("https://magento.softwaretestingboard.com/");
            WebElement btnTees = driver.findElement(By.className("home-t-shirts"));
            actions.scrollToElement(btnTees);
            btnTees.click();
        }
    }



