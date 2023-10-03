package com.basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertss {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
		
		Thread.sleep(3000);
			
		Alert alerts=driver.switchTo().alert();
		
		alerts.sendKeys("Tommy");

	}

}
