package com.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement nametextfield = driver.findElement(By.id("name"));

		boolean report = nametextfield.isEnabled();

		System.out.println(report);

		driver.findElement(By.id("email")).sendKeys("sairam@gmail.com");

		WebElement dropdown = driver.findElement(By.id("country"));

		Select sel = new Select(dropdown);

		sel.selectByIndex(9);

		WebElement checkbox = driver.findElement(By.id("sunday"));
		checkbox.click();

		// System.out.println(checkbox.isSelected());

		WebElement title = driver.findElement(By.id("header-inner"));

		System.out.println(title.isDisplayed());

	}

}
