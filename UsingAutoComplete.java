package com.demoqa.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingAutoComplete {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers\\EdgeDriver.msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/auto-complete");
		driver.findElement(By.xpath("//input[@id='autoCompleteMultipleInput']")).sendKeys("Red, Blue,Green");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='autoCompleteSingleInput']")).sendKeys("Blue");
		
	}

}
