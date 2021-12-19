package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class AutoCompleteExamples {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://leafground.com/pages/autoComplete.html");

        WebElement textBox = driver.findElement(By.id("tags"));
        textBox.sendKeys("s");
        Thread.sleep(4000);

        List<WebElement> optionList = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));

        for (WebElement webelement : optionList) {
            if (webelement.getText().equals("Web Services")) {
                webelement.click();
            }


        }
    }
}