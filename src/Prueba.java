import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Prueba extends Main{
	private static String pasword = "Charlie20$";
	private static String email = "agato@opentrends.net";
	public  static String excSheet;
	public  static XSSFWorkbook wb ;
	public  static XSSFSheet sheet ;
	public  static XSSFRow row ;
	public  static XSSFCell cell ;
	public  static FileInputStream fis ;
	public  static FileOutputStream fos ;
	
	/**
	 * @param email
	 * @param password
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	@Test (priority=1)
	  public void Test1(String email, String password) throws MalformedURLException, InterruptedException {
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
				
				el2.sendKeys(email);
				
				MobileElement el3 = (MobileElement) driver.findElementById("password");
				el3.click();
				el3.clear();
				el3.sendKeys(pasword);
				
				driver.findElementById("submit-button").click();
				Thread.sleep(10000); 
		
	  }
	@DataProvider
	private Object[][][] getData() {
		
		
		
		return null;
		// TODO Auto-generated method stub

	}
	
}
