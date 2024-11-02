package day30;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		// normal alert with ok button
		
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		//Alert myalert=driver.switchTo().alert();
		;
		//myalert.accept();
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		//Alert myalert=driver.switchTo().alert();
		//myalert.accept();
		//myalert.dismiss();
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
       
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("hh");
		myalert.accept();
		String res=driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		if(res.contains("hhaa"))
		{
			System.out.println("test passed");
		
		}
		else
		{
			System.out.println("test failed");
		}
	}

}
