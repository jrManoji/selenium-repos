package Selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test
public class MegaMenu extends OpenBrowser {
	public void menudropdown() {
	navigateToUrl("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
	
	WebElement megadrop = driver.findElement(By.xpath("(//span[@class='title'])[27]"));
	
	Actions action = new Actions(driver);
	action.moveToElement(megadrop).perform();
	
	WebElement apple = driver.findElement(By.xpath("(//a[@title='Apple'])"));
	action.moveToElement(apple).click().build().perform();
	
	driver.findElement(By.id("input-limit-212433")).sendKeys("100");
	
	List<WebElement> name = driver.findElements(By.xpath("//a[@class='text-ellipsis-2']"));
	System.out.println("Name list : " + name.size());
	System.out.println("************************************");
	//for(WebElement i : name ) {
		//System.out.println(i.getText());
	//}
	
	List<WebElement> price = driver.findElements(By.xpath("//span[@class='price-new']"));
	System.out.println("Price list : " + price.size());
	System.out.println("************************************");
	//for(WebElement j : price ) {
		//System.out.println(j.getText());
	//}

	for(int i=0;i<name.size();i++) {
		System.out.println(name.get(i).getText()+ "***" +  price.get(i).getText());
	}
	System.out.println("************************************");
	driver.findElement(By.id("input-sort-212434")).click();
	
	driver.findElement(By.xpath("//*[@id=\"input-sort-212434\"]/option[7]")).click();
	
	List<WebElement> sorname = driver.findElements(By.xpath("//a[@class='text-ellipsis-2']"));
	System.out.println("Name list : " + sorname.size());
	System.out.println("************************************");
	
	
	List<WebElement> sorprice = driver.findElements(By.xpath("//span[@class='price-new']"));
	System.out.println("Price list : " + sorprice.size());
	System.out.println("************************************");
	
	for(int i=0;i<sorname.size();i++) {
		System.out.println(sorname.get(i).getText()+ "***" +  sorprice.get(i).getText());
	
	}
	    System.out.println("************************************");
		System.out.println("lower price product");
		System.out.println(sorname.get(0).getText()+ "***" +  sorprice.get(0).getText());
		System.out.println("higher price product");
		System.out.println(sorname.get(41).getText()+ "***" +  sorprice.get(41).getText());

	
		
	}
}

