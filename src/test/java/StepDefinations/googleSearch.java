package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googleSearch  {
	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\program\\cucumber_practice\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		}
	@And("user in google search page")
	public void user_in_google_search_page() {
	    System.out.println("serch");
	   driver.navigate().to("https://www.google.com/");
	}

	@When("user enter a text in serch box")
	public void user_enter_a_text_in_serch_box() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("enter text");
	   // throw new io.cucumber.java.PendingException();
	}

	@And("hits enter")
	public void hits_enter() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("hits enter");
		  }

	@Then("user is navigated to serch results")
	public void user_is_navigated_to_serch_results() {
	  System.out.println("results");
	 
	}


}
