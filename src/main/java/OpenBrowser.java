import java.time.Duration;

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
	
		public void browserClose() {
			driver.close();
		}	
	}	


