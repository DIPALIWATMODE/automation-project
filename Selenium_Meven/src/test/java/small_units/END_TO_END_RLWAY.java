package small_units;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_class.BASE_2;

public class END_TO_END_RLWAY extends BASE_2{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser("page");
		driver.get("https://www.railyatri.in/");
		
	//	JavascriptExecutor js=(JavascriptExecutor) driver;
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//locate frome DropDown
		WebElement Board=driver.findElement(By.cssSelector("input#from_stn_input"));
		Board.sendKeys("Hinganghat");
		
		
		//Click on Option Hinganghat
		driver.findElement(By.xpath("//li[text()='HINGANGHAT | HGT']")).click();
		
		//Capyure City Name
		System.out.println("Entered City Name is:-"+Board.getAttribute("value"));
		
		//date 28-11-2023
		//Locate Board City Dropdown
		WebElement	loc=	driver.findElement(By.cssSelector("input#to_stn_input"));
		loc.sendKeys("Wardha");
		driver.findElement(By.xpath("//li[text()='WARDHA JN | WR']")).click();
	
	//loc.click();
		System.out.println("Enter PUT City name is:-"+loc.getAttribute("value"));
		//click on Calendar
		driver.findElement(By.cssSelector("input#datepicker_train")).click();
		
		//Click on date 30
	
		Thread.sleep(2000);
		WebElement date=driver.findElement(By.xpath("//td[text()='17']"));
		date.click();
		
		//Click on search button
		driver.findElement(By.cssSelector("button#search_btn_dweb")).click();
		Thread.sleep(2000);
		
		//Click on Book Now Button
		driver.findElement(By.xpath("(//div[@class='text-center book_now_btn show_six_day 6_button_12967_SL'])[1]")).click();
		
		//Scroll page
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
	
//		//SL - Sleeper on click
//		//driver.findElement(By.xpath("//span[text()='18 Dec']")).click();
//		driver.findElement(By.id("price_1_12656_SL")).click();
//		//driver.findElement(By.cssSelector("button#price_1_12656_SL")).click();
//		
//		//Scroll page
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//				
//		//click on Female
//		driver.findElement(By.xpath("(//li[@data-value='1'])[1]")).click();
//			
//		//driver.findElement(By.id("input#adult_add_fullname")).sendKeys("Chhaya mujbaile");
				
	}

}
