package takescreen_p;

import java.io.File
;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class P_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
//		Capture screen shot
		TakesScreenshot ts=(TakesScreenshot) driver;//winding casting
		File src=ts.getScreenshotAs(OutputType.FILE);
		//Folder location
		File target=new File("../Selenium_Meven/screendowen/img.png");		
		//FileHandler.copy	
		//org.openqa.selenium.io.FileHandler.copy(src, target);
			//FileHandler.copy(src, target);
		FileHandler.copy(src, target);
	}

}
