package small_units;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.tracing.Propagator.Setter;

import base_class.BASE_2;

public class Handl_P_C_c_P extends BASE_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.salesforce.com/");
		 
		//Scroll to page
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0.1600)");
		
		//Click on link
		driver.findElement(By.linkText("start free trial")).click();
		//driver.findElement(By.xpath("//[text()='start free trial']")).click();
		Set<String>	window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String parentwindowid =it.next();
		String childWindowid=it.next();
		
		System.out.println("parent windowid ID is :-"+parentwindowid);
		System.out.println("child Windowid ID is :-"+childWindowid);
		
//		//Switch to child tab
//		driver.switchTo().window(childWindowid);
//		
//		//send date in first name
//		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("abc");
//		
//		//Swtch to parant tab
//		driver.switchTo().window(parentwindowid);
//		driver.findElement(By.linkText("Watch demo")).click();
	}

}
