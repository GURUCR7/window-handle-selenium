package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "E:\\folder\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.co.in");



    }
}
