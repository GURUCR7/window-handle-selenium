package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonExamples {
    public static void main(String[]args){
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/radio.html");

        WebElement clickNo= driver.findElement(By.id("no"));
        clickNo.click();

        WebElement checkedBox= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[3]/input"));
        WebElement unCheckedBox=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[2]/input"));
        boolean status1=checkedBox.isSelected();
        boolean status2=unCheckedBox.isSelected();
        System.out.println(status1);
        System.out.println(status2);

        WebElement clickage=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[3]"));
        clickage.click();

    }


}
