package base_class;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Base_Test3 {

	public static WebDriver driver;
	
	public static void takescreen(String Screenshotname) throws IOException {
		TakesScreenshot ts =(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target =new File("../Selenium_Meven/screendowen/"+Screenshotname+".png");
		FileHandler.copy(src, target);
		
	}
	
	
	
	
	
	
}
