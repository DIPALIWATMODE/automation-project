package takescreen_p;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base_class.Base_1;

public class Class_1 extends Base_1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");
		Base_1.take("amazon");
	}

}
