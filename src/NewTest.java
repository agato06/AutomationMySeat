import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class NewTest extends Main {
  
	@Test (priority=1)
  public void Test1() throws MalformedURLException {
	// TODO Auto-generated method stub
			AndroidDriver<AndroidElement> driver = Capabilities();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[9]/android.widget.TextView").click();
			driver.findElementById("com.seat.myseat.dev:id/selectButton").click();
			driver.findElementById("com.seat.myseat.dev:id/myseat_activity_language_country_start_button").click();

//			(new TouchAction(driver))
//			  .press({x: 1168, y: 1379})
//			  .moveTo({x: 356: y: 1379})
//			  .release()
//			  .perform()
//			  
//			(new TouchAction(driver))
//			  .press({x: 1223, y: 1401})
//			  .moveTo({x: 339: y: 1418})
//			  .release()
//			  .perform()
//			  
//			(new TouchAction(driver))
//			  .press({x: 1245, y: 1390})
//			  .moveTo({x: 489: y: 1379})
//			  .release()
//			  .perform()
//			  
//			(new TouchAction(driver))
//			  .press({x: 1123, y: 1457})
//			  .moveTo({x: 272: y: 1457})
//			  .release()
//			  .perform()
//			  
//			(new TouchAction(driver))
//			  .press({x: null, y: null})
//			  .moveTo({x: 206: y: 890})
//			  .release()
//			  .perform()
			  
			driver.findElementById("com.seat.myseat.dev:id/myseat_welcome_start_button").click();
			driver.findElementById("com.seat.myseat.dev:id/fragment_login_go_button").click();
			driver.findElementById("email").click();
			driver.findElementById("email").sendKeys("agato@opentrends.net");
			driver.findElementById("password").click();
			driver.findElementById("password").sendKeys("Charlie20$");
			
			driver.findElementById("submit-button").click();
			
			
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
	
  }
	@Test(priority=2)
	  public void Test2() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElementByAccessibilityId("Menu").click();
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.LinearLayout").click();

		driver.findElementById("com.seat.myseat.dev:id/help_symbol_regonition_button").click();
	
		driver.findElementById("com.seat.myseat.dev:id/dialog_connect_your_car_not_now_seatbutton").click();

		System.out.println("Compleate end to end");
	
	}
	
	@Test
	public void UninstallApp() throws MalformedURLException {
		System.out.println("beforeTest");

	}
	@AfterTest
	public void InstallApp() throws MalformedURLException {
		
		System.out.println("afterTest");


	
	}
}
