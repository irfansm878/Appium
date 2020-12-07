package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Framework.Appium.BasePage;
import Resources.GenericMethods;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePageObjects extends BasePage {
	
	WebDriver driver;
	GenericMethods gm= new GenericMethods ();
	
	 public HomePageObjects(WebDriver driver){

	        this.driver = driver;

	        //This initElements method will create all WebElements

	        PageFactory.initElements(driver, this);

	    }
	
	
@AndroidFindBy(xpath="//android.widget.TextView[@text='BOOK FLIGHT']")
public WebElement BookFlightButton;
	
	
@AndroidFindBy(xpath="//android.widget.TextView[2]")
	public WebElement OneWayOption;

@AndroidFindBy(xpath="//android.widget.TextView[@text='From']")
public WebElement FromOption;

	
@AndroidFindBy(xpath="//android.widget.TextView[@text='To']")	
public WebElement ToOption;


@AndroidFindBy(xpath="//android.widget.EditText[@text='Search for departure airport']")
public WebElement ToArrival;

@AndroidFindBy(xpath="//android.widget.EditText[@text='Search for departure airport']")
public WebElement FromDeparture;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Orlando, FL - MCO']")
public WebElement FromCity;


@AndroidFindBy(xpath="//android.widget.TextView[@text='St. Louis, MO - STL']")
public WebElement ToCity;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Select Depart']")
public WebElement SelectDepart;

@AndroidFindBy(xpath="//android.widget.TextView[@text='31']")
public WebElement DepartDay;

@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Done']")
public WebElement DepartDone;

@AndroidFindBy(xpath="//android.widget.Button[@text='FIND FLIGHTS']")
public WebElement FindFlightsButton;




}
