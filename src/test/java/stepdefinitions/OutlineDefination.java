package stepdefinitions;

import io.cucumber.java.en.*;

public class OutlineDefination {

	

	@Given("User provides correct username outline new={string}")
	public void user_provides_correct_username_outline_new(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string);
	}
	@When("user provides correct password outline new={string}")
	public void user_provides_correct_password_outline_new(String string) {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println(string);
	}
	@Then("User must login outline new")
	public void user_must_login_outline_new() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("THEN");
	}



}
