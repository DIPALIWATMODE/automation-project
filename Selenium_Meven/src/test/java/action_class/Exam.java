package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base_class.BASE_2;

public class Exam extends BASE_2{

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[text()='Sell']")).click();
		Dipali("screenshort_1");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();
		Dipali("screenshort_2");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@aria-label='Amazon.in']")).click();
		WebElement scr =driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		scr.sendKeys("shart");
		scr.click();
		Dipali("screenshort_3");
		
		Thread.sleep(2000);
		JavascriptExecutor hh= (JavascriptExecutor) driver	;
		hh.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Dipali("screenshort_4");
		
				
	
	}

	
	

}
