package Selenium;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {
	
		public  RemoteWebDriver driver;

		public void navigateToUrl(String url) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			driver.manage().window().maximize();
			driver.get(url);
		}
		
		public String captureScreenshot() {
			File source = driver.getScreenshotAs(OutputType.FILE);
			File destination2 = new File("./snaps/snap" + System.currentTimeMillis() + ".jpeg");
			String dest = destination2.getAbsolutePath();
			try {
				FileUtils.copyFile(source, destination2);
			} catch (IOException e) {
				System.out.println("Exception occured :: " + e);
			}
			return dest;
		}
	
		public void browserClose() {
			driver.close();
		}	
	}	


