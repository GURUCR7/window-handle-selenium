package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalanderExamples {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/Calendar.html");
//a[@title='Next']
        WebElement calander= driver.findElement(By.id("datepicker"));
        calander.click();

        WebElement nextButton=driver.findElement(By.xpath("//a[@title='Next']"));
        nextButton.click();

        WebElement dateButton=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/a"));
        dateButton.click();

    }
}