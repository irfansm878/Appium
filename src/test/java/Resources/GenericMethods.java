package Resources;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Framework.Appium.BasePage;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class GenericMethods extends BasePage {
	
	private static final int MAX_TIMEOUT = 5;
	private static final int MIN_TIMEOUT = 10;
	
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
	public boolean waitForObjectExists(By locator) {
        return waitForObjectExists(locator, MAX_TIMEOUT);
    }
	public boolean waitForObjectExists(By locator, int timeout) {
        ExecutorService executor = Executors.newCachedThreadPool();
        WebDriver remoteDriver = null;
		WaitForObjectExists task = new WaitForObjectExists(remoteDriver, null, locator);
        Future<Boolean> future = executor.submit(task);
        try {
            return future.get(timeout, TimeUnit.SECONDS);
        } catch (Exception e) {
        } finally {
            executor.shutdownNow();
        }
        return false;
    }
	class WaitForObjectExists implements Callable<Boolean> {
	    WebDriver remoteDriver = null;
	    WebElement pElement = null;
	    By locator = null;
	   
	    WaitForObjectExists(WebDriver remoteDriver, WebElement pElement, By locator) {
	        this.remoteDriver = remoteDriver;
	        this.pElement = pElement;
	        this.locator = locator;
	    }

		public Boolean call() throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
		
		  public boolean checkElementExists(String objDesc, By locator)
		    {
		        ExecutorService executor = Executors.newCachedThreadPool();
		        CheckForObjectExists task = new CheckForObjectExists(remoteDriver, null, locator);
		        Future<Boolean> future = executor.submit(task);
		        try {
		            if (future.get(MIN_TIMEOUT, TimeUnit.SECONDS))
		                return true;
		        } catch (TimeoutException e) {
		           
		          
		           
		        } catch (Exception e) {
		        } finally {
		            executor.shutdownNow();
		        }
				return false;
				
				
				 
		       
		       	    }
		  class CheckForObjectExists implements Callable<Boolean> {
				WebDriver remoteDriver = null;
				WebElement pElement = null;
				By locator = null;
				
				CheckForObjectExists(WebDriver remoteDriver, WebElement pElement, By locator) {
					this.remoteDriver = remoteDriver;
					this.pElement = pElement;
					this.locator = locator;
				}

				public Boolean call() throws Exception {
					// TODO Auto-generated method stub
					return null;
				}

	}}}
