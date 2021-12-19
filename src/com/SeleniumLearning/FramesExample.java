package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class FramesExample {
    public static void main(String[]args){
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://leafground.com/pages/frame.html");
        driver.switchTo().frame(0);

        WebElement clickMeButton= driver.findElement(By.id("Click"));
        clickMeButton.click();
        String text=clickMeButton.getText();
        System.out.println(text);

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        driver.switchTo().frame("frame2");
        WebElement button2= driver.findElement(By.id("Click1"));
        button2.click();

        driver.switchTo().defaultContent();

        List<WebElement> totalNoOfFrames=driver.findElements(By.tagName("iframe"));
        int frames=totalNoOfFrames.size();
        System.out.println(frames);
    }
}
