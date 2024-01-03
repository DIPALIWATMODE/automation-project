package maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Meaven_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		WebElement drag =driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		act.dragAndDrop(drag, drop).build().perform();
		
		
		
		} 
}
