package TestngListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenerdemo implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("test case started and details are"+result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case susccess and details are"+result.getName());	
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("test case failed and details are"+result.getName());
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("test case skipped and details are"+result.getName());
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	public void onStart(ITestContext context) {
		
	}
	public void onFinish(ITestContext context) {
			
	}

}
