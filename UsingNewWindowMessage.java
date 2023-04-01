package com.demoqa.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingNewWindowMessage {
	public static void main(String []args) throws InterruptedException {
		System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers\\EdgeDriver.msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[.='New Window Message']")).click();
		String parent = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();
		Iterator <String> it = window.iterator();
		while (it.hasNext()) {
			String child = it.next();
			if(child!= parent);
			driver.switchTo().window(it.next());
			Thread.sleep(2000);
			driver.close();
		}
		
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.close();
		
	}

}
