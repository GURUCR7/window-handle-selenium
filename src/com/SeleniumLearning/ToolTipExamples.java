package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTipExamples {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://leafground.com/pages/tooltip.html");

        WebElement toolTip=driver.findElement(By.id("age"));
        String toolTipText=toolTip.getAttribute("title");
        System.out.println(toolTipText);


    }
}