package BusinessComponent;

import Framework.Appium.BasePage;
import Resources.GenericMethods;
import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;

public class FlightBookingComponents extends BasePage {
	
	public static BasePage bs = new BasePage();
	public static HomePageObjects hb = new HomePageObjects();
	public static GenericMethods gm = new GenericMethods();
	

	
	public static void FlightBooking () throws Exception {
		gm.waitFor(10);
		hb.BookFlightButton();
		hb.OneWayOption();
		hb.FromOption().click();
		hb.FromDeparture().sendKeys(BasePage.getProperties("From"));
		hb.FromCity().click();
		hb.ToOption().click();
		hb.ToArrival().sendKeys(BasePage.getProperties("To"));
		hb.ToCity().click();
		hb.SelectDepart();
		hb.DepartDay().click();
		hb.DepartDone().click();
		
	}
}
