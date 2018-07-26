import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class NewTest extends Main {
  
	@Test (priority=1)
  public void Test1() throws MalformedURLException, InterruptedException {
	// TODO Auto-generated method stub
			AndroidDriver<AndroidElement> driver = Capabilities();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[9]/android.widget.TextView").click();
			driver.findElementById("com.seat.myseat.dev:id/selectButton").click();
			driver.findElementById("com.seat.myseat.dev:id/myseat_activity_language_country_start_button").click();

		     driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout").click();
		     		    
			  
			driver.findElementById("com.seat.myseat.dev:id/myseat_welcome_start_button").click();
			driver.findElementById("com.seat.myseat.dev:id/fragment_login_go_button").click();
			MobileElement el2 = (MobileElement) driver.findElementById("email");
			
			el2.click();
			el2.clear();
			
			el2.sendKeys("agato@opentrends.net");
			
			MobileElement el3 = (MobileElement) driver.findElementById("password");
			el3.click();
			el3.clear();
			el3.sendKeys("Charlie20$");
			
			driver.findElementById("submit-button").click();
			Thread.sleep(10000); 
	
  }
		@Test(priority=2)
	  public void Test2() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@content-desc='Menu']").click();
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.LinearLayout").click();

		driver.findElementById("com.seat.myseat.dev:id/help_symbol_regonition_button").click();
	
		driver.findElementById("com.seat.myseat.dev:id/dialog_connect_your_car_not_now_seatbutton").click();

		System.out.println("Compleate end to end");
	
	}
	


}
