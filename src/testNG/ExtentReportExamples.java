package testNG;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExtentReportExamples {

    WebDriver driver;
    ExtentReports extentReports;
    ExtentSparkReporter sparkReporter;
    ExtentTest testcase;
    @BeforeSuite
    public void firstExecution() {
         extentReports=new ExtentReports();
         sparkReporter=new ExtentSparkReporter("sparkReporter.html");
         extentReports.attachReporter(sparkReporter);
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        driver = new FirefoxDriver();

    }
   @Test
    public void openGoogle() {
        testcase=extentReports.createTest("open google");
        driver.get("http://www.google.co.in");
        String title = driver.getTitle();
        if (title.equals("Google")) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
    }
@Test
    public void openBingo() {
    testcase=extentReports.createTest("open bingo");
        driver.get("http://www.bing.com");
        String title = driver.getTitle();
        if (title.equals("Bing")) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
    }
    @Test
    public void openWikipedia() {
        testcase=extentReports.createTest("open wikipedia");
        driver.get("https:\\www.wikipedia.org");
        String title = driver.getTitle();
        if (title.equals("wikipedia")) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
    }
    @AfterSuite
    public void closeBrowser(){
        driver.quit();
        extentReports.flush();
    }
}