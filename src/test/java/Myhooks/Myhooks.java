package Myhooks;

import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import Utilities.configproperties;

import Driverfactory.Driverfactory;

public class Myhooks {

	
	WebDriver driver;
	
	Properties prop;
	
	@Before
	public void setup() {
		
		Properties prop= new configproperties().intializeproperties();
		driver=Driverfactory.Intializebrowser(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
	}
}
