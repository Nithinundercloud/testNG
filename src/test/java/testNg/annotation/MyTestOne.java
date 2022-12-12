package testNg.annotation;

import org.testng.Assert;
import org.testng.annotations.Test;
public class MyTestOne {
	
	@Test
	@RetryCountfailed(3)
	public void testone() {	
		System.out.println("Hi");
		Assert.assertEquals(true, true);
	}
	
	
	@Test
	public void testwo() {	
		Assert.assertEquals(true, true);
	}

}
