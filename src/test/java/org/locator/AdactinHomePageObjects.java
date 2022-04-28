package org.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClassSample;

public class AdactinHomePageObjects extends BaseClassSample {
	
	public AdactinHomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement roomType;

	@FindBy(id = "room_nos")
	private WebElement numberofRooms;
    
	@FindBy(id="datepick_in")
	private WebElement datecheckIn;
	
	@FindBy(id="datepick_out")
	private WebElement datecheckOut;
	
	@FindBy(id="adult_room")
	private WebElement adultperRoom;
	
	@FindBy(id="child_room")
	private WebElement childperRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSubmit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberofRooms() {
		return numberofRooms;
	}

	public WebElement getDatecheckIn() {
		return datecheckIn;
	}

	public WebElement getDatecheckOut() {
		return datecheckOut;
	}

	public WebElement getAdultperRoom() {
		return adultperRoom;
	}

	public WebElement getChildperRoom() {
		return childperRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	
	
	
	
	
	
	
	
}
