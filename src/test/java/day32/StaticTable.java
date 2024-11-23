package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		System.out.println("Number of rows:"+rows);
		
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of cols:"+cols);
		
		
	  // String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]")).getText();
	   //System.out.println(bookname);
		
		for(int i=2;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(value+"\t");
				
			}
			System.out.println();
		}
		
		
		for(int i=2;i<=rows;i++)
		{
			String value2=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
			if(value2.equals("Mukesh"))
			{
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
				System.out.println(bookname);
			}
			
			
		}
		
		int total=0;
		for(int i=2;i<=rows;i++)
		{
			String value2=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
			total=total+Integer.parseInt(value2);
						
		}
		System.out.println("total price of the book: "+total);
		
	}

}
