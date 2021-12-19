package com.SeleniumLearning;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownExample {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/Dropdown.html");

        WebElement dropDown1= driver.findElement(By.id("dropdown1"));
        Select select=new Select(dropDown1);

        select.selectByIndex(1);

        Thread.sleep(3000);

        select.selectByValue("2");

        Thread.sleep(3000);

        select.selectByVisibleText("Selenium");

        List<WebElement> noOfOptions = select.getOptions();
        int numbers = noOfOptions.size();
        System.out.println("no of dropdown options are" + numbers);

        dropDown1.sendKeys("Loadrunner");

        WebElement multiSelect=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[6]/select"));
        Select multiSelectBox=new Select(multiSelect);
        multiSelectBox.selectByIndex(1);
        multiSelectBox.selectByIndex(2);
        multiSelectBox.selectByIndex(3);
        multiSelectBox.selectByIndex(4);

    }
}
