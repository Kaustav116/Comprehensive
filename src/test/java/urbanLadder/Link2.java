package urbanLadder;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import junit.framework.Assert;
import resources.base;

public class Link2 extends base{
public static Logger log =LogManager.getLogger(base.class.getName());
@BeforeTest
public void initialize() throws IOException
{	
	driver =initializeDriver();
	driver.get(prop.getProperty("url"));
}

@Test
public void validateTitle() throws InterruptedException
{
    driver.findElement(By.cssSelector("a[href*='/help/contact-us?src=g_footer']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("a[href*='https://www.youtube.com/user/urbanladder']")).click();
    Thread.sleep(2000);
    Set<String>ids=driver.getWindowHandles();
    Iterator<String> it=ids.iterator();
    String parentid=it.next();
    String childid=it.next();
    driver.switchTo().window(childid);
    Thread.sleep(2000);
    Assert.assertEquals("Urban Ladder - YouTube", driver.getTitle());
	log.info("Successfully validated Page title displayed.");	
	System.out.println("Test completed.");
}
@AfterTest
public void teardown()
{
	driver.quit();
}
}
