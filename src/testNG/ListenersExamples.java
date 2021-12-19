package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersExamples implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("test is started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("test is succeded");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("test has failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("test is skipped");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("before start");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("test is finished");
    }
}
