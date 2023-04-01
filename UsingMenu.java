package com.demoqa.com;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingMenu {
	static Logger log = Logger.getLogger(UsingMenu.class);
	public static void main(String[] args) throws InterruptedException {
		PropertyConfigurator.configure("LogProperty");
		System.setProperty("webdriver.msedgedriver.driver", "C:\\WebDrivers\\EdgeDriver.msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		log.info("Open URL");
		driver.get("https://demoqa.com/menu#");
		log.info("Click on Main Item 1");
		driver.findElement(By.xpath("//a[.='Main Item 1']")).click();
		log.info("Click on Main Item 2");
		driver.findElement(By.xpath("//a[.='Main Item 2']")).click();
		log.info("Click on Sub Item");
		driver.findElement(By.xpath("//a[.='Sub Item']")).click();
		log.info("Click on Sub Sub List");
		Actions action = new Actions(driver);
		WebElement s =driver.findElement(By.xpath("//a[.='SUB SUB LIST »']"));
		action.moveToElement(s).click().build().perform();
		log.info("Click on Sub sub Item 1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Sub Sub Item 1']")).click();
		Thread.sleep(2000);
		log.info("Click on sub sub Item 2");
		driver.findElement(By.xpath("//a[.='Sub Sub Item 2']")).click();
		log.info("Click on Main Item 3");
		driver.findElement(By.xpath("//a[.='Main Item 3']")).click();
		
		
		
	}

}
