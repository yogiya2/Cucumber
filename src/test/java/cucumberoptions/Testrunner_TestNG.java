package cucumberoptions;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//java//features",glue="stepdefinitions",
tags="@parallelTest")

public class Testrunner_TestNG extends AbstractTestNGCucumberTests{
	@Override
	 @DataProvider(parallel = true)
	 public Object[][] scenarios() {
	 return super.scenarios();

}
}
