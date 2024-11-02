package daynew;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@aria-label='Start free trial: We bring companies and customers together']")).click();
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows);
		//driver.findElement(By.xpath("//input[@id='UserFirstName-1Pwn']")).sendKeys("kol");
		//WebElement from=driver.findElement(By.xpath("//input[@placeholder='From']"));
		//from.sendKeys("Sydney");
		//from.sendKeys(Keys.ARROW_DOWN);
		//from.sendKeys(Keys.ENTER);

	}

}
