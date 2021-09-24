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

public class Link1 extends base{
public static Logger log =LogManager.getLogger(base.class.getName());
@BeforeTest
public void initialize() throws IOException
{	
	driver =initializeDriver();
	driver.get(prop.getProperty("url"));
}

@Test
public void validateOption()
{
    driver.findElement(By.cssSelector("a[href*='/help/contact-us?src=g_footer']")).click();
    Assert.assertEquals("Contact Us", driver.findElement(By.cssSelector("span[class='entries-title']")).getText());
    log.info("Successfully validated Webpage displayed.");
	System.out.println("Test completed.");
}
@AfterTest
public void teardown()
{
	driver.close();
	driver=null;
}
}
