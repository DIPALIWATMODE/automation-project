package action_class;

import java.awt.Desktop.Action;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_class.BASE_2  ;

public class Action_4 extends BASE_2{

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");
		
		//Mouse hover
		WebElement account =driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']"));
		
		//Action class
		Actions act =new Actions(driver);//org
		//act.moveToElement(account).build().perform();
		act.moveToElement(account).build().perform();
		BASE_2 .Dipali("Move to account");
		
		//Capture text of Element
		System.out.println("Move to Element is :-"+account.getText());
		driver.findElement(By.xpath("//a[@id='nav_prefetch_yourorders']"));
		
		//driver.findElement(By.)
		
	}

	
	
	
	
	
	
}
