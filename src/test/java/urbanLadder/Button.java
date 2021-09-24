package urbanLadder;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import junit.framework.Assert;
import resources.base;

public class Button extends base{
public static Logger log =LogManager.getLogger(base.class.getName());
@BeforeTest
public void initialize() throws IOException
{
	driver =initializeDriver();
	driver.get(prop.getProperty("url"));
}
@Test
public void CustStory() throws IOException, InterruptedException
{	
	driver.findElement(By.cssSelector("a[href*='/reviews-testimonials?src=g_custstorwdgt']")).click();
	Thread.sleep(2000);
	Assert.assertEquals("Reviews & Testimonials | urbanladder.com", driver.getTitle());
	log.info("Successfully validated Heading displayed.");	
	System.out.println("Test completed.");
}
@AfterTest
public void teardown()
{	
	driver.close();
	driver=null;		
}

}