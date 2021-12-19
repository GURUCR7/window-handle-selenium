package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class WindowsOperation {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/Window.html");
        String oldWindow=driver.getWindowHandle();
        WebElement homeButton=driver.findElement(By.id("home"));
        homeButton.click();
        Set<String> allWindows= driver.getWindowHandles();
        for (String newWindow:allWindows){
        driver.switchTo().window(newWindow);
        }

        WebElement editButton=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a"));
        editButton.click();
        driver.close();

        driver.switchTo().window(oldWindow);

        WebElement multipleWindows=driver.findElement(By.xpath("//*[@id=\"home\"]"));
        multipleWindows.click();

        int noOfWindows=driver.getWindowHandles().size();
        System.out.println("no of windows opened : "+noOfWindows);
        WebElement doNotClose=driver.findElement(By.id("color"));
        doNotClose.click();

        Set<String> openedWindow=driver.getWindowHandles();
        for (String manyWindows:openedWindow) {
            if (!manyWindows.equals(oldWindow)) {
                driver.switchTo().window(manyWindows);
                driver.close();
            }
        }
        driver.quit();
    }
}