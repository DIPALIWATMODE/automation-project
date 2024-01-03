package chromeoption;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base_class.BASE_2;

public class ChromOo extends BASE_2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChromeOptions options =new ChromeOptions();
     WebDriver driver=new ChromeDriver(options);
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.get("https://www.spicejet.com/");
     
	}

}
