package seleniumbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations 
{
	
	@Test
	public void sampleTest()
	{
		System.out.println("This is a sample method ");
	}
	@BeforeMethod
	public void sampleBeforeMethod()
	{
		System.out.println("This is a sample Before method ");
	}
	@AfterMethod
	public void sampleAfterMethod()
	{
		System.out.println("This is a sample After method ");
	}
	
	@BeforeClass
	public void sampleBeforeClass()
	{
		System.out.println("This is a sample Before Class ");
	}
	
	@AfterClass
	public void sampleAfterClass()
	{
		System.out.println("This is a sample After Class ");
	}
	
	@BeforeTest
	public void sampleBeforeTest()
	{
		System.out.println("This is a sample Before Test ");
	}
	
	@AfterTest
	public void sampleAfterTest()
	{
		System.out.println("This is a sample After Test ");
	}
	
	@BeforeSuite
	public void sampleBeforeSuite()
	{
		System.out.println("This is a sample Before Suite ");
	}
	
	@AfterSuite
	public void sampleAfterSuite()
	{
		System.out.println("This is a sample After Suite ");
	}
	
	
	
	
		
	}
	
	
	


