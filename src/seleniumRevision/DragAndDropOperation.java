package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperation {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/drop.html");
        WebElement from= driver.findElement(By.id("draggable"));
        WebElement to= driver.findElement(By.id("droppable"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(from,to).build().perform();
    }
}