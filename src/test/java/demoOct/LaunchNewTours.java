package demoOct;

import org.openqa.selenium.WebDriver;

public class LaunchNewTours {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver45;
		 driver45 = MyDrivers999.getDriver("CRM");
		 driver45.manage().window().maximize();	
		 Thread.sleep(10000);
		driver45.get("http://newtours.demoaut.com/");
		 Thread.sleep(10000);
		driver45.close(); 
	}

}
