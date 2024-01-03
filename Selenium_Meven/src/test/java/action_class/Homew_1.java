package action_class;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import base_class.BASE_2;

public class Homew_1 extends BASE_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(" https://www.myntra.com/");
	}

}
