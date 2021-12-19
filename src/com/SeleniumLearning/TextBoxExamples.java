package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxExamples {
    public static void main(String[]args){
        System.setProperty("webdriver.gecko.driver","E://folder\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/Edit.html");

        WebElement emailbox= driver.findElement(By.id("email"));
        emailbox.sendKeys("guru@gmail.com");

        WebElement textbox=  driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input"));
        textbox.sendKeys("text");

        WebElement attributebox=driver.findElement(By.name("username"));
        String value=attributebox.getAttribute("value");

        System.out.println(value);

        WebElement clearbox=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input"));
        clearbox.clear();

        WebElement disabledbox=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input"));
        boolean enabled=disabledbox.isEnabled();

        System.out.println(enabled);




    }
}
