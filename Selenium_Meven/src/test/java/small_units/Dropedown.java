package small_units;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base_class.BASE_2;

public class Dropedown extends BASE_2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.jeevansathi.com/");
		System.out.println("Current url of Webpage is;-"+driver.getCurrentUrl());
		System.out.println("Title of Web page is:-"+driver.getTitle());
		
		//Locate dropdown
	WebElement dropd =	driver.findElement(By.cssSelector("div[data-qa='relationship']"));
	dropd.click();
	
	//First Way TO Click on dropdown option
	List<WebElement> option =driver.findElements(By.xpath("//div[@id='relationshipOptions']/ul/li"));
			
//	for(int i=0;i<option.size();i++) {
//		if(option.get(i).getText().equalsIgnoreCase("son")) {
//			option.get(i).click();
//		}
//	}
	//second way_Direct Click on Dropdon option
	driver.findElement(By.xpath("//div[@id='relationshipOptions']/ul/li[3]")).click();
	}

}
