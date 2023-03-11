import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Missile {
	public void selectValue() {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://testsheepnz.github.io/panther.html");
		WebElement missileCount = driver.findElement(By.id("numMissiles"));

		Select missileSelObj = new Select(missileCount);
		missileSelObj.selectByVisibleText("1");

		WebElement bombCount = driver.findElement(By.id("numDumbBomb"));
		Select bombSelObj = new Select(bombCount);
		bombSelObj.selectByValue("4");
		driver.findElement(By.id("setEquipmentButton")).click();

		String errorMessage = driver.findElement(By.id("initErrorMsg")).getText();
		System.out.println(errorMessage);

		if (errorMessage.equalsIgnoreCase("Max fuel level of 3000kg")) {
			System.out.println("TestCase Passed");
		} else {
			System.out.println("TestCase Failed");
		}
	}
}
