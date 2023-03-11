package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test
public class Myntra extends OpenBrowser {
	public void menshoe() throws InterruptedException {
		navigateToUrl("https://www.myntra.com/");
		Thread.sleep(4000);
	    WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
	    Actions action = new Actions(driver);
		action.moveToElement(men).perform();
		Thread.sleep(4000);
		WebElement casualshoes = driver.findElement(By.xpath("//a[@data-reactid='94']"));
		action.moveToElement(casualshoes).click().build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//label[@class='vertical-filters-label common-customCheckbox'])[2]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label'])[4]")).click();
		Thread.sleep(4000);
		String value = driver.findElement(By.xpath("(//div[@class='filter-summary-filter'])[2]")).getText();
		System.out.println(value);
		if(value.equals("Rs. 10928 To Rs. 14001")) {
			System.out.println("all products are in filter range");
		}
		else {
			System.out.println("all products are not in filter range");
		}

		
	}

}
