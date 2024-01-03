package Screenshort;

import java.awt.desktop.OpenFilesHandler;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.io.FileHandler;
public class H2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//WebDriver driver =new ChromeDriver();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.jeevansathi.com/");
		
		 File wsrc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File wdist=new File("../Selenium_Meven/screendowen/img.png");
		 FileHandler.copy(wsrc, wdist);
		 
	}
	

}
