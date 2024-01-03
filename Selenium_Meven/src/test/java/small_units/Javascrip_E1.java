package small_units;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascrip_E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		
		//Scroll to page/vrun yenar
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1200)");//1
	
//	//Click on python explore//3
//	driver.findElement(By.linkText("Women")).click();
//	
	//scroll to bottom of page/khalun yenar
js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//
//	
	
	}

}
 