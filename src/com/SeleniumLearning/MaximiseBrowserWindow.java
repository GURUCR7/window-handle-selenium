package com.SeleniumLearning;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximiseBrowserWindow {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);
        //driver.manage().window().minimize();
        //Thread.sleep(3000);
        //driver.manage().window().maximize();

        Dimension dimension=new Dimension(640,480);
        driver.manage().window().setSize(dimension);
        Thread.sleep(3000);
        driver.manage().window().maximize();

    }
}