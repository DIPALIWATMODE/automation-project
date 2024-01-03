package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_class.BASE_2;

public class CopyAndPasteAmazon extends BASE_2{


	public static void main(String[] args) throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.amazon.in/");

		// Mouse Hover
		WebElement account = driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']"));

		// Actions Class
		Actions act = new Actions(driver);
		act.moveToElement(account).build().perform();
		Dipali("Move to Account Link");

//		// Capture Text of Element
//		System.out.println("Move to Element is:- " + account.getText());
//
//		// Click on Your Orders
//		driver.findElement(By.xpath("//a[@id='nav_prefetch_yourorders']")).click();
//		Dipali("After Click on Your Orders");
//
//		// Click on Create account link
//		driver.findElement(By.linkText("Create your Amazon account")).click();
//
//		WebElement name = driver.findElement(By.id("ap_customer_name"));
//
//		// Send input
//		act.moveToElement(name).sendKeys("Mahesh").build().perform();
//		Dipali("After enter Name");
//
//		// To Capture input data
//		System.out.println("Input data of Name Field is:- " + name.getAttribute("value"));
//
//		// Press Control A
//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//
//		// Press Control c
//		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//
//		// Press Tab button
//	//	act.sendKeys(Keys.TAB).build().perform();
//		act.keyDown(Keys.TAB).build().perform();
//
//		// Press Control V
//		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
//		Dipali("After Input is Paste");
//	

}}
