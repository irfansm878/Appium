package BusinessComponent;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;

import Framework.Appium.BasePage;
import Resources.GenericMethods;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.LoginPageObjects;

public class LoginComponents extends BasePage {
	
	static LoginPageObjects lb = null;
	
	
	
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

public static void login() throws Exception {
	lb = new LoginPageObjects();
	//GenericMethods gm = new GenericMethods();
	Thread.sleep(10000);
	
	//lb.usernameTextbox().sendKeys(BasePage.getProperties("username"));
	//lb.passwordTextbox().sendKeys(BasePage.getProperties("password"));
	//lb.LoginButton().click();
	lb.continueasGuest().click();
		
	
}

}
