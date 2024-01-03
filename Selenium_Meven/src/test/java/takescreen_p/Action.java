package takescreen_p;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_class.Base_1;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.amazon.in");
			
			//search
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("acb");
			//ACtion class
			Actions act =new Actions(driver);
			act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).doubleClick().build().perform();
			
			
	}

}
