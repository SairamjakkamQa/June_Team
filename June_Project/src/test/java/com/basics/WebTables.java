package com.basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		List<WebElement> Data=driver.findElements(By.tagName("tr"));
		System.out.println(Data.size());
		
//		for(WebElement Dataa:Data) {
//			
//			System.out.println(Dataa.getSize());
//			
//		}
		
		
	}
}
