package Selenium;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test
public class LowHigh extends OpenBrowser {
	public void lowtohigh() {
		navigateToUrl("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
		
		WebElement megadrop = driver.findElement(By.xpath("(//span[@class='title'])[27]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(megadrop).perform();
		
		WebElement apple = driver.findElement(By.xpath("(//a[@title='Apple'])"));
		action.moveToElement(apple).click().build().perform();
		
		driver.findElement(By.id("input-limit-212433")).sendKeys("100");
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

		HashMap<Integer , String> map = new HashMap<Integer, String>();
		//List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"mz-product-grid-image-56-212439\"]/ul/li[2]/img"));
		//System.out.println(list);
		int n=42;
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

			for(int a=0;  a < n ; a++) {
				String cost = driver.findElement(By.xpath("//span[@class='price-new']")).getText();
				String product = driver.findElement(By.xpath("//a[@class='text-ellipsis-2']")).getText();
				cost = cost.replaceAll("[^0-9]", "");
				int rupees = Integer.parseInt(cost);
				map.put(rupees, product);
			}
			Set<Integer> keys = map.keySet();
			ArrayList<Integer> listSortProduct = new ArrayList<Integer>(keys);
			Collections.sort(listSortProduct);
            
			int lowest = listSortProduct.get(0);
			int highest = listSortProduct.get(listSortProduct.size()-1);	
			
			System.out.println("lower price product" +lowest);
			System.out.println("high price product" +highest);
			
			
			
			
		}
		
		
	}


