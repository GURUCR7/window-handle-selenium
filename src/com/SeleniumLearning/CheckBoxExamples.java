package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxExamples {
    public static void main(String[]args){
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/checkbox.html");

        WebElement javaButton= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[1]/input"));
        javaButton.click();

        WebElement isChecked= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/input"));
        boolean selected=isChecked.isSelected();
        System.out.println(selected);

        WebElement firstElement=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[1]/input"));
        if (firstElement.isSelected()) {
            firstElement.click();
        }
        WebElement secondElement=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[2]/input"));
        if (secondElement.isSelected()){
            secondElement.click();
        }
        }
    }

