package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowsersSetup {
	
	 private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	    public static WebDriver getDriver() {
	        return tlDriver.get();
	    }

	    public static void setDriver(String browserName) {
	    	
	    	switch (browserName) {
			case "chrome":
				tlDriver.set(new ChromeDriver());
				break;
			case "edge":
				tlDriver.set(new EdgeDriver());
			}
	        
	    }

	    public static void quitDriver() {
	        getDriver().quit();
	        tlDriver.remove();
	    }
	

}
