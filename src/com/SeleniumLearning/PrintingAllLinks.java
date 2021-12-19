package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class PrintingAllLinks {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.co.in/");
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("ronaldo" + Keys.ENTER);
        Thread.sleep(3000);

        List<WebElement> totalLinks= driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite"));

        for (WebElement linksPrinting:totalLinks){
            System.out.println(linksPrinting.getText());

        }
    }
}