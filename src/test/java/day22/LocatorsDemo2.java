package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("search")).sendKeys("sdfjl");
		//Thread.sleep(3000);
		//driver.findElement(By.name("search")).clear();
		//driver.findElement(By.className("form-control-lg")).sendKeys("FD");
		//driver.findElement(By.className("fa-magnifying-glass")).click();
		//boolean st=driver.findElement(By.className("d-md-inline")).isDisplayed();
        //System.out.println(st);
		
		//driver.findElement(By.className("fa-cart-shopping")).click();
        //driver.findElement(By.xpath("//img[@title='iPhone']")).click();
		driver.findElement(By.linkText("Software")).click();
		
		Thread.sleep(15000);
		driver.findElement(By.linkText("Phones & PDAs")).click();
		Thread.sleep(15000);
		driver.findElement(By.linkText("Cameras")).click();
		
		driver.findElement(By.linkText("MP3 Players")).click();
		driver.findElement(By.linkText("Show All MP3 Players")).click();
		//driver.findElement(By.className("see-all")).click();
		driver.findElement(By.linkText("test 11 (0)")).click();		
		System.out.println(driver.findElements(By.linkText("Continue")).size());
		driver.findElement(By.linkText("Continue")).click();
		
	}

}
