package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkExample {
    public static void  main(String[]args){
        System.setProperty("webdriver.gecko.driver","E://folder\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/Link.html");
        driver.findElement(By.partialLinkText(" Home Page")).click();
    }
}
