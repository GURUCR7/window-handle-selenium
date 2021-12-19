package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Selectable {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/selectable.html");

        List<WebElement> clickAndHold=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));

    /*    Actions actions=new Actions(driver);
      actions.keyDown(Keys.CONTROL).click(clickAndHold.get(0)).click(clickAndHold.get(1)).click(clickAndHold.get(2)).
              click(clickAndHold.get(3)).build().perform();
*/

        Actions actions=new Actions(driver);
        actions.clickAndHold(clickAndHold.get(0)).clickAndHold(clickAndHold.get(1)).clickAndHold(clickAndHold.get(2)).clickAndHold(clickAndHold.get(3));
    }
}
