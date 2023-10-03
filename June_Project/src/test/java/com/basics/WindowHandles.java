package com.basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String mainwindow = driver.getWindowHandle();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");

		driver.findElement(By.id("newWindowBtn")).click();

		Set<String> handles = driver.getWindowHandles();

		// System.out.println(handles);

		for (String windowids : handles) {

			if (!mainwindow.equals(windowids)) {

				driver.switchTo().window(windowids);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("jakkam");
				break;
			}
		}

		driver.switchTo().window(mainwindow);
		driver.findElement(By.id("name")).sendKeys("ferrari");
	}

}
