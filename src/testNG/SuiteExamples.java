package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExamples {

    //open chrome browser
    //googol.co.in
    //yahoo.com
    //close the browser
    WebDriver driver;
    long startTime;
    long endTime;

    @BeforeSuite
    public void openBrowser(){
        startTime=System.currentTimeMillis();
        System.setProperty("webdriver.gecko.driver" , "E://folder\\geckodriver.exe");
        driver=new FirefoxDriver();
    }
    @Test
    public void openGoogle(){
        driver.get("https://www.google.co.in");;
    }
    @Test
    public void openBing() {
        driver.get("https://www.bingo.com");
    }
    @Test
    public void openYahoo(){
        driver.get("https://www.yahoo.com");
    }
    @AfterSuite
    public void closeBrowser(){
        driver.quit();
        endTime=System.currentTimeMillis();
        long totalTime=endTime-startTime;
        System.out.println("total time taken : " + totalTime);
    }


}
