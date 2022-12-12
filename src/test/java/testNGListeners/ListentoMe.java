package testNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListentoMe implements ITestListener{
	
	public void onStart(ITestContext con) {
		System.out.println("OnStart()!!" + con.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		if(!result.isSuccess())
			System.out.println("onTestFailure!!"+ result.getMethod());
	}
	
	public void onFinish(ITestContext result) {
		System.out.println("OnFinish!!");
	} 
}
