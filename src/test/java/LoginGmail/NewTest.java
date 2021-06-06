package LoginGmail;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest extends BaseClass{
	LogingGmail login;
	Compose_Mail compose;

	@BeforeClass
	public void Open_Browser()
	{
		BrowserOpen();
		  System.out.println("---------Browser open successfully------------");
		
	}
	@BeforeMethod
	public void Setup()
	{
		 login=new LogingGmail(driver);
		  compose=new Compose_Mail(driver);

	}
	
	
	@Test
  public void Test_1() throws InvalidFormatException, IOException, InterruptedException {
		
	  System.out.println("---------Test_1------------");
	  login.Login();
	  compose.Login();
		System.out.println("---------  Same Message Received------------");
		System.out.println("---------  Test Done------------");

  }
	@AfterMethod
	public void tearDown() {
		System.out.println("I am closing Browser ");
		driver.quit();
	}

}
