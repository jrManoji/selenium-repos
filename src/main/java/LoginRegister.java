import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test(groups = {"demo"})
public class LoginRegister extends OpenBrowser {
	public void logintoregister() throws InterruptedException {
		navigateToUrl("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
		
		WebElement account = driver.findElement(By.xpath("(//span[@class='title'])[32]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(account).perform();
		
		WebElement registerbutton = driver.findElement(By.xpath("(//span[@class='title'])[33]"));
		action.moveToElement(registerbutton).click().build().perform();
	
		driver.findElement(By.id("input-email")).sendKeys("MANOJ123@GMAIL.COM");
	
		driver.findElement(By.id("input-password")).sendKeys("Mano123%");
	
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	
		WebElement myaccount = driver.findElement(By.xpath("(//span[@class='title'])[32]"));
		
		action.moveToElement(myaccount).perform();
		
		WebElement myvoucher = driver.findElement(By.xpath("(//span[@class='title'])[37]"));
		action.moveToElement(myvoucher).click().build().perform();
		String value = driver.findElement(By.xpath("(//label[@class='col-sm-2 col-form-label'])[5]")).getText();
		System.out.println(value);
		
		if (value.equals("Gift Certificate Theme")){
			String value1 = driver.findElement(By.xpath("//label[text()=' Birthday']")).getText();
			System.out.println(value1);
			String value2 = driver.findElement(By.xpath("//label[text()=' Christmas']")).getText();
			System.out.println(value2);
			String value3 = driver.findElement(By.xpath("//label[text()=' General']")).getText();
			System.out.println(value3);
		}
		else {
			System.out.println("no gifts");

		}
		Thread.sleep(5000);
		driver.quit();
	}
      
}
