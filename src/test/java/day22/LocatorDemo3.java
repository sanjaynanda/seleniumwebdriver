package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		//driver.findElement(By.xpath("//*[text()='Checkout']")).click();
		 //int i=driver.findElements(By.xpath("//a[@class='nav-link']")).size();
		//System.out.println(i);
		boolean st=driver.findElement(By.xpath("//*[@title='Your Store']")).isDisplayed();
		System.out.println(st);
		//driver.findElement(By.xpath("//*[@name=\"search\" or @placeholder=\"Search\"]")).sendKeys("dfkjf");
		//driver.findElement(By.xpath("//*[@class=\"fa-solid fa-magnifying-glass\"]")).click();
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//a[@title=\"Wish List (0)\"]/span")).click();
		//System.out.println("able to find wishlist locator");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@title=\"Shopping Cart\"]/span")).click();
		System.out.println("Reached the ending of  the automation script");
	}

}
