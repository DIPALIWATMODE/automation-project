package action_class;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_class.BASE_2;

public class Action_1_1 extends BASE_2{

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		 
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		Dipali("direct ScreenshoB");
		act.contextClick().build().perform();
		Thread.sleep(3000);
	}

}
