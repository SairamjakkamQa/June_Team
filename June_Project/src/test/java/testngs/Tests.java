package testngs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests {
	WebDriver driver;

	@BeforeMethod

	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://poojastore.marolix.com/#");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@Test

	public void Browsertest() {
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
	}

	@Test
	public void test2() {
		driver.findElement(By.xpath("//a[text()='Log In']")).click();

		driver.findElement(By.xpath("//input[@placeholder='example@gmail.com']")).sendKeys("pooja132@gmail.com");
		driver.findElement(By.xpath("//input[@title='Please enter your password']")).sendKeys("1234");
	}

	
	@Test
	
	
	@AfterMethod
	
	public void teardown() {
		
	}
	
	
	
	
	
	
	
	
}
