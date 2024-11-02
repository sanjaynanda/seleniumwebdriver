package day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties propertiesobj=new Properties();
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		//loading properties file
		propertiesobj.load(file);
		
		//reading data from properties file
		
		String url=propertiesobj.getProperty("appurl");
		String email=propertiesobj.getProperty("email");
		String pwd=propertiesobj.getProperty("password");
		String ord=propertiesobj.getProperty("orderid");
		String cid=propertiesobj.getProperty("customerid");
		
		//printing the properties of the propery file
		
		System.out.println(url+" "+email+" "+pwd+" "+ord+" "+" "+cid);
		
	}

}
