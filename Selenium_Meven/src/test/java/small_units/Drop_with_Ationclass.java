package small_units;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base_class.BASE_2;

public class Drop_with_Ationclass extends BASE_2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://demoqa.com/select-menu");
		System.out.println("Current url of Webpage is;-"+driver.getCurrentUrl());
		System.out.println("Title of Web page is:-"+driver.getTitle());
	
		//Scroll page with action class(input ctri+O NI HOTE)
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
	//	WebElement	drop1 =driver.findElement(By.xpath("//div[@class='css-yk16xz-control']"));
		WebElement	drop1 =driver.findElement(By.id("oldSelectMenu"));
		Select s=new Select(drop1 );
		s.selectByVisibleText("Black");
		System.out.println("is Dropdown Multi_Selected:-"+s.isMultiple());
		
		//Locate MultiSelect DropDown
		Select s1=new Select(driver.findElement(By.id("cars")));
		s1.selectByValue("volvo");
		System.out.println("is multippp:-"+s1.isMultiple());
		
		//Deselect
		s1.selectByValue("saab");
		s1.deselectByValue("saab");
		
		s1.deselectAll();
		
		
		
		
		
		
		
		
		
	}

}
