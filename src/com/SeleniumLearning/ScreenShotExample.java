package com.SeleniumLearning;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenShotExample {

    public static void main(String[] args) throws InterruptedException, IOException, AWTException {

        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);

      //  TakesScreenshot screenshot= (TakesScreenshot) driver;
        //File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
        //File destinationFile=new File("E://image.png");
        //FileHandler.copy(sourceFile,destinationFile);

        Robot robot=new Robot();
        Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle=new Rectangle(screenSize);
        BufferedImage source=robot.createScreenCapture(rectangle);

        File destinationFile=new File("E://robot.png");
        ImageIO.write(source,"png",destinationFile);
    }
}