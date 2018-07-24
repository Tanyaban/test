package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition {
	WebDriver driver;
	String title;
	@Given("^Login application should be available$")
	public void login_application_should_be_available() {
	    // Write code here that turns the phrase above into concrete actions
	    driver=new FirefoxDriver();
	    driver.get("http://opensource-demo.orangehrmlive.com");
	    
	}

	@When("^Validate Login application$")
	public void validate_Login_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    title=driver.getTitle();
	    
	}

	@Then("^Login should be successful$")
	public void login_should_be_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  Assert.assertEquals("OrangeHRM", title);  
	}

}
