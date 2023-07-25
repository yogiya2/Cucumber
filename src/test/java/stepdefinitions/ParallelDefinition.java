package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParallelDefinition {
	WebDriver driver;
	private String url;
	@Given("user on the site to test parallel")
	public void user_on_the_site_to_test_parallel() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(3000);
	}
	@When("url is launched {string} to test parallel")
	public void url_is_launched_to_test_parallel(String url) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.navigate().to(url);
	    Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Then("close the site to test parallel")
	public void close_the_site_to_test_parallel() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	}
}



