package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utill.DriverConnection;

public class MyTestListener implements ITestListener {

	DriverConnection con = new DriverConnection();
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("test start");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("test Passed");
		
	}

	int count = 0;
	@Override
	public void onTestFailure(ITestResult result) {
		
		
		con.getScreenShot(result.getInstance()+"_"+result.getName()+"_"+count);
		count++;
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
