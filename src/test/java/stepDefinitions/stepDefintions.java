package stepDefinitions;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import resources.base;

public class stepDefintions extends base{

	@Given("Initialize the browser with Chrome")
	public void initialize_the_browser_with_Chrome() throws IOException {
		driver =initializeDriver();
	}

	@And("Navigate to {string} site")
	public void navigate_to_site(String string) {
		driver.get(prop.getProperty("url"));
	}

	@When("User enters {string} and clicks on Submit button in Search bar")
	public void user_enters_and_clicks_on_Submit_button_in_Search_bar(String string) throws InterruptedException {
		WebElement move=driver.findElement(By.id("search"));
	    move.clear();
	    move.sendKeys("ch");
	    Thread.sleep(2000);
	    move.sendKeys(Keys.ARROW_DOWN);
	    move.sendKeys(Keys.ENTER);
	    Thread.sleep(5000);
	}

	@Then("Verify that User lands in correct page")
	public void verify_that_User_lands_in_correct_page() {
	    Assert.assertEquals("Search Results For 'Chair'",driver.findElement(By.cssSelector("h2[class='withsubtext']")).getText());
	}

	@And("Close the browsers")
	public void close_the_browsers() {
		driver.close();
		driver=null;
	}
	
	@Given("Initialize the browser with Chrome again")
	public void initialize_the_browser_with_Chrome_again() throws IOException {
		driver =initializeDriver();
	}

	@And("Navigate to {string} site again")
	public void navigate_to_site_again(String string) {
		driver.get(prop.getProperty("url"));
	}

	@When("User clicks on Track Order option")
	public void user_clicks_on_Track_Order_option() throws InterruptedException {
		driver.findElement(By.cssSelector("a[href*='/orders']")).click();
		Thread.sleep(2000);;
	}

	@And("User enters {string} and {string} and clicks on Submit button")
	public void user_enters_and_and_clicks_on_Submit_button(String string, String string2) {
		driver.findElement(By.cssSelector("input[id='ip_379403698']")).sendKeys(string);
		   driver.findElement(By.cssSelector("input[type='tel']")).sendKeys(string2);
		   driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	@Then("Verify that User is displayed correct message")
	public void verify_that_User_is_displayed_correct_message() throws InterruptedException {
		Thread.sleep(2000);
	}

	@And("Close the browsers again")
	public void close_the_browsers_again() {
		driver.close();
		driver=null;
	}
	
	@Given("Initialize the browser with Chrome once again")
	public void initialize_the_browser_with_Chrome_once_again() throws IOException {
		driver =initializeDriver();
	}

	@Given("Navigate to {string} site once again")
	public void navigate_to_site_once_again(String string) {
		driver.get(prop.getProperty("url"));
	}

	@When("User clicks on Sale header")
	public void user_clicks_on_Sale_header() throws InterruptedException {
		driver.findElement(By.cssSelector("span[class='topnav_itemname']")).click();
	    Thread.sleep(2000);
	}

	@When("User clicks on desired promotional link")
	public void user_clicks_on_desired_promotional_link() throws InterruptedException {
		driver.findElement(By.cssSelector("a[href*='/products-at-30-off-dow?src=g_topnav_sale_promotions_products-at-30-off']")).click();
	    Thread.sleep(2000);
	}

	@Then("Verify that User lands in correct page again")
	public void verify_that_User_lands_in_correct_page_again() {
	    Assert.assertEquals("Products At 30% OFF",driver.findElement(By.cssSelector("h1[class='withsubtext']")).getText());
	}

	@Then("Close the browsers once again")
	public void close_the_browsers_once_again() {
		driver.close();
		driver=null;
	}

	@Given("Initialize the browser with Chrome one more time")
	public void initialize_the_browser_with_Chrome_one_more_time() throws IOException {
		driver =initializeDriver();
	}

	@Given("Navigate to {string} site one more time")
	public void navigate_to_site_one_more_time(String string) {
		driver.get(prop.getProperty("url"));
	}

	@When("User clicks on Sale header again")
	public void user_clicks_on_Sale_header_again() throws InterruptedException {
		driver.findElement(By.cssSelector("span[class='topnav_itemname']")).click();
	    Thread.sleep(2000);
	}

	@When("User clicks on desired store link")
	public void user_clicks_on_desired_store_link() throws InterruptedException {
		driver.findElement(By.cssSelector("a[href*='/furniture-stores/mumbai?src=g_topnav_sale_stores_mumbai']")).click();
	    Thread.sleep(2000);
	}

	@Then("Verify that User lands in correct page once again")
	public void verify_that_User_lands_in_correct_page_once_again() {
	    Assert.assertEquals("Bandra, Mumbai",driver.findElement(By.cssSelector("h3[class='_3JJeW']")).getText());
	}

	@Then("Close the browsers one more time")
	public void close_the_browsers_one_more_time() {
		driver.close();
		driver=null;
	}
	
	@Given("Initialize the browser with Chrome another time")
	public void initialize_the_browser_with_Chrome_another_time() throws IOException {
		driver =initializeDriver();
	}

	@And("Navigate to {string} site another time")
	public void navigate_to_site_another_time(String string) {
		driver.get(prop.getProperty("url"));
	}

	@When("User  clicks on desired link")
	public void user_clicks_on_desired_link() {
		driver.findElement(By.cssSelector("a[href*='/help/contact-us?src=g_footer']")).click();
	}

	@Then("Verify that User lands in correct page one more time")
	public void verify_that_User_lands_in_correct_page_one_more_time() {
	    Assert.assertEquals("Contact Us", driver.findElement(By.cssSelector("span[class='entries-title']")).getText());
	}

	@And("Close the browsers another time")
	public void close_the_browsers_another_time() {
		driver.close();
		driver=null;
	}

	@Given("Initialize the browser with Chrome another time again")
	public void initialize_the_browser_with_Chrome_another_time_again() throws IOException {
		driver =initializeDriver();
	}
	
	@And("Navigate to {string} site another time again")
	public void navigate_to_site_another_time_again(String string) {
		driver.get(prop.getProperty("url"));
	}

	@When("User  clicks on desired link again")
	public void user_clicks_on_desired_link_again() throws InterruptedException {
		driver.findElement(By.cssSelector("a[href*='/help/contact-us?src=g_footer']")).click();
	    Thread.sleep(2000);
	}

	@And("User clicks on another link present")
	public void user_clicks_on_another_link_present() throws InterruptedException {
		driver.findElement(By.cssSelector("a[href*='https://www.youtube.com/user/urbanladder']")).click();
	    Thread.sleep(2000);
	}

	@Then("Verify that User lands in correct page another time")
	public void verify_that_User_lands_in_correct_page_another_time() throws InterruptedException {
		Set<String>ids=driver.getWindowHandles();
	    Iterator<String> it=ids.iterator();
	    String parentid=it.next();
	    String childid=it.next();
	    driver.switchTo().window(childid);
	    Thread.sleep(2000);
	    Assert.assertEquals("Urban Ladder - YouTube", driver.getTitle());
	}

	@And("Close the browsers another time again")
	public void close_the_browsers_another_time_again() {
		driver.close();
		driver=null;
	}

	@Given("Initialize the browser with Chrome another time once again")
	public void initialize_the_browser_with_Chrome_another_time_once_again() throws IOException {
		driver =initializeDriver();
	}

	@And("Navigate to {string} site another time once again")
	public void navigate_to_site_another_time_once_again(String string) {
		driver.get(prop.getProperty("url"));
	}

	@When("User enters {string} in corresponding space provided")
	public void user_enters_in_corresponding_space_provided(String string) {
		driver.findElement(By.cssSelector("input[id='email_id']")).sendKeys(string);
	}

	@And("User clicks on Subscribe button")
	public void user_clicks_on_Subscribe_button() {
		driver.findElement(By.cssSelector("input[value='SUBSCRIBE']")).click();
	}

	@Then("Verify that User is displayed correct message again")
	public void verify_that_User_is_displayed_correct_message_again() throws InterruptedException {
		   Thread.sleep(2000);
	}

	@And("Close the browsers another time once again")
	public void close_the_browsers_another_time_once_again() {
		driver.close();
		driver=null;
	}
	
	@Given("Initialize the browser with Chrome one final time")
	public void initialize_the_browser_with_Chrome_one_final_time() throws IOException {
		driver =initializeDriver();
	}

	@Given("Navigate to {string} site one final time")
	public void navigate_to_site_one_final_time(String string) {
		driver.get(prop.getProperty("url"));
	}

	@When("User clicks on desired button")
	public void user_clicks_on_desired_button() throws InterruptedException {
		driver.findElement(By.cssSelector("a[href*='/reviews-testimonials?src=g_custstorwdgt']")).click();
		Thread.sleep(2000);
	}

	@Then("Verify that User lands in correct page one final time")
	public void verify_that_User_lands_in_correct_page_one_final_time() {
		Assert.assertEquals("Reviews & Testimonials | urbanladder.com", driver.getTitle());
	}

	@Then("Close the browsers one final time")
	public void close_the_browsers_one_final_time() {
		driver.close();
		driver=null;
	}
}
