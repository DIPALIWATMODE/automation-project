package takescreen_p;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base_class.BASE_2;

public class Class_4 extends BASE_2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
			 driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.naukri.com/");
			BASE_2.Dipali("NAUKRI");
			
		}
	}

