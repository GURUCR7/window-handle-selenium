package com.TestCase;

import com.PageObjects.LoginPageObjects;
import com.PageObjects.UpdateProfilePageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class UpdateProfile {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "E://folder\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.phptravels.net/login");

        PageFactory.initElements(driver,LoginPageObjects.class);

        LoginPageObjects.userName.sendKeys("agent@phptravels");
        LoginPageObjects.password.sendKeys("demoagent");
        LoginPageObjects.loginButton.click();

        PageFactory.initElements(driver,UpdateProfilePageObjects.class);

        UpdateProfilePageObjects.myProfile.click();
        UpdateProfilePageObjects.phoneNumber.sendKeys("1234567890");
        UpdateProfilePageObjects.city.sendKeys("winterfell");
        UpdateProfilePageObjects.updateProfile.click();









    }
}









        /*WebElement userName = driver.findElement(By.name("email"));
        userName.sendKeys("agent@phptravels.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("demoagent");

        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button/span[1]"));
        loginButton.click();

        WebElement myProfile=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/ul/li[4]/a"));
        myProfile.click();

        WebElement phoneNumber=driver.findElement(By.name("phone"));
        phoneNumber.sendKeys("1234567890");

        WebElement city=driver.findElement(By.name("city"));
        city.sendKeys("winterfell");

        WebElement updateProfile=driver.findElement(By.xpath("/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button"));
        updateProfile.click();


    }
}*/