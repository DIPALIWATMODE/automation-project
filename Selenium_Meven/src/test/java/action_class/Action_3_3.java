package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_class.BASE_2;

public class Action_3_3 extends BASE_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		driver.switchTo().frame(frame);
		//source
		WebElement source=driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement source_1= driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		
		//target
		WebElement target= driver.findElement(By.cssSelector("div#trash"));
		
		Actions act =new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		act.dragAndDrop(source_1, target).build().perform();
		
	}

}
