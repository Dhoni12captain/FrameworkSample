package org.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClassSample;

public class LoginPage extends BaseClassSample {
	
	public LoginPage() {
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="email")
	private WebElement txtusername;
	
	@FindBy(id="pass")
	private WebElement txtpassword;
	
	@FindBy(name="login")
	private WebElement btnLogin;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
