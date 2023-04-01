package com.demoqa.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UsingForm {
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers.msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
}
	@Test
	public void studentRegistrationForm () throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Dharshan");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Ashok Balaji");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Dharshan@example.com");
		//driver.findElement(By.xpath("//label[@class ='custom-control-label']/input[@value='Male']")).click();
		driver.findElement(By.xpath("//label[.='Male']")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		
		Thread.sleep(2000);
		WebElement select1 = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Thread.sleep(2000);
		Select d1= new Select(select1);
		d1.selectByValue("2015");
		Thread.sleep(2000);
		WebElement select2 = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select d2 = new Select(select2);
		d2.selectByValue("8");
		driver.findElement(By.xpath("//div[.='26']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.xpath("//label[.='Sports']")).click();
		WebElement uploadElement = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		uploadElement.sendKeys("C:\\SeleniumScreenShot\\dharshan.jpg");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Madambakkam");
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		//driver.findElement(By.xpath("//div[@id='stateCity-wrapper']/div[.='Uttar Pradesh']")); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='react-select-3-input']")).sendKeys("Rajasthan",Keys.ENTER);
		Thread.sleep(20000);
	driver.findElement(By.xpath("//input[@id='react-select-4-input']")).sendKeys("Jaipur",Keys.ENTER);
	Actions action = new Actions(driver);
		WebElement submit =driver.findElement(By.xpath("//button[@id='submit']"));
		action.moveToElement(submit).click().perform();
		
	
	}
}
