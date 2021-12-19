package testNG;

import org.testng.annotations.Test;

public class SkippingTestCase {
    @Test (priority = 0)
    public void startACar(){
        System.out.println("start a car");
    }
    @Test (priority = 1)
    public void putFirstGear(){
        System.out.println("first gear");
    }
    @Test(priority=5,enabled = false)
    public void turnMusic(){
        System.out.println("turn music on");
    }
    @Test (priority=2)
    public void putSecondGear(){
        System.out.println("second gear");
    }
    @Test (priority = 3)
    public void putThirdGear(){
        System.out.println("third gear");
    }
    @Test (priority = 4)
    public void putFourthGear(){
        System.out.println("fourth gear");
    }
}
