package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test
public class AddToCart extends OpenBrowser {
	public void checkcart() throws InterruptedException {
	navigateToUrl("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
WebElement megadrop = driver.findElement(By.xpath("(//span[@class='title'])[27]"));
	
	Actions action = new Actions(driver);
	action.moveToElement(megadrop).perform();
	
	WebElement apple = driver.findElement(By.xpath("(//a[@title='Apple'])"));
	action.moveToElement(apple).click().build().perform();
	
	driver.findElement(By.id("input-limit-212433")).sendKeys("100");
	
	WebElement over = driver.findElement(By.xpath("(//img[@class='lazy-load'])[4]"));
	action.moveToElement(over).perform();
	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement overclick =driver.findElement(By.xpath("//button[@class='btn btn-cart cart-34']"));
	action.moveToElement(overclick).click().build().perform();
	Thread.sleep(5000);
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"notification-box-top\\\"]/div/div[2]/div[2]/div[1]/a")));
	WebElement overclick1 = driver.findElement(By.xpath("//*[@id=\"notification-box-top\"]/div/div[2]/div[2]/div[1]/a"));
	action.moveToElement(overclick1).click().build().perform();
	
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("4");
	
	driver.findElement(By.xpath("//i[@class='fas fa-sync-alt']")).click();
	
	String value = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[6]")).getText();
	System.out.println(value);
	
	if(value.equalsIgnoreCase("$728.00")) {
		System.out.println("test pass");
	}
	else {
		System.out.println("test fail");
	}
	
	driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary']")).click();
	
	driver.findElement(By.xpath("//label[@for='input-account-login']")).click();
	
	driver.findElement(By.id("input-login-email")).sendKeys("MANOJ123@GMAIL.COM");
	
	driver.findElement(By.id("input-login-password")).sendKeys("Mano123%");
	
	driver.findElement(By.id("button-login")).click();
	Thread.sleep(4000);
	driver.findElement(By.id("input-payment-firstname")).sendKeys("mano");
	driver.findElement(By.id("input-payment-lastname")).sendKeys("jr");
	driver.findElement(By.id("input-payment-address-1")).sendKeys("no:12 mettu st, karasur,puducherry.");
	driver.findElement(By.id("input-payment-city")).sendKeys("puducherry");
	driver.findElement(By.id("input-payment-postcode")).sendKeys("605502");
	driver.findElement(By.id("input-payment-country")).click();
	driver.findElement(By.xpath("//option[@value='99']")).click();
	driver.findElement(By.id("input-payment-zone")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//option[@value='1503']")).click();
	driver.findElement(By.id("input-comment")).sendKeys("enjoy the order");
	
	driver.findElement(By.xpath("//label[@for='input-agree']")).click();
    driver.findElement(By.id("button-save")).click();
	}
}
