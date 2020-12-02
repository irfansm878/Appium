package Framework.Appium;

import org.testng.annotations.*;

import BusinessComponent.FlightBookingComponents;
import BusinessComponent.LoginComponents;

/**
 * Unit test for simple App.
 */

public class AppTest extends BasePage
   
{
    
	@Test
	public void SouthwestLaunch() throws Exception {
		
	
		
		LoginComponents glogin = new LoginComponents();
		FlightBookingComponents fb = new FlightBookingComponents();
		
		glogin.LaunchApp();
		glogin.login();
		fb.FlightBooking();
	}
  
    }

