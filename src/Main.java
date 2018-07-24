import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

class Main {

	static AndroidDriver<AndroidElement> driver;
	String fs;
	
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub

		//File f= new File ("src");
		File fs= new File("C:\\temp\\mySeatApp-dev-debug.apk");
			
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Galaxy S6");
		capabilities.setCapability("app", fs.getAbsolutePath());
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("plaformVersion", "7.0");
		capabilities.setCapability("appWaitActivity", "SplashActivity, SplashActivity,OtherActivity, *, *.SplashActivity");

		try {

			driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("setUp ends");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver ;
		
		
		
	}
}
