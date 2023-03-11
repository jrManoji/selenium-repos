package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class FrameChecking {
	    public void frameHandle() {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
			
		driver.switchTo().frame("frame1");
			
		String val =driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(val);
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='framesWrapper']/div[1]")).getText());
		}
}

