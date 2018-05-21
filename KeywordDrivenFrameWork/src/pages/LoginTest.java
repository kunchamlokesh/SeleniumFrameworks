package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUpMethod(){
		Reporter.log("****Browser setup start******", true);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.whistler.mediavalet.com");
		Reporter.log("****Application Starts******", true);
	}
	@Test
	public void loginToApplication()
	{
		Reporter.log("****Application Login page******", true);
	driver.findElement(By.xpath(".//*[@id='log']")).sendKeys("test@yopmail.com");
	driver.findElement(By.xpath(".//*[@id='pwd']")).sendKeys("Second@123");
	driver.findElement(By.xpath(".//*[@id='login']")).click();
	Reporter.log("****Application stop page******", true);
	
	
	

	}
	
	@AfterMethod
	public void closeApplication(){
		
		driver.quit();
		Reporter.log("****Browser session end******", true);
	}
	}
