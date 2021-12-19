package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SelectableExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://leafground.com/pages/selectable.html");
        List<WebElement> selectable= driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
        int totalElements=selectable.size();
        System.out.println(totalElements);

       //Actions actions=new Actions(driver);
        //actions.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build().perform();

        Actions actions=new Actions(driver);
        actions.clickAndHold(selectable.get(0));
        actions.clickAndHold(selectable.get(1));
        actions.clickAndHold(selectable.get(2));
        actions.build().perform();
    }
}