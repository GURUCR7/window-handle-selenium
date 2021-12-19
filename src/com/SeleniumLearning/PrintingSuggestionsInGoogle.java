package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class PrintingSuggestionsInGoogle {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.co.in");

        WebElement enter= driver.findElement(By.name("q"));
        enter.sendKeys("game of thrones");
        Thread.sleep(3000);

        //ul[@role='listbox']//following::li
        List<WebElement> listOfElements=driver.findElements(By.xpath(" //ul[@role='listbox']//following::li"));

        //int position=0;
        for (WebElement printElements:listOfElements){
            String elements=printElements.getText();
            System.out.println("The web elements are : " + elements);
            if (elements.contains("cast")){

                printElements.click();
           // position++;
          //  if (position==3){
              //  printElements.click();
                break;
            }

        }

    }
}