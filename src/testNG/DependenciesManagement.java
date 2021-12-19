package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {
    @Test(enabled = true)
     public void serverHealth(){
         System.out.println("server is healthy");
     }
    @Test(dependsOnMethods = "serverHealth")
     public void clickLoginbutton(){
         System.out.println("login button is clicked");
     }
    @Test(dependsOnMethods = "clickLoginbutton")
     public void goToHomePage(){
         System.out.println("home page is loaded");
     }
}
