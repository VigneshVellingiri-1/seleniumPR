package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import utilities.BrowsersSetup;

public class Hooks{
	

	@Before
	public void setup(){
		 String browser = System.getProperty("browser", "chrome");  // Default to Chrome
		 BrowsersSetup.setDriver(browser);
		
		/* setDriver("edge");
	        getDriver().manage().window().maximize();
	        */
		
	}
	
	@After
	public void afterTest() {
		
			BrowsersSetup.quitDriver();
		
	}

}
