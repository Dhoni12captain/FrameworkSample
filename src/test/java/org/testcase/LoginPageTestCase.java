package org.testcase;

import java.awt.AWTException;

import org.locator.LoginPageObject;
import org.openqa.selenium.WebElement;
import org.sample.BaseClassSample;

public class LoginPageTestCase extends BaseClassSample  {
	public static void main(String[] args) throws AWTException {
		
	
	BaseClassSample base = new BaseClassSample();
	
	base.getDriver();
	base.launchUrl("https://adactinhotelapp.com/");
	
	
	LoginPageObject login = new LoginPageObject();
	WebElement txtUsername = login.getTxtUsername();
	base.enterText(txtUsername, "msdhoni1212");
	WebElement txtPassword = login.getTxtPassword();
	base.enterText(txtPassword, "captaincool");
	WebElement btnLogin = login.getBtnLogin();
	base.btnClick(btnLogin);
	
	}
}
