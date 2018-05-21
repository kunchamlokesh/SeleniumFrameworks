package assertiondemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScript {

	
	@Test
	public void test1(){
		
		System.out.println("test 1 started");
		Assert.assertEquals(12, 13);
		System.out.println("test 1 completed");
	}
	
	@Test
	public void test2(){
		System.out.println("test 2 started");
		Assert.assertEquals(12, 13, "please contatc developer");
		System.out.println("test 2 completed");
	}
	
	@Test
	public void test3(){
		
		System.out.println("test 3 started");
		Assert.assertEquals("Hello", "Hello", "please contatc developer");
		System.out.println("test 3 complted");
	}
}
