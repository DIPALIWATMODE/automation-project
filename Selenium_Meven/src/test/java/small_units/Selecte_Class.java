package small_units;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base_class.BASE_2;

public class Selecte_Class extends BASE_2{

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=Cj0KCQiA3uGqBhDdARIsAFeJ5r3RO2qNWn6_s_r7NbIB2IEkDpyX7kEBaI1EXWc7JIH6RBfQ7glo6rEaAoU-EALw_wcB");
		
		System.out.println("Titale of web page is :-"+driver.getTitle());
		System.out.println("Current of url"+driver.getCurrentUrl());
		
		//Select class object
		Select s=new Select(driver.findElement(By.cssSelector("select#reg_relationship")));
		 s.selectByVisibleText("Daughter");
		
		 Dipali("selected class");
		 
	//	 select by value
		 s.selectByValue("4");
	Dipali("selected class");
	
	//select by index
	s.selectByIndex(2);
	Dipali("selected index");
	
	//to chek dropdown multi_selected
	System.out.println(s.isMultiple());
	}

	private static void selectByIndex(int i) {
		// TODO Auto-generated method stub
		
	}

}
