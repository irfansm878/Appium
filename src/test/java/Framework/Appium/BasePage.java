package Framework.Appium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public RemoteWebDriver remoteDriver;
	
	
	public static String getProperties(String key) {
		
		String value = "";
		try {
			FileInputStream fileInputStream = new FileInputStream("./Data.properties");
			Properties property = new Properties();
			property.load(fileInputStream);
			value = property.getProperty(key);
			
			fileInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return value;
			
	}
	
	

}
