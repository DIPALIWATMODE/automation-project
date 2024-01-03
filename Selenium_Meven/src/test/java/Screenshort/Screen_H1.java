package Screenshort;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Screen_H1 {

	public static void main(String[] args) throws IOException {
		
//		WebDriverDecorator driver = new WebDriverDecorator();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().impicitiywait(Duration ofsenconds(20));
//
//		driver.get("//hhh://www.make.com/");
//		File src=((TakesScreenshort)driver).getScreenshotAs(OutputType.file);
//		File det=new file("path")
//		fileHandler.copy(src.dest);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.jeevansathi.com/");

		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dist=new File("../Selenium_Meven//screendowen/img.png");
		//FileHandler(scr.dist);
			FileHandler.copy(scr, dist);

	}
}
