package day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\demo.opencart.com");
		//driver.get("https://);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.name("search")).sendKeys("bull");
		driver.findElement(By.className("form-control")).clear();
	
		driver.findElement(By.className("form-control")).sendKeys("dsjfdsl");
		//driver.findElement(By.xpath("//i[@class='fa-solid fa-magnifying-glass']")).click();
		boolean st=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(st);
		driver.findElement(By.linkText("Tablets")).click();
		driver.findElement(By.partialLinkText("Components")).click();
		List<WebElement> header=driver.findElements(By.className("list-inline-item"));
		System.out.println("size of the header list: "+header.size());
		List<WebElement> header2=driver.findElements(By.className("d-none"));
		System.out.println("size of the header2 list: "+header2.size());

	}

}
