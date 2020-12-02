package Resources;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class GenericMethods {
	public static boolean waitForPresence(AndroidDriver driver, int timeLimitInSeconds, WebElement element){

		boolean isElementPresent;
		WebElement mobileElement = null;
		try{
			//mobileElement =  (MobileElement) driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\""+targetResourceId+"\")");
			WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
			wait.until(ExpectedConditions.visibilityOf(null));

			isElementPresent = mobileElement.isDisplayed();
			return isElementPresent;	
		}catch(Exception e){
			isElementPresent = false;
			System.out.println(e.getMessage());
			return isElementPresent;
		} }
	public static void scrollDown(WebDriver driver)
	{
		TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
		Dimension size = driver.manage().window().getSize();
		int starty = (int) (size.height * 0.50);
		int endy = (int) (size.height * 0.20);
		int startx = size.width / 2;
		touchAction
		.longPress(PointOption.point(startx, starty))
		.moveTo(PointOption.point(startx, endy))
		.release()
		.perform();
	}

	public static void scrollUp(WebDriver driver)
	{
		
		TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
		Dimension size = driver.manage().window().getSize();
		int starty = (int) (size.height * 0.70);
		int endy = (int) (size.height * 0.30);
		int startx = size.width / 2;
		touchAction
		.longPress(PointOption.point(startx, starty))
		.moveTo(PointOption.point(startx, endy))
		.release()
		.perform();
		
		
	}
	
	public static void scrollLeft(WebDriver driver)
	{
		
		TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
		Dimension size = driver.manage().window().getSize();
		int startx = size.width / 2;
		int starty = (int) (size.height * 0.05);
		int endy = (int) (size.height * 0.90);
		
		touchAction
		.longPress(PointOption.point(startx, starty))
		.moveTo(PointOption.point(startx, endy))
		.release()
		.perform();
		
		
	}
	
	public static void scrollRight(WebDriver driver)
	{
		
		TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
		Dimension size = driver.manage().window().getSize();
		int startx = size.width / 2;
		int starty = (int) (size.height * 0.90);
		int endy = (int) (size.height * 0.0);
		
		touchAction
		.longPress(PointOption.point(startx, starty))
		.moveTo(PointOption.point(startx, endy))
		.release()
		.perform();
		
		
	}
	
	public void swiptToBottom(WebDriver driver)
	{
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width/2;
		int top_y = (int)(height*0.80);
		int bottom_y = (int)(height*0.20);
		System.out.println("coordinates :" + x + "  "+ top_y + " "+ bottom_y);
		TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
		touchAction.longPress(PointOption.point(x, top_y)).moveTo(PointOption.point(x, bottom_y)).release().perform();
	}
	public void waitFor(int wait_time) throws InterruptedException
	{
		Thread.sleep(wait_time * 1000);
	}

}
