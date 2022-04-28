package org.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTask {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		File file = new File("C:\\Users\\sanch\\eclipse-workspace\\FrameworkSample\\ExcelSheet\\Skills.xlsx");
		Workbook workbook = new XSSFWorkbook();
		// create sheet
		Sheet sheet = workbook.createSheet("Santhosh");

		WebElement dropskills = driver.findElement(By.id("Skills"));
		Select select = new Select(dropskills);
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			WebElement element = options.get(i);
			String text = element.getText();
			// Create row
			Row row = sheet.createRow(i);
			// create cell
			Cell cell = row.createCell(0);
			// insert value
			cell.setCellValue(text);
		}

		FileOutputStream stream = new FileOutputStream(file);
		workbook.write(stream);
	}

}
