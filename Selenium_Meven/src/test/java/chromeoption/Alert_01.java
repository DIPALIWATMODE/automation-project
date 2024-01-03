package chromeoption;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import base_class.BASE_2;

public class Alert_01 extends BASE_2 {

	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stu			
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--disable-notification");
		launchBrowser("Simple Alert");
		NavigateUrl("https://nxtgenaiacademy.com/alertandpopup");
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alt = driver.switchTo().alert();
	Thread.sleep(2000);
		alt.accept();
	}

	
	}


