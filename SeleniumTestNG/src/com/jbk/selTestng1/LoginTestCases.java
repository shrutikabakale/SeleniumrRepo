package com.jbk.selTestng1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestCases {
	@Test
	public void checkHeading(){
	String URL = "file:///C:/Users/lenovo/Desktop/Java_Selenium/Selenium/SetUpFile/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html";
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(URL);
	String actTitle=driver.getTitle();
	Assert.assertEquals(actTitle,"blank not allow");

}
}
