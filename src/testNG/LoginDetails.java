package testNG;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginDetails {
    WebDriver driver;
    String[][] loginData=null;

    @DataProvider(name = "login details")
    public Object[][] loginDataProvider() throws BiffException, IOException {
    loginData= (String[][]) getExcelData();
        return loginData;
    }


    public Object[][] getExcelData() throws IOException, BiffException {

        FileInputStream excel=new FileInputStream("E:\\New folder\\TestData.xls");
        Workbook workbook=Workbook.getWorkbook(excel);
        Sheet sheet= workbook.getSheet(0);
        int rowCount=sheet.getRows();
        int columnCount=sheet.getColumns();
        String testData[][]=new String[rowCount-1][columnCount];

        for (int i=1; i<rowCount;i++){
            for (int j=0; j<columnCount;j++){
                testData[i-1][j]= sheet.getCell(j,i).getContents();
            }
        }
        return testData;

    }
@BeforeTest
    public void firstExecution(){
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        driver = new FirefoxDriver();
    }


 @Test(dataProvider = "login details")
 public void correctBoth(String usrName,String password){

    driver.get("https://opensource-demo.orangehrmlive.com/");

    WebElement userName = driver.findElement(By.id("txtUsername"));
    userName.sendKeys(usrName);

    WebElement passwordButton = driver.findElement(By.id("txtPassword"));
    passwordButton.sendKeys(password);

    WebElement loginButton = driver.findElement(By.id("btnLogin"));
    loginButton.click();

}


@AfterTest
public void lastExecution(){
        driver.quit();
}
}

