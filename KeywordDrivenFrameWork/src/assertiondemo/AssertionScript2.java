package assertiondemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScript2 {

	
	@Test
	public void test1(){
		
		String mystring = "lokesh";
		Assert.assertTrue(mystring.contains("lokesh"),"name matched");
	}
	
	@Test
	public void test2(){
		
		String mystring = "lokesh";
		Assert.assertTrue(mystring.contains("spandana"),"there are couples");
		
	}
	
}
