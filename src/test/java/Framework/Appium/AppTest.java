package Framework.Appium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import BusinessComponent.FlightBookingComponents;
import BusinessComponent.LoginComponents;
import pageObjects.LoginPageObjects;

/**
 * Unit test for simple App.
 */

public class AppTest extends BasePage
   
{
    
	@Test
	public void SouthwestLaunch() throws Throwable {
		
		LoginComponents glogin = new LoginComponents();
		WebDriver driver = glogin.LaunchApp();
		LoginPageObjects lb = new LoginPageObjects(driver);
		FlightBookingComponents fb = new FlightBookingComponents();
		
		
	lb.login();
	}
  
    }

