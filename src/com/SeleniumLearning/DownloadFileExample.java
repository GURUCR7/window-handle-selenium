package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class DownloadFileExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/download.html");

        WebElement downloadLink= driver.findElement(By.linkText("Download Excel"));
        downloadLink.click();

        //now we have to locate the file using jave

        File filelocation=new File("C:\\Users\\gurur\\Downloads\\jar_files");
        File[] totalFile = filelocation.listFiles();

        for (File file:totalFile) {
            if (file.getName().equals("json-simple-2.1.2")) {
                System.out.println("file is downloaded");
                break;
            }


        }
    }
}