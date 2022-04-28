package org.testcase;

import java.awt.AWTException;

import org.locator.AdactinHomePageObjects;
import org.locator.LoginPageObject;
import org.openqa.selenium.WebElement;
import org.sample.BaseClassSample;

public class AdactinHomePageTestCase extends BaseClassSample {

	
	public static void main(String[] args) throws AWTException  {
		
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
		
		AdactinHomePageObjects homepage = new AdactinHomePageObjects();
		WebElement location = homepage.getLocation();
		base.dropDownText(location, "Select", "Melbourne");
		
		
		WebElement hotel = homepage.getHotel();
		base.dropDownText(hotel, "Select", "Hotel Cornice");
		
		
		WebElement roomType = homepage.getRoomType();
		base.dropDownText(roomType, "Select", "Super Deluxe");
		
		
		WebElement numberofRooms = homepage.getNumberofRooms();
		base.dropDownText(numberofRooms, "Select", "1 - One");
		
		
		WebElement datecheckIn = homepage.getDatecheckIn();
		base.scriptInsert("22/04/2022", datecheckIn);
		
		WebElement datecheckOut = homepage.getDatecheckOut();
		base.scriptInsert("25/04/2022", datecheckOut);
		
		WebElement adultperRoom = homepage.getAdultperRoom();
		base.dropDownText(adultperRoom, "Select", "2 - Two");
		
		
		WebElement childperRoom = homepage.getChildperRoom();
		base.dropDownText(childperRoom, "Select", "0 - None");
		
		WebElement btnSubmit = homepage.getBtnSubmit();
		base.btnClick(btnSubmit);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
