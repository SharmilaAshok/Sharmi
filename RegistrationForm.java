package com.demoqa.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers\\EdgeDriver.msedgedriver");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.nhp.gov.in/registration");
		driver.findElement(By.xpath("//input[@id='hospitalname']")).sendKeys("Apollo");
		 driver.findElement(By.xpath("//input[@value='Private']")).click();
		driver.findElement(By.xpath("//textarea[@name='accreditation']")).sendKeys("Others");
		driver.findElement(By.xpath("//input[@value='Community Health Centre']")).click();
		driver.findElement(By.xpath("//input[@id='hospitalregisnumber']")).sendKeys("12345");
		WebElement uploadElement = driver.findElement(By.xpath("//input[@id='Registerationnumberscan']"));
		uploadElement.sendKeys("C:\\SeleniumScreenShot\\dharshan.jpg");
		driver.findElement(By.xpath("//input[@id='nodalpersoninfo']")).sendKeys("Rani Dr");
		driver.findElement(By.xpath("//input[@id='nodalpersontele']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='nodalpersonemailid']")).sendKeys("Rani@example.com");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Maddambakkam");
		WebElement select = driver.findElement(By.xpath("//select[@id='state']"));
		Select d = new Select(select);
		d.selectByVisibleText("Tamil Nadu");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		WebElement select1 = driver.findElement(By.xpath("//select[@id='district']"));
		Select d1 = new Select(select1);
		d1.selectByVisibleText("Coimbatore");
		WebElement select2 = driver.findElement(By.xpath("//select[@id='subdristrict']"));
		Select d2 = new Select(select2);
		Thread.sleep(2000);
		d2.selectByVisibleText("Pollachi");
		Thread.sleep(2000);
		WebElement select3 = driver.findElement(By.xpath("//select[@id='town']"));
		Select d3 = new Select(select3);
		d3.selectByVisibleText("Anaimalai (TP)");
		Thread.sleep(2000);
		WebElement select4 = driver.findElement(By.xpath("//select[@id='village']"));
		Select d4 = new Select(select4);
		d4.selectByVisibleText("A. Nagoor");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pincode']")).sendKeys("600126");
		driver.findElement(By.xpath("//input[@id='stdcode']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='telephone']")).sendKeys("1234598760");
		driver.findElement(By.xpath("//input[@id='mobilenumber']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='emergencynum']")).sendKeys("1234567891");
		driver.findElement(By.xpath("//input[@id='ambulancephoneno']")).sendKeys("108");
		driver.findElement(By.xpath("//input[@id='bloodbankbphonenum']")).sendKeys("103");
		driver.findElement(By.xpath("//input[@name='foreignpcare']")).sendKeys("D Block");
		driver.findElement(By.xpath("//input[@id='tollfree']")).sendKeys("100080000");
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//input[@id='helpline']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='hospitalfax']")).sendKeys("789");
		driver.findElement(By.xpath("//input[@id='hospitalprimaryemailid']")).sendKeys("Hospitalexample.com");
		driver.findElement(By.xpath("//input[@id='hospitalsecondaryemailid']")).sendKeys("Hospitalexample1.com");
		driver.findElement(By.xpath("//input[@id='website']")).sendKeys("http://www.example.com");
		driver.findElement(By.xpath("//input[@id='establisedyear']")).sendKeys("1970");
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//input[@name='googlemapcorridinate_longi']")).sendKeys("28.552146,77.17608");
		driver.findElement(By.xpath("//input[@name='googlemapcorridinate_lati']")).sendKeys("28.552146,77.17231");
		js.executeScript("window.scrollBy(0,600)");
		driver.findElement(By.xpath("//input[@id='numberofdocotor']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@id='numofmediconsultantorexpert']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@id='totalnumofbeds']")).sendKeys("525");
		driver.findElement(By.xpath("//input[@id='numberofprivatewards']")).sendKeys("25");
		driver.findElement(By.xpath("//input[@id='numofbedforecoweakersec']")).sendKeys("500");
		driver.findElement(By.xpath("//input[@value='CGHS']")).click();
		driver.findElement(By.xpath("//input[@value='No']")).click();
		driver.findElement(By.xpath("//input[@name='tariffrange']")).sendKeys("10000-500000");
		
		
		
		
		
		
		
		

	}

}
