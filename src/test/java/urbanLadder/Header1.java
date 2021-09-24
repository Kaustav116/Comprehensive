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

public class Header1 extends base{
public static Logger log =LogManager.getLogger(base.class.getName());
@BeforeTest
public void initialize() throws IOException
{
    driver =initializeDriver();		
    driver.get(prop.getProperty("url"));
}
@Test	
public void validatePage() throws IOException, InterruptedException
{
    driver.findElement(By.cssSelector("span[class='topnav_itemname']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("a[href*='/products-at-30-off-dow?src=g_topnav_sale_promotions_products-at-30-off']")).click();
    Thread.sleep(2000);
    Assert.assertEquals("Products At 30% OFF",driver.findElement(By.cssSelector("h1[class='withsubtext']")).getText());
    log.info("Successfully validated Page displayed.");
	System.out.println("Test completed.");
}	
@AfterTest
public void teardown()
{		
	driver.close();
	driver=null;	
}	
}
