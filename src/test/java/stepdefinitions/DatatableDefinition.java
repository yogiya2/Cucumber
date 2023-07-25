package stepdefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DatatableDefinition {
	
	@Given("User is on sign up screen")
	public void user_is_on_sign_up_screen() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("GIven");
	}
	@Then("user enter details")
	public void user_enter_details(DataTable dataTable ) {
		List<List<String>>data= dataTable.asLists();
		System.out.println(data.get(1).get(0)+" "+data.get(1).get(1));
		System.out.println(data.get(2).get(0)+" "+data.get(1).get(1));
		System.out.println(data.get(2).get(0)+" "+data.get(2).get(1));
	   
	   
	}




}
