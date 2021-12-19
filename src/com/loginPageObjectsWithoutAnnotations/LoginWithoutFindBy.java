package com.loginPageObjectsWithoutAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginWithoutFindBy {
    public static WebElement txtUsername;
    public static WebElement txtPassword;
    public static WebElement btnLogin;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        PageFactory.initElements(driver,LoginWithoutFindBy.class);
        txtUsername.sendKeys("Admin");
        txtPassword.sendKeys("admin123");
        btnLogin.click();

    }
}