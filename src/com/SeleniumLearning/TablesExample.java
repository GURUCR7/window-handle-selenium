package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TablesExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/table.html");

        List<WebElement> columns=driver.findElements(By.tagName("th"));
        int totalColumns=columns.size();
        System.out.println("no of columns is : " + totalColumns);

        List<WebElement> rows=driver.findElements(By.tagName("tr"));
        int totalNumberOfRows= rows.size();
        System.out.println("number of rows is : " + totalNumberOfRows);
//td[normalize-space()='Learn to interact with Elements']//following::td[1]

        WebElement getPercent= driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
        String percent=getPercent.getText();
        System.out.println("the percent is:" + percent);

        List<WebElement> allProgress=driver.findElements(By.xpath("//td[2]"));
        List<Integer> numberList=new ArrayList<Integer>();

        for (WebElement webelement:allProgress){
             String individualValue=webelement.getText().replace("%","");
             numberList.add(Integer.parseInt(individualValue));

        }
        System.out.println("final list :" + numberList);

        int smallValue= Collections.min(numberList);
        System.out.println(smallValue);
        String smallValueString = Integer.toString(smallValue);
    }
}