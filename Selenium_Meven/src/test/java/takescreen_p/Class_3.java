package takescreen_p;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base_class.Base_Test3;

public class Class_3 extends Base_Test3{

	public static void main(String[] args) throws Throwable {
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		Base_Test3.takescreen("redbus");
		
	}
}
