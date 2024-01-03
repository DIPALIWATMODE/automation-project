package Screenshort;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.jar.asm.Handle;

public class Screen_H3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.goibibo.com/");
		
		 File ts=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File rest=new File("../Selenium_Meven/src/test/java/Screenshort/Screen_H3.java//screendowen/img.png");
		 //FileHandler.
		 
		FileHandler.copy(ts, rest);
		

	}

}
