package org.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClassSample;

public class AdactinHotelConformObjects extends BaseClassSample {
	
	public AdactinHotelConformObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;
	
	@FindBy(id="continue")
	private WebElement btnContinue;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	

}
