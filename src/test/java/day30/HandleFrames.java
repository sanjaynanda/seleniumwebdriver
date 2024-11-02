package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		/*WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
	    driver.switchTo().defaultContent();
	    WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	    driver.switchTo().frame(frame2);
	    driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("newwelcome");
	    driver.switchTo().defaultContent();
	    WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	    driver.switchTo().frame(frame3);
	    driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("newwelcome");*/
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(0);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@id='i5']//div[@class='AB7Lab Id5V1']")).click();
	    
	}

}
