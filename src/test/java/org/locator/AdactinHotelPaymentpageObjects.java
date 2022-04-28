package org.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClassSample;

public class AdactinHotelPaymentpageObjects extends BaseClassSample {
	
	public AdactinHotelPaymentpageObjects() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cardNum;
	
	@FindBy(id="cc_type")
	private WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expiryMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNum;
	
	@FindBy(id="book_now")
	private WebElement btnbookNow;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNum() {
		return cardNum;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}

	public WebElement getBtnbookNow() {
		return btnbookNow;
	}
	
	
	

}
