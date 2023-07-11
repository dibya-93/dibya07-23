package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user in login page");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("id password");
	    // Write code here that turns the phrase above into concrete actions
	  //throw new io.cucumber.java.PendingException();
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("user click");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("user in home page");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}


	}
	

