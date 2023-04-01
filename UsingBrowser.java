package com.demoqa.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class UsingBrowser {
WebDriver driver;
@BeforeTest
public void openBrowser() {
	System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers.msedgedriver.exe");
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
}
@Ignore
@Test
public void browserWindow() throws InterruptedException {
	driver.findElement(By.xpath("//button[.='New Tab']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='New Window']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='New Window Message']")).click();
}
@Test
public void alert() throws InterruptedException {
	driver.findElement(By.xpath("//button[.='Click me']")).click();
	Alert alert =driver.switchTo().alert();
	alert.accept();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	Thread.sleep(5000);
	alert.accept();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	alert.accept();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	alert.sendKeys("Dharshan");
	alert.accept();
	
}
}

