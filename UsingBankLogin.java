package com.demoqa.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UsingBankLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers\\EdgeDriver.msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.findElement(By.xpath("//button[.='Bank Manager Login']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-lg tab']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ashok");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Balaji");
		driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("600126");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    driver.findElement(By.xpath("//button[@class='btn btn-lg tab']")).click();
	    WebElement select=driver.findElement(By.xpath("//select[@name='userSelect']"));
	    Select d= new Select (select);
	    d.selectByVisibleText("Ashok Balaji");
	    WebElement select1 = driver.findElement(By.xpath("//select[@name='currency']"));
	    Select d1 = new Select(select1);
	    d1.selectByVisibleText("Rupee");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);
	    alert.accept();
	   // driver.findElement(By.xpath("//button[.='Customers']")).click();
	    Thread.sleep(2000);
	   // driver.findElement(By.xpath("//input[@placeholder='Search Customer']"))
	    
	    
	    
	}

}
