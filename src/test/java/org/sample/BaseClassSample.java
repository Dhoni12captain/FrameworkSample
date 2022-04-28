package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassSample {
	public static WebDriver driver;
	public static Actions actions;
	public static Robot robot;
	public static TakesScreenshot ts;
	public static Alert al;
	public static Select select;
	public static WebDriverWait wait;
	public static JavascriptExecutor executor;

	public void getDriver() throws AWTException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		actions = new Actions(driver);
		robot = new Robot();
		ts = (TakesScreenshot) driver;
		executor = (JavascriptExecutor) driver;

	}

	public void launchUrl(String url) {
		driver.get(url);

	}
	public void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	public void getTitle() {
	String title = driver.getTitle();
	System.out.println(title);
	

	}
	
	public void closeWindow() {
		driver.close();

	}
	public void quitWindow() {
		driver.quit();

	}

	public void enterText(WebElement element, String data) {
		element.sendKeys(data);

	}

	public void btnClick(WebElement element) {
		element.click();
	}

	public WebElement locatingElement(String locator, String value) {
		WebElement element = null;
		switch (locator) {
		case "id":
			element = driver.findElement(By.id(value));
			break;
		case "name":
			element = driver.findElement(By.name(value));
			break;
		case "xpath":
			element = driver.findElement(By.xpath(value));
			break;
		default:
			System.out.println("Invalid Locator");
			break;
		}

		return element;

	}

	public void toGetText(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}

	public void toGetAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}

	public void moveTo(WebElement target) {
		actions.moveToElement(target).perform();

	}

	public void rightClick(WebElement target) {
		actions.contextClick(target).perform();

	}

	public void toDragAndDrop(WebElement source, WebElement target) {
		actions.dragAndDrop(source, target).perform();
	}

	public void navigateTo(String url) {
		driver.navigate().to(url);

	}

	public void navigate(String methods) {
		switch (methods) {
		case "back":
			driver.navigate().back();
			break;
		case "forward":
			driver.navigate().forward();
			break;
		case "refresh":
			driver.navigate().refresh();
			break;

		default:
			System.out.println("invalid");
			break;
		}

	}

	public void keyPress(int keys) {
		robot.keyPress(keys);
	}

	public void keyRelease(int keys) {
		robot.keyRelease(keys);

	}

	public void actionsKey(CharSequence key, WebElement element, CharSequence key1, CharSequence key2) {
		actions.keyDown(key).sendKeys(element, key1).keyUp(key2).perform();
	}

	public void toDoubleClick(WebElement element) {
		actions.doubleClick(element);
	}

	public void toTakesScreenshot(File path) throws IOException {
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		FileHandler.copy(screenshotAs, path);

	}

	public void alertAccept() {
		al = driver.switchTo().alert();
		al.accept();
	}

	public void alertDismiss() {
		al = driver.switchTo().alert();
		al.dismiss();

	}

	public void alertSendkeys(String value) {
		al = driver.switchTo().alert();
		al.sendKeys(value);

	}

	public void alertGetText() {
		al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);

	}

	public void dropDownIndex(WebElement element, int index, String methods) {
		select = new Select(element);
		switch (methods) {
		case "Select":
			select.selectByIndex(index);
			break;
		case "Deselect":
			select.deselectByIndex(index);
			break;
		default:
			System.out.println("Invalid");
			break;
		}

	}

	public void dropDownText(WebElement element, String methods, String text) {
		select = new Select(element);
		switch (methods) {
		case "Select":
			select.selectByVisibleText(text);
			break;
		case "Deselect":
			select.deselectByVisibleText(text);
			break;
		default:
			System.out.println("Invalid");
			break;
		}

	}

	public void dropDownValue(WebElement element, String methods, String value) {
		select = new Select(element);
		switch (methods) {
		case "Select":
			select.selectByValue(value);
			break;
		case "Deselect":
			select.deselectByValue(value);
			break;
		default:
			System.out.println("NotValid");
			break;
		}

	}

	public void all(WebElement element, String methods) {
		select = new Select(element);
		switch (methods) {
		case "SelectAll":
			List<WebElement> options = select.getOptions();
			for (int i = 0; i < options.size(); i++) {
				WebElement element2 = options.get(i);
				String text = element2.getText();
				select.selectByVisibleText(text);
			}
			break;
		case "DeselectAll":
			select.deselectAll();
			break;
		default:
			System.out.println("Invalid");
			break;
		}

	}

	public void isMultiple(WebElement element) {
		select = new Select(element);
		boolean multiple = select.isMultiple();
		System.out.println(multiple);

	}

	public void getOptions(WebElement element) {
		select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement element2 = options.get(i);
			String text = element2.getText();
			System.out.println(text);

		}

	}

	// public void selectedValues(WebElement element,String methods) {
	// select = new Select(element);
	// switch (methods) {
	// case "Firstselected":
	// WebElement firstSelectedOption = select.getFirstSelectedOption();
	// String text = firstSelectedOption.getText();
	// System.out.println(text);
	// break;
	// case "Allselected" :
	// List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
	// for (int i = 0; i <allSelectedOptions.size() ; i++) {
	// WebElement webElement = allSelectedOptions.get(i);
	// String attribute = webElement.getAttribute("value");
	// System.out.println(attribute);
	// break;

	// }

	// }
	public void firstSelected(WebElement element) {
		select = new Select(element);
		WebElement selectedOption = select.getFirstSelectedOption();
		String text = selectedOption.getText();
		System.out.println(text);

	}

	public void allSelectedValues(WebElement element) {
		select = new Select(element);
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		for (int i = 0; i < selectedOptions.size(); i++) {
			WebElement webElement = selectedOptions.get(i);
			String attribute = webElement.getAttribute("value");
			System.out.println(attribute);

		}

	}

	public void getWindowHandle() {
		String parentWinId = driver.getWindowHandle();
		System.out.println(parentWinId);
	}

	public void getWindowHandles(int i) {
		Set<String> allWinId = driver.getWindowHandles();
		System.out.println(allWinId);
		java.util.List<String> li = new ArrayList<>();
		li.addAll(allWinId);
		int count = 0;
		for (String string : allWinId) {
			if (count == i) {
				driver.switchTo().window(string);
			}
			count++;
		}

	}

	public void scriptInsert(String script, WebElement element) {
		executor.executeScript(script, element);

	}

	public void scriptClick(String script, WebElement element) {
		executor.executeScript(script, element);

	}

	public void scriptgetAttribute(String script, WebElement element) {
		Object object = executor.executeScript(script, element);
		System.out.println(object);

	}

	public void scroll(String script, WebElement element) {
		executor.executeScript(script, element);

	}

	public void implicitWait(long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

	}

	public WebElement webdriverWait(String locator, String value, long seconds) {
		WebElement webElement = null;
		wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		switch (locator) {
		case "id":
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(value)));
			break;
		case "name":
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(value)));
			break;
		case "xpath":
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));
			break;
		default:
			System.out.println("invalid");
			break;
		}
		return webElement;
	}

	public void fluentWait(long seconds, long seconds1, final String locator, final String value, String data) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(seconds))
				.pollingEvery(Duration.ofSeconds(seconds1)).ignoring(org.openqa.selenium.NoSuchElementException.class);
		WebElement until = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver t) {
				WebElement element = null;
				switch (locator) {
				case "id":
					element = driver.findElement(By.id(value));
					break;
				case "name":
					element = driver.findElement(By.name(value));
					break;
				case "xpath":
					element = driver.findElement(By.xpath(value));
					break;
				default:
					break;
				}
				return element;
			}
		});
		until.sendKeys(data);

	}

	public void findElements(WebElement element, String tagName, String tagName1) {
		List<WebElement> allrow = element.findElements(By.tagName(tagName));

		for (int i = 0; i < allrow.size(); i++) {
			WebElement row = allrow.get(i);
			List<WebElement> tdatas = row.findElements(By.tagName(tagName1));
			for (int j = 0; j < tdatas.size(); j++) {
				WebElement element2 = tdatas.get(j);
				String text = element2.getText();
				System.out.println(text);
			}
			System.out.println();

		}

	}

	public void particularData(WebElement element, String tagName, String tagName1, Object data) {
		List<WebElement> allrow = element.findElements(By.tagName(tagName));

		for (int i = 0; i < allrow.size(); i++) {
			WebElement row = allrow.get(i);
			List<WebElement> tdatas = row.findElements(By.tagName(tagName1));
			for (int j = 0; j < tdatas.size(); j++) {
				WebElement element2 = tdatas.get(j);
				String text = element2.getText();
				if (text.equals(data)) {
					System.out.println(text);
				}
			}

		}
	}

}
