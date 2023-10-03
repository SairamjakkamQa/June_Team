package testngs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginFunctionality {

	WebDriver driver;

	@BeforeMethod

	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://poojastore.marolix.com/#");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[text()='Log In']")).click();

	}

	@Test(dataProvider = "user", dataProviderClass = USerdata.class)

	public void verifylogin(String username, String password) {


		driver.findElement(By.xpath("//input[@placeholder='example@gmail.com']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@title='Please enter your password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='btn btn-dark btn-md w-100']")).click();
		
		String url=driver.getCurrentUrl();
		
		Assert.assertEquals("http://poojastore.marolix.com/", url);
		
	}

	@AfterMethod
	
	public void teardown() {

	}
}
