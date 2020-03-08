package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstMavenClass {
	
	@Test
	public void test1()
	{

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/app.php");

		 dr.findElement(By.id("nav_automobile")).click();
        dr.findElement(By.xpath("//button[@id='opendateofmanufacturecalender']")).click();
			}

}
