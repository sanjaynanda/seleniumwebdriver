package daynew;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowser {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://tutorialsninja.com/demo/");
		JavascriptExecutor js =(JavascriptExecutor) driver;
		double zoomLevel = 0.8;
        js.executeScript("document.body.style.zoom = arguments[0];", zoomLevel);

	}

}
