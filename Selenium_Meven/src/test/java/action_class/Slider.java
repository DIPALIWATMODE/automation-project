package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_class.BASE_2;
import takescreen_p.Action;

public class Slider extends BASE_2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://jqueryui.com/slider/");
		
		//Locate frame
	WebElement frame= driver.findElement(By.cssSelector("iframe.demo-frame"));
	
		//To Enter in side switch
		driver.switchTo().frame(frame);
		
	WebElement slider=	driver.findElement(By.xpath("//div[@id='slider']/span"));
//															//div[@id='slider']/span
		//Action class
	action();
	//Actions act=new Actions(driver); //3way
//	/	act.dragAndDropBy(slider, 300, 0).build().perform();//1
	act.clickAndHold().moveByOffset(700, 0).release().build().perform();//2
//	act.moveToElement(s)
      		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
