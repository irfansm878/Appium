package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Framework.Appium.BasePage;

public class LoginPageObjects extends BasePage {
	
	BasePage bp = new BasePage();
	
	public static WebDriver driver;
	public static WebDriverWait wb = new WebDriverWait(driver,30);
	
	public static final String ContinueButton_Text = "//android.widget.TextView[@text='CONTINUE AS GUEST']";
	
	
	public WebElement usernameTextbox() {
		
	WebElement username = driver.findElement(By.xpath("//android.widget.EditText[@text='Username or account number']"));
		return username;
		}
	
	public WebElement passwordTextbox() {
		
		WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@text='Password']"));
			return password;
			}
	
public WebElement continueasGuest() {
	
		bp.waitObject().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ContinueButton_Text)));
		
			return driver.findElement(By.xpath(ContinueButton_Text)) ;
			}

public WebElement LoginButton() {
	
	WebElement LoginButton = driver.findElement(By.xpath("\"//android.widget.Button[@text='LOG IN']\""));
		return LoginButton;
		}

}
