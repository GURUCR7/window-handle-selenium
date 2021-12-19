package com.TestCase;

import com.PageObjects.LoginPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginTestCase {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.phptravels.net/login");
        PageFactory.initElements(driver,LoginPageObjects.class);


        LoginPageObjects.userName.sendKeys("agent@phptravels");
        LoginPageObjects.password.sendKeys("demoagent");
        LoginPageObjects.loginButton.click();






    }
}












