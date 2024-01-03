package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_class.BASE_2;

public class Action_2_2 extends BASE_2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("shirt");//2 nd sathi webelement ghe
		
		Actions act =new Actions(driver);
		act.moveToElement(
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).doubleClick().build().perform();
		
//		act.doubleClick().build().perform();
		 
	}

}
