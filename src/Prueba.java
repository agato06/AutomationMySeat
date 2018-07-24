import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Prueba extends Main {


	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[9]/android.widget.TextView");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementById("com.seat.myseat.dev:id/selectButton");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementById("com.seat.myseat.dev:id/myseat_activity_language_country_start_button");
		el3.click();
//		(new TouchAction(driver))
//		  .press({x: 1168, y: 1379})
//		  .moveTo({x: 356: y: 1379})
//		  .release()
//		  .perform()
//		  
//		(new TouchAction(driver))
//		  .press({x: 1223, y: 1401})
//		  .moveTo({x: 339: y: 1418})
//		  .release()
//		  .perform()
//		  
//		(new TouchAction(driver))
//		  .press({x: 1245, y: 1390})
//		  .moveTo({x: 489: y: 1379})
//		  .release()
//		  .perform()
//		  
//		(new TouchAction(driver))
//		  .press({x: 1123, y: 1457})
//		  .moveTo({x: 272: y: 1457})
//		  .release()
//		  .perform()
//		  
//		(new TouchAction(driver))
//		  .press({x: null, y: null})
//		  .moveTo({x: 206: y: 890})
//		  .release()
//		  .perform()
		  
		MobileElement el4 = (MobileElement) driver.findElementById("com.seat.myseat.dev:id/myseat_welcome_start_button");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementById("com.seat.myseat.dev:id/fragment_login_go_button");
		el5.click();
		MobileElement el7 = (MobileElement) driver.findElementById("email");
		el7.sendKeys("agato@opentrends.net");
		MobileElement el8 = (MobileElement) driver.findElementById("password");
		el8.sendKeys("Charlie20$");
		
		MobileElement el9 = (MobileElement) driver.findElementById("submit-button");
		el9.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}

}
