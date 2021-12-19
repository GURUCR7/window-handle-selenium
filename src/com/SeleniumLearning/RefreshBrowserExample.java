package com.SeleniumLearning;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.tools.JavaFileManager;
import java.awt.*;
import java.awt.event.KeyEvent;

public class RefreshBrowserExample {

    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.amazon.in/");
        Thread.sleep(3000);
        //driver.navigate().refresh();
        //using Robot class

        //Robot robot=new Robot();
        //robot.keyPress(KeyEvent.VK_F5);
        //robot.keyRelease(KeyEvent.VK_F5);

        //using java script executor
        JavascriptExecutor executor= (JavascriptExecutor) driver;
        executor.executeScript("history.go(0)");


    }
}