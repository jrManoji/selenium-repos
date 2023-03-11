import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class XyzBank {
	public void filldetials() throws InterruptedException{
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.manage().window().maximize();
	driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer");
	WebElement yourName = driver.findElement(By.id("userSelect"));
	Select name = new Select(yourName);
	name.selectByValue("2");
	driver.findElement(By.xpath("//div/div/div[2]/div/form/button")).click();
	driver.findElement(By.xpath("//div/div/div[2]/div/div[3]/button[2]")).click();
	//driver.findElement(By.xpath("//div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("10000");
	//driver.findElement(By.xpath("//div/div/div[2]/div/div[4]/div/form/button")).click();
	//String  Message = driver.findElement(By.xpath("//div/div/div[2]/div/div[4]/div/form")).getText();
	//System.out.println(Message);
	
	//if (Message.equals("Deposit")) {
	//  System.out.println("Deposit Successful");
	//} else {
	//	System.out.println("Not Deposit Successful");
	//}
	//String  deposit = driver.findElement(By.xpath("//strong[text()='10000']")).getText();
	//System.out.println(deposit);
	
	//if (deposit.equals("10000")) {
	//	System.out.println("bal increases");
	//} else {
	//	System.out.println("no bal increases");
	//}
	driver.findElement(By.xpath("//div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("1000");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div/div/div[2]/div/div[4]/div/form/button")).click();
	Thread.sleep(4000);
	String  Message = driver.findElement(By.xpath("//div/div/div[2]/div/div[4]/div/form")).getText();
	Thread.sleep(4000);
	System.out.println(Message);
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("500");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div/div/div[2]/div/div[4]/div/form/button")).click();
	Thread.sleep(4000);
	String  withdrawal = driver.findElement(By.xpath("//strong[text()='500']")).getText();
	Thread.sleep(4000);
	System.out.println(withdrawal);
		
		if (withdrawal.equals("500")) {
			System.out.println("withdrawal of 500");
		} else {
			System.out.println("no withdrawal done");
		}
	
	
	
}
}
