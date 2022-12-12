package testNg.annotation;

import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{	

	int counter=0;
	
	
	@Override
	public boolean retry(ITestResult result) {
		
		
		// TODO Auto-generated method stub
		RetryCountfailed annotation = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(RetryCountfailed.class);
		result.getTestContext().getSkippedTests().removeResult(result.getMethod());
		
		if((annotation!=null)&& (counter<annotation.value())) {
			
			counter++;
			return true;
		}
		return false;
	}
	

}
