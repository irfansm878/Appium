package BusinessComponent;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import Framework.Appium.BasePage;
import Resources.GenericMethods;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.LoginPageObjects;

public class LoginComponents extends BasePage {
	
	LoginPageObjects lb;
	GenericMethods gm;
	
	static WebDriver driver;
	
public static AndroidDriver<AndroidElement> LaunchApp() throws Exception {
		
	
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", BasePage.getProperties("deviceName")  );
		cap.setCapability("udid", BasePage.getProperties("udid"));
		//cap.setCapability("udid", "87969a0f7d34");
		cap.setCapability("platformName", BasePage.getProperties("platformName"));
		cap.setCapability("platformVersion", BasePage.getProperties("platformVersion"));
		cap.setCapability("appPackage", BasePage.getProperties("appPackage"));
		cap.setCapability("appActivity", BasePage.getProperties("appActivity"));
		//cap.setCapability("appWaitActivity", "com.southwestairlines.mobile.login.ui.LoginActivity");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL (BasePage.getProperties("url")), cap);
		return driver;
		
	}


}
