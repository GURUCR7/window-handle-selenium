package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtenExamples {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/Button.html");

        WebElement getPosition=driver.findElement(By.id("position"));
        Point xypoint=getPosition.getLocation();
        int xvalue=xypoint.getX();
        int yvalue=xypoint.getY();
        System.out.println("xvalue is:"+xvalue);
        System.out.println("yvalue is:" +yvalue);

        WebElement getColour= driver.findElement(By.id("color"));
        String color= getColour.getCssValue("background-color");
        System.out.println("the color is:" +color);

        WebElement getDimensions= driver.findElement(By.id("size"));
        int height=getDimensions.getSize().getHeight();
        int width=getDimensions.getSize().getWidth();
        System.out.println("height is:"+height);
        System.out.println("width is:"+width);

        WebElement homePage= driver.findElement(By.id("home"));
        homePage.click();


    }
}