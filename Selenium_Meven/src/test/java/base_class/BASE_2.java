package base_class;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class BASE_2 {

	//Dynamic Code
		public static WebDriver driver;
		public static Actions act;
		public static String parentwindowid;
		public static String childWindowid;
		
		public static void Dipali(String ScreenshotB) throws Throwable {
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("../Selenium_Meven/screendowen/"+ScreenshotB+".png"));
		}
		
		//Actions class
		public static void action() {
		act= new Actions(driver);
		}
		public static void launchBrowser(String browser) {
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notification");
			driver =new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		public static void NavigateUrl(String url) {
			driver.get(url);
			System.out.println("Navigate Url is:-"+url);
			System.out.println("Title of wenpage is :-"+driver.getTitle());
		}
		public static void Handling() {
			Set<String>	window=driver.getWindowHandles();
			Iterator<String> it=window.iterator();
			String parentwindowid =it.next();
			String childWindowid=it.next();
		}
		
	    	}    	
	    	
	    	
