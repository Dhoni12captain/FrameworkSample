package org.sample;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

public class SampleClass extends BaseClassSample {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {

		BaseClassSample classSample = new BaseClassSample();
		classSample.getDriver();
		classSample.launchUrl("https://www.w3schools.com/html/html_tables.asp");
		classSample.currentUrl();
		classSample.getTitle();
		
		// WebElement txtusername = classSample.locatingElement("id", "email");
		// classSample.enterText(txtusername, "santhosh");
		// WebElement txtpassword = classSample.locatingElement("id", "pass");
		// classSample.enterText(txtpassword, "san123");
		// WebElement locatingElement = classSample.locatingElement("xpath",
		// "//h2[contains(text(), 'Facebook helps you connect')]");
		// classSample.toGetText(locatingElement);
		// classSample.toGetAttribute(txtusername);
		// WebElement btnlogin = classSample.locatingElement("xpath", "//button[text()=
		// 'Log In']");
		// classSample.btnClick(btnlogin);

		// classSample.toTakesScreenshot(new File("D:\\screenshot\\fbpage.png"));
		// WebElement source = classSample.locatingElement("id", "credit2");
		// WebElement target = classSample.locatingElement("id", "bank");
		// classSample.toDragAndDrop(source, target);

		// WebElement promptAlert = classSample.locatingElement("xpath",
		// "//a[text()='Alert with OK & Cancel ']");
		// classSample.btnClick(promptAlert);
		// WebElement locatingElement = classSample.locatingElement("xpath",
		// "//button[text()='click the button to display a confirm box ']");
		// classSample.btnClick(locatingElement);
		// classSample.alertGetText();
		// classSample.alertAccept();

		// WebElement locatingElement = classSample.locatingElement("id", "fruits");
		// classSample.all(locatingElement, "SelectAll");

		// classSample.dropDownIndex(locatingElement, 3, "Deselect");
		// classSample.dropDownText(locatingElement, "Deselect", "Apple");
		// classSample.dropDownValue(locatingElement, "Deselect", "orange");
		// Thread.sleep(3000);
		// classSample.all(locatingElement, "DeselectAll");

		// classSample.isMultiple(locatingElement);

		// classSample.getOptions(locatingElement);
		// classSample.selectedValues(locatingElement, "Firstselected");
		// classSample.dropDownText(locatingElement, "Select", "Grape");
		// classSample.dropDownValue(locatingElement, "Select", "apple");
		// classSample.dropDownIndex(locatingElement, 2, "Select");
		// classSample.dropDownValue(locatingElement, "Select", "apple");

		// classSample.selectedValues(locatingElement, "Firstselected");
		// classSample.selectedValues(locatingElement, "Allselected");

		// classSample.firstSelected(locatingElement);

		// classSample.allSelectedValues(locatingElement);

		// WebElement txtbox = classSample.locatingElement("id", "twotabsearchtextbox");
		// classSample.enterText(txtbox, "iphone13");
		// WebElement btnsearch = classSample.locatingElement("id",
		// "nav-search-submit-button");
		// classSample.btnClick(btnsearch);
		// WebElement element = classSample.locatingElement("xpath",
		// "//span[text()='Apple iPhone 13 (128GB) - Midnight']");
		// classSample.btnClick(element);
		// WebElement element2 = classSample.locatingElement("xpath",
		// "//span[text()='Apple iPhone 13 (128GB) - (Product) RED']");
		// classSample.btnClick(element2);
		// classSample.getWindowHandle();
		// classSample.getWindowHandles(2);
		// WebElement element3 = classSample.locatingElement("id",
		// "add-to-cart-button");
		// classSample.btnClick(element3);

		// WebElement element = classSample.locatingElement("id", "email");
		// classSample.scriptInsert("arguments[0].setAttribute('value','dhoni')",
		// element);
		//
		// classSample.scriptgetAttribute("return arguments[0].getAttribute('value')",
		// element);
		// WebElement element2 = classSample.locatingElement("id", "pass");
		// classSample.scriptInsert("arguments[0].setAttribute('value','dhoni1212')",
		// element2);
		//
		// classSample.scriptgetAttribute("return arguments[0].getAttribute('value')",
		// element2);
		//
		// WebElement element3 = classSample.locatingElement("name", "login");
		// classSample.scriptClick("arguments[0].click()", element3);

		// WebElement btncreate = classSample.locatingElement("xpath",
		// "//a[text()='Create New Account']");
		// classSample.btnClick(btncreate);

		// classSample.fluentWait(30, 4, "xpath","//input[@placeholder='First name']"
		// ,"santhosh");

		// WebElement txtfirst = classSample.locatingElement("xpath",
		// "//input[@placeholder='First name']");
		// classSample.enterText(webdriverWait, "santhosh");
		

		WebElement table = classSample.locatingElement("id", "customers");
		// classSample.findElements(table, "tr", "td");

		
		classSample.particularData(table, "tr", "td", "Helen Bennett");
		
		
		
		classSample.quitWindow();
		
		
		
		
		
		
		
		
		
		
		
	}

}
