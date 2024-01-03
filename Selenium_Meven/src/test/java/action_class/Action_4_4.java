package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_class.BASE_2;

public class Action_4_4 extends BASE_2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.amazon.in");
			
			WebElement account =	driver.findElement(By.cssSelector("a#nav-link-accountList"));
		//	WebElement acc=driver.findElement(By.xpath("(//span[@style='visibility: visible;'])[2]"));
			//Action class
		// act=new Actions(driver);
		 act.moveToElement(account).build().perform();
		
		//Capture text of Element
		 System.out.println("MOVE TO ELEMENT :-"+account.getText());
		
		//Click on Your Wish List
		 WebElement wish =	driver.findElement(By.xpath("//span[text()='Your Wish List']"));
		 Dipali("Action4_4");
	
		 //Capture Text of Element
		 System.out.println(wish.getText());
		 wish.click();
		Dipali("Action-4'-4");
		
		
	}

}
