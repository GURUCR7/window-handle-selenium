package com.SeleniumLearning;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class EnterSearchBoxWithoutFindElement {
static WebElement q;
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.co.in/");

        PageFactory.initElements(driver,EnterSearchBoxWithoutFindElement.class);

       //driver.switchTo().activeElement().sendKeys("ronaldo" + Keys.ENTER);
        q.sendKeys("ronaldo" + Keys.ENTER);

    }
}