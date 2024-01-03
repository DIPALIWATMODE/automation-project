package chromeoption;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import base_class.BASE_2;

public class Prompt_01 extends BASE_2{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchBrowser("Prompt_pop");
		NavigateUrl("https://nxtgenaiacademy.com/alertandpopup");
		
		//alert prompt twoway
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']"));
		Alert alt =  driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
	}

}
