package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class AdvancedLinkExamples {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://www.leafground.com/pages/Link.html");

        WebElement homeLink = driver.findElement(By.linkText("Go to Home Page"));
        homeLink.click();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(1000);

        WebElement whereToGo = driver.findElement(By.partialLinkText("supposed to go without clicking me?"));
        String target = whereToGo.getAttribute("href");
        System.out.println("target locati0n : " + target);

        Thread.sleep(1000);

        WebElement brokenLink = driver.findElement(By.linkText("Verify am I broken?"));
        brokenLink.click();
        String title = driver.getTitle();

        if (title.contains("404")) {
            System.out.println("the link is broken link");
        }

        Thread.sleep(1000);

        driver.navigate().back();
         Thread.sleep(1000);
        WebElement homePageLink1= driver.findElement(By.linkText("Go to Home Page"));
        homePageLink1.click();
        Thread.sleep(1000);
        driver.navigate().back();

        List<WebElement> noOfElements=driver.findElements(By.tagName("a"));
        int noOfLinks=noOfElements.size();
        System.out.println("Total number of links are: " + noOfLinks);
    }

}