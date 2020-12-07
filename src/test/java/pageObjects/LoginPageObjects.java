package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Framework.Appium.BasePage;
import Resources.GenericMethods;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPageObjects extends BasePage {
	
	WebDriver driver;
	GenericMethods gm= new GenericMethods ();
	
	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
@AndroidFindBy (xpath= "//android.widget.TextView[@text='CONTINUE AS GUEST']")
public WebElement continueAsGuest;
	
	
@AndroidFindBy(xpath="//android.widget.EditText[@text='Username or account number']")
public WebElement UsernameTextbox;
	
@AndroidFindBy(xpath="//android.widget.EditText[@text='Password']")
public WebElement passwordTextbox;
	 

@AndroidFindBy(xpath="//android.widget.Button[@text='LOG IN']")
public WebElement loginButton;




public void login() throws InterruptedException {
	gm.waitFor(20);
	continueAsGuest.click();
	
}

}
