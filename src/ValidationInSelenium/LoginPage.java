package ValidationInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(how = How.ID, using ="email")
	WebElement email;
	
	@FindBy(how = How.ID, using = "txtPassword")
	WebElement Password;
	
	@FindBy(how = How.XPATH, using = "")
	WebElement LoginBtn;
	
	public void LoginFaceBook(String Email, String Psd) {
		email.sendKeys(Email);
		Password.sendKeys(Psd);
		LoginBtn.click();

	}

		
	}


