package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_class.BASE_2;

public class Action_3 extends BASE_2{

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		//locate frame
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		//To enter into frame
		driver.switchTo().frame(frame);
		
		//Source elemnt
		WebElement source =driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
		WebElement source_1 =driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		WebElement source_2 =driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		WebElement source_3 =driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		
		
		//target element
		WebElement target =driver.findElement(By.cssSelector("div#trash"));
				
		Actions act= new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
//		act.clickAndHold(source_2).moveToElement(target).release().build().perform();
		act.dragAndDrop(source_1, target).build().perform();
		act.dragAndDrop(source_2, target).build().perform();
		act.dragAndDrop(source_3, target).build().perform();

		Thread.sleep(2000);
		//delete element(source)
				WebElement delete =driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
				WebElement delete_1 =driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
				WebElement delete_2=driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
				WebElement delete_3 =driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));

				//Store element(target)
				WebElement store =driver.findElement(By.xpath("//span[text()='Trash']"));
				
		             Actions actr=new Actions(driver);
		             actr.clickAndHold(delete).moveToElement(store).release().build().perform();
		             actr.clickAndHold(delete_1).moveToElement(store).release().build().perform();
		             actr.clickAndHold(delete_2).moveToElement(store).release().build().perform();
		             actr.clickAndHold(delete_3).moveToElement(store).release().build().perform();
		             Dipali("ALL CAP");
		
		
		
		
		
		
				//WebElement store =driver.findElement(By.xpath("//span[text()='Trash']"));
				
//				WebElement source =driver.findElement(By.xpath(""))
//				WebElement source =driver.findElement(By.xpath(""))

}
}