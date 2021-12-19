package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageExamples {
    public static void main(String[]args){
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/Image.html");

        WebElement brokenImage= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/img"));

        if (brokenImage.getAttribute("naturalWidth").equals("0")){
            System.out.println("it is a broken image");

        }else {
            System.out.println("it is not a broken image");
        }
    }
}
