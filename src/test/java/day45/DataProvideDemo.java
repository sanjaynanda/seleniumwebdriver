package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProvideDemo {
	
	WebDriver driver;

@BeforeClass
 void setup()
 {
	 driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
 
@Test
 void testLogin() throws InterruptedException
 {
	 driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("frt@gmail.com");
	 driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@123");
	 driver.findElement(By.xpath("//input[@value='Login']")).click();
	 Thread.sleep(2000);
	 boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
	 if(status=true)
	 {
		 driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
		 driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Assert.fail();
	 }
 }
 
@AfterClass
 void tearDown()
 {
	
 }
}
