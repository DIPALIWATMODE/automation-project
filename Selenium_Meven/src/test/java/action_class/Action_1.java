package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_class.BASE_2;

public class Action_1 extends BASE_2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		//Action class
		Actions act=new Actions(driver);
		
	WebElement createAcc = driver.findElement(By.linkText("Create new account"));
	//Capture name of web element
	System.out.println("Click on WebElement is:-"+createAcc.getText());
	act.moveToElement(createAcc).click().build().perform();//multipale gosti sathi used hote like click/send
	Thread.sleep(2000);
	//Right click
    act.contextClick().build().perform();//
	Thread.sleep(2000);
    Dipali("Create Account page");
    
 
}
}