package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTesting {

    @Test
    public void openGoogle(){

        System.setProperty("webdriver.gecko.driver" , "E://folder\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.co.in");
    }
    @Test
    public void openBingo(){
        System.setProperty("webdriver.gecko.driver" , "E://folder\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.bingo.com");
    }
}
