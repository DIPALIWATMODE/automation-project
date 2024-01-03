package Screenshort;

import java.io.File;

import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		
		TakesScreenshot src=(TakesScreenshot) driver;
		File source =src.getScreenshotAs(OutputType.FILE);
		File target=new File("..//Selenium_Meven//screendowen/img.png");
		FileHandler.copy(source, target);
		

	}

}
