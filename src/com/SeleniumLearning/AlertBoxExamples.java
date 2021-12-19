package com.SeleniumLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertBoxExamples {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/Alert.html");
        WebElement alertBox= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/button"));
        alertBox.click();
        Alert alert=driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();

        WebElement confirmBox= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
        confirmBox.click();
        Alert confirmAlert=driver.switchTo().alert();
        Thread.sleep(3000);
        confirmAlert.dismiss();
        WebElement promptBox= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/button"));
        promptBox.click();
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("ronaldo");
        Thread.sleep(3000);
        promptAlert.accept();
    }
}
