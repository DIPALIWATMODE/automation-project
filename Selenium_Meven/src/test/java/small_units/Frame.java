package small_units;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base_class.BASE_2;

public class Frame extends BASE_2{

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		Dipali("frame photo");
		//frame      frame(0)getala ahe karn 3 frame ahe mhanu
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("java.awt")).click();
		Thread.sleep(3000);
		Dipali("frame_1");
		
		//To come out from frame
		driver.switchTo().defaultContent();
		
		//frame locate with of help of index
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Paint")).click();
		Thread.sleep(2000);
		Dipali("frame_2");
		
		//To come out from frame
		driver.switchTo().defaultContent();
		//driver.findElement(By.xpath(null))
		
	}
}
