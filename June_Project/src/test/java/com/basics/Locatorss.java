package com.basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorss {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//List<WebElement> tags = driver.findElements(By.tagName("div"));

		driver.findElement(By.id("name")).sendKeys("sairam jakkam");
		
		driver.findElement(By.linkText("Hom")).click();

	}
}
