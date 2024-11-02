package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleCheckboxes {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='sunday']"));
		System.out.println("check box is selected or not:"+checkbox.isSelected());

	}

}
