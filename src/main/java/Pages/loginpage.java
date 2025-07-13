package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
		
	WebDriver driver;
		
		public  loginpage(WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver,this);
			
			
		}
		
		@FindBy (id="username")
		WebElement Txtusername;
		
		@FindBy (id="password")
		WebElement  Txtpassword;
		
		@FindBy (id="terms")
		WebElement Termscheckbox;
		
		@FindBy (id="signInBtn")
		WebElement Signbtn;
	
		
		public void setusername() {
			Txtusername.sendKeys("");
			
		}
		
		public void setPassword() {
			Txtpassword.sendKeys("");
			
		}
		
		public void clickterms() {
			Termscheckbox.click();
			
		}
		
		public void clicksign() {
			Signbtn.click();
			
		}
}

