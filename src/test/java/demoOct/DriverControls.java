package demoOct;

import org.openqa.selenium.WebDriver;

public class DriverControls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = MyDrivers999.getDriver("CRM");
		 driver.manage().window().maximize();//Full Screen
		 Thread.sleep(3000);
		 driver.get("https://retail.onlinesbi.com/retail/login.htm");
		 

	}

}
