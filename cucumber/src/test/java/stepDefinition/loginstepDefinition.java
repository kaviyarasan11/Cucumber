package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginstepDefinition {

	WebDriver DR;
	@Given("^Navigate to the website facebook\\.com$")
	public void navigate_to_the_website_facebook_com() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    DR=new ChromeDriver();
	    DR.get("https://www.facebook.com/login/");
	}

	@When("^user enter user and password$")
	public void user_enter_user_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user click on enter button$")
	public void user_click_on_enter_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^user should see the home screen$")
	public void user_should_see_the_home_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
