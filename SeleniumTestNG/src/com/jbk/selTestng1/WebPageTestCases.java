package com.jbk.selTestng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebPageTestCases {
	/*@Test
	public void checkHeading(){
	String URL = "file:///C:/Users/lenovo/Desktop/Selenium/SetUpFile/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html";
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(URL);
	String actTitle=driver.getTitle();
	Assert.assertEquals(actTitle,"JavaByKiran|Log in");

}
	@Test
	public void  CheckUnameLabel(){
		Assert.assertEquals(7,7);
		
	}
	@Test
	public void TestNumber(){
		int ActualResult=12;
		int expectedResult=12;
		Assert.assertEquals(ActualResult, expectedResult);
	}*/
	
	@Test
	public void CheckBlankUname(){
		String URL = "file:///C:/Users/lenovo/Desktop/Java_Selenium/Selenium/SetUpFile/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html";
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
	    driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys(" ");//Name
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys(" ");//pass
		
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		String Actmsg=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/div")).getText();
		
		Assert.assertEquals(Actmsg,"blank not Allowed");
	}

	@Test
	public void checkWebsiteheading(){
		
		String URL = "file:///C:/Users/lenovo/Desktop/Java_Selenium/Selenium/SetUpFile/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html";
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
	String ActLabel=driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).getText();
	Assert.assertEquals(ActLabel,"Java By Kiran");
	}
	@Test
	public void checkRegistedLink(){
		String URL = "file:///C:/Users/lenovo/Desktop/Java_Selenium/Selenium/SetUpFile/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html";
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
	driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
	String ActLabel="file:///C:/Users/lenovo/Desktop/Java_Selenium/Selenium/SetUpFile/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html";
	Assert.assertEquals(ActLabel,"file:///C:/Users/lenovo/Desktop/Java_Selenium/Selenium/SetUpFile/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/register.html");
		
	}
	@Test
	public void checkCorrectUname(){
		
		String URL = "file:///C:/Users/lenovo/Desktop/Java_Selenium/Selenium/SetUpFile/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html";
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
	    driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("kiran@gmail.com");//Name
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");//pass
		
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		String Actmsg="file:///C:/Users/lenovo/Desktop/Java_Selenium/Selenium/SetUpFile/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html";
		String expectedRest="file:///C:/Users/lenovo/Desktop/Java_Selenium/Selenium/SetUpFile/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html";
		Assert.assertEquals(Actmsg,expectedRest);
	}
	@Test
	public void checkUserlink(){
		
		String URL = "file:///C:/Users/lenovo/Desktop/Java_Selenium/Selenium/SetUpFile/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html";
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		  driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("kiran@gmail.com");//Name
			driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");//pass
			
			driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();//signIn
	    		
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();//userlink
		String Actmsg="file:///C:/Users/lenovo/Desktop/Java_Selenium/Selenium/SetUpFile/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/users.html";
		String expectedRest="file:///C:/Users/lenovo/Desktop/Java_Selenium/Selenium/SetUpFile/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/users.html";
		Assert.assertEquals(Actmsg,expectedRest);
	}
	
}
