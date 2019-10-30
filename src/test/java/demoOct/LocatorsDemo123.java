package demoOct;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class LocatorsDemo123 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = MyDrivers999.getDriver("CRM");
		 driver.manage().window().maximize();//Full Screen
		 Thread.sleep(3000);
		 Dimension d = new Dimension(300,600);//define ur desired size x,y
		 driver.manage().window().setSize(d);
		 
		 Point p= new Point(300,700); //
		 driver.manage().window().setPosition(p);
		 Thread.sleep(10000);
		driver.get("http://newtours.demoaut.com/");
		//WebElement Uname = driver.findElement(By.name("userName"));
		//Uname.sendKeys("demo");
//		driver.findElement(By.name("userName")).sendKeys("demo");
//		WebElement Pswrd = driver.findElement(By.name("password"));
//		Pswrd.sendKeys("demo");		 
//		WebElement Sbmt = driver.findElement(By.name("login"));
//		Sbmt.click();	
//		
//		
//		List<WebElement> T_link = driver.findElements(By.tagName("a"));
//		
//		int Tn_links = T_link.size();
//		System.out.println("Total no.of Links in the Page Are:" + Tn_links);
//		for(int i=0;i<Tn_links;i++) {
//			String LinkText = T_link
//		}
		
		
		
		Thread.sleep(10000);
		driver.close();
	}

}
