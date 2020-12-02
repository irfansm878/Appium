package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Framework.Appium.BasePage;

public class HomePageObjects extends BasePage {
	
	public static BasePage bs = new BasePage();
	
	
public WebDriver driver;
	
	
	public WebElement BookFlightButton() {
		
	WebElement BookFlightButton = driver.findElement(By.xpath("//android.widget.TextView[@text='BOOK FLIGHT']"));
		return BookFlightButton;
		}
	
	public WebElement OneWayOption() {
		
		WebElement OneWayOption = driver.findElement(By.xpath("//android.widget.TextView[2]\").click()"));
			return OneWayOption;
			}
	
public WebElement FromOption() {
		
		WebElement FromOption = driver.findElement(By.xpath("//android.widget.TextView[@text='From']"));
			return FromOption;
			}

public WebElement ToOption() {
	
	WebElement ToOption = driver.findElement(By.xpath("//android.widget.TextView[@text='To']"));
		return ToOption;
		}

public WebElement ToArrival() {
	
	WebElement ToArrival = driver.findElement(By.xpath("//android.widget.EditText[@text='Search for departure airport']"));
		return ToArrival;
		}
public WebElement FromDeparture() {
	
	WebElement FromDeparture = driver.findElement(By.xpath("//android.widget.EditText[@text='Search for departure airport']"));
		return FromDeparture;
		}

public  WebElement FromCity() {
	
	WebElement FromCity = driver.findElement(By.xpath("//android.widget.TextView[@text='Orlando, FL - MCO']"));
	return FromCity;


		}
public WebElement ToCity() {
	
	WebElement ToCity = driver.findElement(By.xpath("//android.widget.TextView[@text='St. Louis, MO - STL']"));
	return ToCity;

		}
public WebElement SelectDepart() {
	
	WebElement SelectDepart = driver.findElement(By.xpath("//android.widget.TextView[@text='Select Depart']"));
		return SelectDepart;
		}
public WebElement DepartDay() {
	
	WebElement DepartDay = driver.findElement(By.xpath("//android.widget.TextView[@text='31']"));
		return DepartDay;
		}

public WebElement DepartDone() {
	
	WebElement DepartDone = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Done']"));
		return DepartDone;
		}
public WebElement FindFlightsButton() {
	
	WebElement FindFlightsButton = driver.findElement(By.xpath("//android.widget.Button[@text='FIND FLIGHTS']"));
		return FindFlightsButton;
		}

}
