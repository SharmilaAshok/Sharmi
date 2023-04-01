package com.demoqa.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingAccordian {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers\\EdgeDriver.msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/accordian");
		
		WebElement firstBox = driver.findElement(By.xpath("//div[.='What is Lorem Ipsum?']"));
		Thread.sleep(2000);
		Actions action = new Actions (driver);
	//	WebElement s1 = driver.findElement(By.xpath("//div[.='Where does it come from?']"));
		action.moveToElement(firstBox).click().perform();
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[.='Why do we use it?']")).click();
		
		WebElement s1 = driver.findElement(By.xpath("//div[.='Where does it come from?']"));
		action.moveToElement(s1).click().perform();
		
		Thread.sleep(2000);
		action.moveToElement(s1).click().perform();
		
		WebElement s3 = driver.findElement(By.xpath("//div[.='Why do we use it?']"));
		Thread.sleep(2000);
		action.moveToElement(s3).click().perform();
		Thread.sleep(2000);
		action.moveToElement(s3).click().perform();
		
		
	}

}
