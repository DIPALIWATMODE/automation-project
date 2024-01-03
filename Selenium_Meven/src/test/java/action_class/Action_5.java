package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_class.BASE_2;

public class Action_5 extends BASE_2{

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.railyatri.in/");
	
				//Actions class
		act=new Actions(driver);
		//act.moveToElement(search);
	WebElement search=	driver.findElement(By.cssSelector("input[placeholder='Enter train no. or name']"));
	act.moveToElement(search).click().sendKeys("12722").build().perform();
	driver.findElement(By.cssSelector("img#img_search")).click();
	Dipali("Dkshin");
}
}
