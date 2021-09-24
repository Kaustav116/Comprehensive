package urbanLadder;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import resources.base;

public class Subscribe extends base{
public static Logger log =LogManager.getLogger(base.class.getName());
@BeforeTest
public void initialize() throws IOException
{	
	driver =initializeDriver();
	driver.get(prop.getProperty("url"));
}
@Test(dataProvider="getData")	
public void validateSubs(String Mail) throws IOException, InterruptedException
{
   driver.findElement(By.cssSelector("input[id='email_id']")).sendKeys(Mail);
   driver.findElement(By.cssSelector("input[value='SUBSCRIBE']")).click();
   Thread.sleep(2000);
   log.info("Successfully validated Line displayed.");	
   System.out.println("Test completed.");
}
@AfterTest
public void teardown()
{
	driver.close();
	driver=null;
}
@DataProvider
public Object[][] getData()
{
	Object[][] data=new Object[2][1];
	
	data[0][0]="abc@gmail.com";
	
	data[1][0]="xyz";
	
	return data;
}
}
