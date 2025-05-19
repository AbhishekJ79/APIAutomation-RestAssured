 package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

public class testListeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        // Code to execute when a test starts
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Code to execute when a test succeeds
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Code to execute when a test fails
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Code to execute when a test is skipped
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Optional: implement if needed
    }

    @Override
    public void onStart(ITestContext context) {
        // Optional: implement if needed
    }

    @Override
    public void onFinish(ITestContext context) {
        // Optional: implement if needed
    }
}