package Selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataFromExcel  extends OpenBrowser {
	
	public String testDataExcelPath = "D:\\data/oceandata.xlsx";

	@DataProvider(name = "oceanTestData")
	public Object[][] retrieveDataFromExcel() throws IOException {

		return ReadDataFromExcel.excelRead(testDataExcelPath);
	}

	
	@Test(dataProvider = "oceanTestData")
	public void enterDataUsingString(String name, String mobile, String message) throws InterruptedException {
		navigateToUrl("https://oceanacademy.in/");
		driver.findElement(By.linkText("Contact Us")).click();
		driver.findElement(By.name("fullName")).sendKeys(name);
		driver.findElement(By.name("email")).sendKeys(mobile);
		driver.findElement(By.name("query")).sendKeys(message);
		
		System.out.println("Data entered successfully");
	}

}
