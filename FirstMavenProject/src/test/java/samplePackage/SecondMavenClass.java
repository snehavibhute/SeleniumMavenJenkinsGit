package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondMavenClass {
	
	@Test
	public void test1() throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");	
		
		ChromeDriver dr=new ChromeDriver();    //how it is launch =by constructor
		
		dr.manage().window().maximize();
		dr.get("https://paytm.com/");
		
		Thread.sleep(5000);
		
		dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		
	}

}
