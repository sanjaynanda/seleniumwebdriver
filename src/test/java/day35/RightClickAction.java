package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act=new Actions(driver);
		
		WebElement button=driver.findElement(By.xpath("//span[normalize-space()='right click me']"));
		act.contextClick(button).perform();
		
		driver.findElement(By.xpath("//span[normalize-space()='Cut']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		

	}

}
