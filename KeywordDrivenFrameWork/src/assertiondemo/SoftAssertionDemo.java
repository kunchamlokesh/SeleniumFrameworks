package assertiondemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {
	
	@Test
	public void testsoft()
	{
		SoftAssert assertion = new SoftAssert();
		System.out.println("test1 start");
		assertion.assertEquals(12, 13);
		System.out.println("test1 complete");
		assertion.assertAll();
	}


	@Test
	public void testhard()
	{
		
		System.out.println("test2 start");
		Assert.assertEquals(12, 13);
		System.out.println("test2 complete");
	}
}
