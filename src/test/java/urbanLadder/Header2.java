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

public class Header2 extends base{
public static Logger log =LogManager.getLogger(base.class.getName());
@BeforeTest
public void initialize() throws IOException
{
    driver =initializeDriver();		
    driver.get(prop.getProperty("url"));
}
@Test	
public void validateAddress() throws IOException, InterruptedException
{
    driver.findElement(By.cssSelector("span[class='topnav_itemname']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("a[href*='/furniture-stores/mumbai?src=g_topnav_sale_stores_mumbai']")).click();
    Thread.sleep(2000);
    Assert.assertEquals("Bandra, Mumbai",driver.findElement(By.cssSelector("h3[class='_3JJeW']")).getText());
    log.info("Successfully validated Site displayed.");
	System.out.println("Test completed.");
}	
@AfterTest
public void teardown()
{		
	driver.close();
	driver=null;	
}	
}
