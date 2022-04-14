package ValidationInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyLogin {
	@Test
	public void TestUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("chrome","https://www.facebook.com/");
		LoginPage loginFaceBook = PageFactory.initElements(driver, LoginPage.class);
		loginFaceBook.LoginFaceBook("ABC@gmail.com","Abc@123");

	}

}
