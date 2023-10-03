package com.basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitss {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(30));

//		driver.findElement(By.id("alert")).click();
//
//		Alert element = waits.until(ExpectedConditions.alertIsPresent());
//
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
		WebElement  hiddenbtn=driver.findElement(By.id("hidden"));
		
		driver.findElement(By.id("display-other-button")).click();
		
		waits.until(ExpectedConditions.elementToBeClickable(hiddenbtn));
				
		System.out.println(hiddenbtn.isDisplayed()); //after waiting for 10 seconds this statement excecutes 
		
		
		
		
		

	}

}
