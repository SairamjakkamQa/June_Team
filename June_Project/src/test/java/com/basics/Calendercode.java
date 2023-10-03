package com.basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendercode {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String month = "December";
		String Date = "19";
		String year = "2027";

		driver.findElement(By.id("first_date_picker")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");

		while (true) {

			String monthandyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

			String[] month_year = monthandyear.split(" ");

			String mnth = month_year[0];

			String yr = month_year[1];

			if (mnth.equalsIgnoreCase(month) && (yr.equals(year))) {
				break;

			} else {

				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}

		}

		List<WebElement> days = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));

		for (WebElement datess : days) {

			if (datess.getText().equals(Date)) {
				datess.click();
			}

		}

	}
}
