import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class AlertChecking {
	public void alertTypes() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		// Modern Alert - dismiss
		driver.findElement(By.id("modern")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("// button[@aria-label='close']")).click();

		// Prompt Alert - dismiss
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Welcome to Alert class");
		driver.switchTo().alert().accept();
		String textVal = driver.findElement(By.id("myName")).getText();
		System.out.println(textVal);

		// Confirm Alert - dismiss
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();

		// Simple Alert
		driver.findElement(By.id("accept")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
}
