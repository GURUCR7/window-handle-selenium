package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class WindowExample {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/Window.html");

        String oldWindow = driver.getWindowHandle();

        WebElement homeButton = driver.findElement(By.id("home"));
        homeButton.click();

        Set<String> noOfWindows = driver.getWindowHandles();
        for (String newWindows : noOfWindows) {
            driver.switchTo().window(newWindows);
        }

        WebElement editButton = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a/img"));
        editButton.click();
        driver.close();

        driver.switchTo().window(oldWindow);

        WebElement multipleButton = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
        multipleButton.click();
        Thread.sleep(3000);

        int totalNoOfWindows = driver.getWindowHandles().size();
        System.out.println("no Of Windows Opened : " + totalNoOfWindows);

        WebElement doNotCloseButton = driver.findElement(By.id("color"));
        doNotCloseButton.click();
        Thread.sleep(3000);

        Set<String> newWindowHandles = driver.getWindowHandles();

        for (String allWindows : newWindowHandles) {
            if (!allWindows.equals(oldWindow)) {
                driver.switchTo().window(allWindows);
                driver.close();
            }

        }

         driver.quit();
    }
    }