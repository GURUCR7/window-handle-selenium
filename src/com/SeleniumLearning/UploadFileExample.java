package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadFileExample {

    public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/upload.html");
        WebElement browseButton= driver.findElement(By.name("filename"));
        browseButton.click();

        String file="C:\\Users\\gurur\\Downloads\\jar_files";

        StringSelection selection=new StringSelection(file);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);

        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);






    }
}