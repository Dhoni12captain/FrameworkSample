package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleClass {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("msdhoni");
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("msd@1212");
		WebElement btnlogin = driver.findElement(By.xpath("//button[text()='Log In']"));
		btnlogin.click();
		
	}

}
