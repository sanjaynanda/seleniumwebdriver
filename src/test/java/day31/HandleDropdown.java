package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement drpcountryele=driver.findElement(By.xpath(("//select[@id='country']")));
        Select dropcon=new Select(drpcountryele);
        //dropcon.selectByVisibleText("Australia");
        //dropcon.selectByIndex(1);
        // dropcon.selectByValue("france");
        List<WebElement>options=dropcon.getOptions();
        System.out.println("Number of options in the drop down :"+ options.size());
        //for(int i=0;i<options.size();i++) 
        	//System.out.println(options.get(i).getText());
        
        for(WebElement op:options)
        	System.out.print(op.getText());
		
	}

}
