package Selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test(groups = {"demo"})
public class RegisterAccount extends OpenBrowser{
	public void provideinformation() throws InterruptedException {
		
		navigateToUrl("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
		driver.findElement(By.id("input-firstname")).sendKeys("MANOJ");
		driver.findElement(By.id("input-lastname")).sendKeys("R");
		driver.findElement(By.id("input-email")).sendKeys("MANOJ123@GMAIL.COM");
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		driver.findElement(By.id("input-password")).sendKeys("Mano123%");
		driver.findElement(By.id("input-confirm")).sendKeys("Mano123%");
		driver.findElement(By.xpath("//label[@for='input-newsletter-yes']")).click();
		driver.findElement(By.xpath("//label[@for='input-agree']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
}
}
