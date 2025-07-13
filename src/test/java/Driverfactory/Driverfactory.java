package Driverfactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driverfactory {
	
	static WebDriver driver=null;
	
	public static WebDriver Intializebrowser(String browser) {
		
		if(browser.equals("chrome")) {
			
			driver = new ChromeDriver();
		}
		
        if(browser.equals("Firefox")) {
			
			driver = new FirefoxDriver();
		}
		
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;	
		
	}
	
	public static WebDriver getdriver(WebDriver driver) {
		
		return driver;
	}

}
