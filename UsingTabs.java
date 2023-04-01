package com.demoqa.com;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.selenium.programees.UsingLog4j1;

public class UsingTabs {
	static Logger log = Logger.getLogger(UsingTabs.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("LogProperty");
		System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers\\EdgeDriver.msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		log.info("going to open URL");
		driver.get("https://demoqa.com/tabs");
		log.info("Window or URL opened");
		log.info(driver.getCurrentUrl());
		log.info("going to click on What");
		driver.findElement(By.xpath("//a[.='What']")).click();
		log.info("going to click on Origin");
		driver.findElement(By.xpath("//a[.='Origin']")).click();
		log.info("going to open use");
		driver.findElement(By.xpath("//a[.='Use']")).click();
		
	}

}
