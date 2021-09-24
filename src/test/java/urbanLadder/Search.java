package urbanLadder;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import junit.framework.Assert;
import resources.base;

public class Search extends base{
public static Logger log =LogManager.getLogger(base.class.getName());
@BeforeTest
public void initialize() throws IOException
{
	driver =initializeDriver();
	log.info("Driver initialized.");	
	driver.get(prop.getProperty("url"));
	log.info("Navigated to Homepage.");
}
@Test
public void homePageNavigation() throws IOException, InterruptedException
{	
	WebElement move=driver.findElement(By.id("search"));
    move.clear();
    move.sendKeys("ch");
    Thread.sleep(2000);
    move.sendKeys(Keys.ARROW_DOWN);
    move.sendKeys(Keys.ENTER);
    Thread.sleep(2000);
    Assert.assertEquals("Search Results For 'Chair'",driver.findElement(By.cssSelector("h2[class='withsubtext']")).getText());
	log.info("Successfully validated Text displayed.");	
	System.out.println("Test completed.");
}
@AfterTest
public void teardown()
{	
	driver.close();
	driver=null;		
}
}
