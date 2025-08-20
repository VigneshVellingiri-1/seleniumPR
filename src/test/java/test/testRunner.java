package test;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (tags = "@test", features = "src/test/resources/features", glue = "test",
dryRun =false,monochrome = true,
plugin = {"pretty","html:target/cucmber_report.html"})

public class testRunner extends AbstractTestNGCucumberTests{
	
	/*
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	*/
}