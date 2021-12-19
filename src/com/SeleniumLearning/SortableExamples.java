package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SortableExamples {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/sortable.html");

        List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));

        WebElement fromElement= elements.get(6);
        WebElement toElement=elements.get(0);

        Actions actions=new Actions(driver);
        actions.clickAndHold(fromElement);
        actions.moveToElement(toElement);
        actions.release(toElement);
        actions.build().perform();
    }
}