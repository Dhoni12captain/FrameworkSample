package org.locator;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.sample.BaseClassSample;

public class SampleClass extends BaseClassSample {
	
	
	public static void main(String[] args) throws AWTException {
		
		BaseClassSample base = new BaseClassSample();
		base.getDriver();
		base.launchUrl("https://www.facebook.com/");
		
		LoginPage login = new LoginPage();
		
		WebElement txtusername = login.getTxtusername();
		base.enterText(txtusername, "msdhoni");
		
		base.navigate("refresh");
		base.enterText(txtusername, "captaincool");
		
		WebElement txtpassword = login.getTxtpassword();
		base.enterText(txtpassword, "msdhoni12");
		
		
		WebElement btnLogin = login.getBtnLogin();
		base.btnClick(btnLogin);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
