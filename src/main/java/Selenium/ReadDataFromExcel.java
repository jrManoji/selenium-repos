package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadDataFromExcel {

	
	public static Object[][] excelRead(String testDataExcelPath) throws IOException {

		// step1: set up the excel document path
		FileInputStream fis = new FileInputStream(testDataExcelPath);
		// FileInputStream fis = new FileInputStream("./testdata/sampleTestdata.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// step2: set up the worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");

		// to find the number of rows in the worksheet
		int rowCount = ws.getLastRowNum();

		// to find the number of cells in a row
		int columnCount = ws.getRow(1).getLastCellNum();

		// declare 2D array
		Object[][] data = new String[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				String text = ws.getRow(i).getCell(j).getStringCellValue();
				// System.out.println(text);
				data[i-1][j] = text;
			}
		}
		// to close the workbook
		wb.close();

		return data;
	}

}
