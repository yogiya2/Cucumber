package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundDefinitions {
	@Given("First")
	public void first() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("First");
	}
	@When("Second")
	public void second() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Second");
	}
	@Then("Third")
	public void third() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Third");
	}
	@Given("background given one")
	public void background_given_one() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Given one");
	}
	@When("background when one")
	public void background_when_one() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("When one");
	}
	@Then("background then one")
	public void background_then_one() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Then one");
	}
	
	@Given("background given two")
	public void background_given_two() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Given two");
	}
	@When("background when two")
	public void background_when_two() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("When two");
	}
	@Then("background then two")
	public void background_then_two() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Then two");
	}




}
