package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import utilities.BrowsersSetup;

public class Hooks extends BrowsersSetup{
	
	
	@Before
	public void setup(){
		
		 setDriver("edge");
	        getDriver().manage().window().maximize();
		
	}
	
	@After
	public void afterTest() {
		
			BrowsersSetup.quitDriver();
		
	}

}
