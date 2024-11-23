package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {
	
	static void selectFutureDate(WebDriver driver,String year,String month,String date)
	{
		while(true)
		{
			String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				
		
		
		if(currentmonth.equals(month) && currentyear.equals(year))
		{
			break;
		}
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		
		}
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//method 1 using sendkeys
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");
		
		//method 2 using datepicker
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String year="2025";
		String month="May";
		String date="20";
		
		selectFutureDate(driver,year,month,date);
		
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
