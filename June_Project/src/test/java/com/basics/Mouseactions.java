package com.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	public static void main(String[] args) throws Throwable {

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Thread.sleep(2000);
		
		//WebElement hover=driver.findElement(By.linkText("Selenium"));
		
		//WebElement	doubles=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		
//		WebElement source=driver.findElement(By.id("draggable"));
//		
//		WebElement destination=driver.findElement(By.id("droppable"));
		
		WebElement rightclicks=driver.findElement(By.id("name"));
		
		Actions ac=new Actions(driver);
		
		ac.contextClick(rightclicks).perform();
		
		//ac.dragAndDrop(source, destination).perform();
		
		
		
		
	}

}
