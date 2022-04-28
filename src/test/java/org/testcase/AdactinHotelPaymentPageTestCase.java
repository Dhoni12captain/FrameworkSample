package org.testcase;

import java.awt.AWTException;

import org.locator.AdactinHomePageObjects;
import org.locator.AdactinHotelConformObjects;
import org.locator.AdactinHotelPaymentpageObjects;
import org.locator.LoginPageObject;
import org.openqa.selenium.WebElement;
import org.sample.BaseClassSample;

public class AdactinHotelPaymentPageTestCase {
	
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
		base.enterText(datecheckIn, "22/04/2022");

		WebElement datecheckOut = homepage.getDatecheckOut();
		base.enterText(datecheckOut, "25/04/2022");

		WebElement adultperRoom = homepage.getAdultperRoom();
		base.dropDownText(adultperRoom, "Select", "2 - Two");

		WebElement childperRoom = homepage.getChildperRoom();
		base.dropDownText(childperRoom, "Select", "0 - None");

		WebElement btnSubmit = homepage.getBtnSubmit();
		base.btnClick(btnSubmit);

		AdactinHotelConformObjects conform = new AdactinHotelConformObjects();

		WebElement radiobtn = conform.getRadiobtn();
		base.btnClick(radiobtn);

		WebElement btnContinue = conform.getBtnContinue();
		base.btnClick(btnContinue);
		
		AdactinHotelPaymentpageObjects payment = new AdactinHotelPaymentpageObjects();
		WebElement firstname = payment.getFirstname();
		base.enterText(firstname, "Mahendrasingh");
		
		WebElement lastname = payment.getLastname();
		base.enterText(lastname, "Dhoni");
		
		WebElement address = payment.getAddress();
		base.enterText(address, "chennai");
		
		WebElement cardNum = payment.getCardNum();
		base.enterText(cardNum, "1234567890987654");
		
		WebElement cardType = payment.getCardType();
		base.dropDownText(cardType, "Select", "American Express");
		
		WebElement expiryMonth = payment.getExpiryMonth();
		base.dropDownText(expiryMonth, "Select", "May");
		
		WebElement expiryYear = payment.getExpiryYear();
		base.dropDownText(expiryYear, "Select", "2022");
		
		WebElement cvvNum = payment.getCvvNum();
		base.enterText(cvvNum, "123");
		
		WebElement btnbookNow = payment.getBtnbookNow();
		base.btnClick(btnbookNow);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
