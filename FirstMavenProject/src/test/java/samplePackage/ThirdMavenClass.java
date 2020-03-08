package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThirdMavenClass {

	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/app.php");

		 dr.findElement(By.id("nav_automobile")).click();
        dr.findElement(By.xpath("//button[@id='opendateofmanufacturecalender']")).click();
		
		String year="2019";
		String month="February";
		String date="1";
		
		//select year

		String actYear =dr.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				
				while(!year.equals(actYear))
				{
					dr.findElement(By.xpath("//a[@title='Prev']")).click();
					actYear =dr.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				}
		
		//select month
	
		String actMonth =dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	
	        	while(!month.equals(actMonth))
	        	{
	        		dr.findElement(By.xpath("//a[@title='Prev']")).click();
	        	    actMonth =dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		        }

    
	        	int rows = dr.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr")).size();

		for (int r = 1; r <= rows; r++)			
		{

			String xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr[" + r + "]/td";

			int cols = dr.findElements(By.xpath(xpath)).size();

			for (int c = 1; c <= cols; c++)				
			{
				String dateXpath = "//table[@class='ui-datepicker-calendar']/tbody/tr[" + r + "]/td[" + c + "]";
    
				//select date 
				
				String actDate = dr.findElement(By.xpath(dateXpath)).getText();

			//	System.out.print(data + " ");
				
				if(date.equals(actDate))
				{
					dr.findElement(By.xpath(dateXpath)).click();
					break;
				}

			}

			System.out.println();

		}

	}
		
}
