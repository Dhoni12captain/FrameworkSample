package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleTaskExcel {
	public static void main(String[] args) throws IOException {
		// Mention the path of excel
		File file = new File("C:\\Users\\sanch\\eclipse-workspace\\FrameworkSample\\ExcelSheet\\Datas.xlsx");

		// GEt the objects/bytes from file
		FileInputStream stream = new FileInputStream(file);

		// Create workbook
		Workbook workbook = new XSSFWorkbook(stream);

		// Get the Sheet name

		Sheet sheet = workbook.getSheet("santhosh");

		// iterating
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType type = cell.getCellType();
				switch (type) {
				case STRING:
					String text = cell.getStringCellValue();
					System.out.println(text);
					break;

				case NUMERIC:

					if (DateUtil.isCellDateFormatted(cell)) {
						 java.util.Date date = cell.getDateCellValue();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
						String format = dateFormat.format(date);
						System.out.println(format);

					} else {
						double d = cell.getNumericCellValue();
						BigDecimal bigDecimal = BigDecimal.valueOf(d);
						String number = bigDecimal.toString();
						System.out.println(number);
					}
					break;

				default:
					break;
				}
			}
		}

	}

}







