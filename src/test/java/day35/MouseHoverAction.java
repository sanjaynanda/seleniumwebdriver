package day35;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\demo.opencart.com");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement desktops=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		Actions act=new Actions(driver);
		//act.moveToElement(desktops).moveToElement(mac).perform();
		act.moveToElement(desktops).perform();
		//Thread.sleep(5000);
		//act.moveToElement(mac).perform();
		act.contextClick(mac).perform();
		
	}

}

