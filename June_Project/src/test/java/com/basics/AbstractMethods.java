package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractMethods {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

//	String title=driver.getTitle();
//	String url=driver.getCurrentUrl();
//	
//	System.out.println(title);
//	System.out.println(url);
//	
		
		
		driver.findElement(By.xpath("//a[text()='Tech News']")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		
		driver.navigate().refresh();
		
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,250)");
//		
//		
//		String window=driver.getWindowHandle();
//
//		System.out.println(window);
//		
		
	//	driver.findElement(By.id("newTabBtn")).click();

		Thread.sleep(2000);
		driver.quit();

	}

}
