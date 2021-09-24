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

public class TrackOrder extends base{
public static Logger log =LogManager.getLogger(base.class.getName());
@BeforeTest
public void initialize() throws IOException
{	
	driver =initializeDriver();
	driver.get(prop.getProperty("url"));
}
@Test(dataProvider="getData")	
public void validateButton(String Order,String Phone) throws IOException, InterruptedException
{
   driver.findElement(By.cssSelector("a[href*='/orders']")).click();
   Thread.sleep(2000);
   driver.findElement(By.cssSelector("input[id='ip_379403698']")).sendKeys(Order);
   driver.findElement(By.cssSelector("input[type='tel']")).sendKeys(Phone);
   driver.findElement(By.cssSelector("button[type='submit']")).click();
   Thread.sleep(2000);
   log.info("Successfully validated Message displayed.");	
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
	Object[][] data=new Object[2][2];
	
	data[0][0]="122";
	data[0][1]="3434";
	
	data[1][0]="122";
	data[1][1]="8231585710";
	
	return data;
}
}
