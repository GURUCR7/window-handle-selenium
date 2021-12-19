package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
    @Test(groups = {"apple"})
    public void applePhone1(){
        System.out.println("apple phone 1");
    }

    @Test(groups = {"apple"})
    public void applePhone2(){
        System.out.println("apple phone 2");
    }

    @Test(groups = {"vivo"})
    public void vivoPhone1(){
        System.out.println("vivo phone 1 ");
    }
    @Test(groups = {"vivo"})
    public void vivoPhone2(){
        System.out.println("vivo phone 2 ");
    }
    @Test(groups = {"samsung"})
    public void samsungPhone1(){
        System.out.println("samsung phone 1");
    }
    @Test(groups = {"samsung"})
    public void samsungPhone2(){
        System.out.println("samsung phone 2");
    }
    @Test(groups = {"xiaomi"})
    public void xiaomiPhone1(){
        System.out.println("xiaomi phone 1");
    }
    @Test(groups = {"xiaomi"})
    public void xiaomiPhone2(){
        System.out.println("xiaomi phone 2");
    }
}
