package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base_class.BASE_2;

public class CopyAndPast_6_6 extends BASE_2{

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("AATY");
		
	Dipali("put value");
	
		action();
		//Press Control A (select)
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		//Press Control C
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//Press Tab button(khali yenysathi) 2WAY
	//	act.sendKeys(Keys.TAB).build().perform();//1 way
		act.keyDown(Keys.TAB).build().perform();//2 way
		
		//Press Control V (pest)
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	Dipali("peast value");
		
		WebElement seen=driver. findElement(By.xpath("//div[@class='_9lsb _9ls8']"));
		act.moveToElement(seen).click().build().perform();
}
	}