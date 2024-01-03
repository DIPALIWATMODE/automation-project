package base_class;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Base_1 {
//public static WebDriver driver;
//	
//	public static void takescreen(String Screenshotname) throws IOException {
//		TakesScreenshot ts =(TakesScreenshot) driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File target =new File("../Selenium_Meven/screendowen/"+Screenshotname+".png");
//		FileHandler.copy(src, target);
//	
	public static WebDriver driver;
	public static void take(String ScreenshotB) throws Throwable {
		
	File gsrc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File hdest=new File("../Selenium_Meven/screendowen/"+ScreenshotB+".png");
    FileHandler.copy(gsrc, hdest);
	
//		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(src, new File("../Selenium_Meven/screendowen/"+ScreenshotB+".png"));
    	}
	
		public static void launchBrowser(String browser) {
    	if (browser.equalsIgnoreCase("chrome")) {
    		driver=new ChromeDriver();
}
    	
    	
    	
		}
	
}
