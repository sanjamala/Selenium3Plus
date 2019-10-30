package demoOct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewReistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		driver = MyDrivers999.getDriver("CRM");
		 driver.manage().window().maximize();//Full Screen
		 Thread.sleep(3000);
		 driver.get("http://newtours.demoaut.com/");
		WebElement Uname = driver.findElement(By.name("userName"));
			Uname.sendKeys("demo");
			//driver.findElement(By.name("userName")).sendKeys("demo");
			WebElement Pswrd = driver.findElement(By.name("password"));
			Pswrd.sendKeys("demo");		 
			WebElement Sbmt = driver.findElement(By.name("login"));
			Sbmt.click();	
			Thread.sleep(10000);
			driver.close();

		 
	}

}
