package Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class Windows{
	public void workingOnWindows() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String baseWindow = driver.getWindowHandle();
		System.out.println(baseWindow);	
		System.out.println("~~~~~~~");		
		driver.findElement(By.xpath("//span[@title='Remote']")).click();
		Set<String> windowNameList = driver.getWindowHandles();
		for (String winName : windowNameList) {
			Thread.sleep(5000);
			if(!winName.equalsIgnoreCase(baseWindow)) {
				System.out.println(winName);
				driver.switchTo().window(winName);			
			}
		}
		String value = driver.findElement(By.xpath("//div[@class='sortAndH1Cont']/div[1]/span")).getText();
		System.out.println(value);
		value.substring(10, 14);
		System.out.println(value.substring(10, 14));
		String value2 = driver.findElement(By.xpath("//div[3]/label/p/span[2]")).getText();
		System.out.println(value2);
		
		if(value.substring(10, 14).equals(value2)) {
			System.out.println("equals");
		}
		else {
			System.out.println("not equals");
		}
	}

	
}
