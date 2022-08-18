package com.SampleTest_Prac;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SampleTest 
{
	@Test
	public void SampleTest() throws Throwable
	
	{
WebDriver driver=new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("./CommonProperties.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		System.out.println("login to appplication");
		String url= pobj.getProperty("Url");
		driver.get(url);
		
		System.out.println("-----------------");
		System.out.println("welcome to jenkins");
		;
		
		driver.close();
	}
}
