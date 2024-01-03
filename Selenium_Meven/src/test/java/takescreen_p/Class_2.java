package takescreen_p;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import base_class.BASE_2;

public class Class_2 extends  BASE_2  {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
			
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		BASE_2.Dipali("draganddrop");
		
	}

}
