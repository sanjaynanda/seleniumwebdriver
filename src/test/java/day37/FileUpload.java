package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		// single file upload -test1.txt
		/* 
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\USER\\Downloads\\learn 1st Sept.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("learn 1st Sept.txt"))
		{
			System.out.println("file is successfully uploaded");
		
		}
		else			
		{		
			System.out.println("Upload failed");
		
		}
		*/
		
		String file1="C:\\Users\\USER\\Downloads\\learn 1st Sept.txt";
		String file2="C:\\Users\\USER\\Downloads\\learn 2nd Sept.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		int noOfFilesUploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		if(noOfFilesUploaded==2)
		{
			System.out.println("All Files are uploaded");
		}
		else
		{
			System.out.println("Files are not uploaded or incorrect files uploaded");
		}
		driver.close();
}
}

