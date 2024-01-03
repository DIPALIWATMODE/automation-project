package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_class.BASE_2;

public class Action_2 extends BASE_2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("abc");
		
		//Action class
		Actions act = new Actions(driver);
		
		//Double click//abc he blue line madhe yetoy
		//1 method 
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).doubleClick().build().perform();
		//2 method
		act.moveToElement(searchbox).doubleClick().build().perform();
		//to capture input 
		System.out.println("Intput data of SearchBox is:-"+ searchbox.getAttribute("value"));
		
	}

}
