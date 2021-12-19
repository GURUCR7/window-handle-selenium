package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class FramesOperation {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/frame.html");

        driver.switchTo().frame(0);
        WebElement clickButton=driver.findElement(By.id("Click"));
        clickButton.click();

        String text=driver.findElement(By.id("Click")).getText();
        System.out.println("the text is : " +text);

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        driver.switchTo().frame("frame2");

        WebElement nextClick= driver.findElement(By.id("Click1"));
        nextClick.click();

        String text1=driver.findElement(By.id("Click1")).getText();
        System.out.println("text 2 is : " + text1);

        driver.switchTo().defaultContent();
       List<WebElement> totalNoOfFrames =driver.findElements(By.tagName("iframe"));
         int frames=totalNoOfFrames.size();
        System.out.println("total frames : " + frames);




    }
}