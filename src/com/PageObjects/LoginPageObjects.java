package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

    @FindBy(name = "email")
    public static WebElement userName;
    @FindBy(name = "password")
    public static WebElement password;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button/span[1]")
    public static WebElement loginButton;

}

   // public static WebElement userName(WebDriver driver) {
     //   return driver.findElement(By.name("email"));
    //}
    //public static WebElement password(WebDriver driver){
      //  return driver.findElement(By.name("password"));

    //}
    //public static WebElement loginButton(WebDriver driver){
      //  return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button/span[1]"));

    //}
//}
