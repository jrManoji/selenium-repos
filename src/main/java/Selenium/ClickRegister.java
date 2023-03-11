package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test(groups = {"demo"})
public class ClickRegister extends OpenBrowser {
	public void actiononregister() throws InterruptedException {
		navigateToUrl("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
		WebElement account = driver.findElement(By.xpath("(//span[@class='title'])[32]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(account).perform();
		
		WebElement registerbutton = driver.findElement(By.xpath("(//span[@class='title'])[34]"));
		action.moveToElement(registerbutton).click().build().perform();
		Thread.sleep(10000);
	}
	    
	

}
