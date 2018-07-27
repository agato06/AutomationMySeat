import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

class Main {

	static AndroidDriver<AndroidElement> driver;
	
	@BeforeSuite
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {

		//File f= new File ("src");
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//	        switch(executionOS){
//	            case ANDROID:
//	                File classpathRoot = new File(System.getProperty("user.dir"));
//	                File appDir = new File(classpathRoot, "/app/Android");
//	                File app = new File (appDir, "Contacts.apk");
//	                capabilities.setCapability("platformName", "Android");
//	                capabilities.setCapability("deviceName", "NotUsed");
//	                capabilities.setCapability("app", app.getAbsolutePath());
//	                capabilities.setCapability("appPackage", "com.jayway.contacts");
//	                capabilities.setCapability("appActivity", "com.jayway.contacts.MainActivity");
//	                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//	                break;
//	            case IOS:
//	                classpathRoot = new File(System.getProperty("user.dir"));
//	                appDir = new File(classpathRoot, "/app/iOS/");
//	                app = new File(appDir, "ContactsSimulator.app");
//	                capabilities.setCapability("platformName", "ios");
//	                capabilities.setCapability("deviceName", "iPhone 7");
//	                capabilities.setCapability("app", app.getAbsolutePath());
//	                capabilities.setCapability("automationName", "XCUITest");
//	                driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//	                break;
		
		File fs= new File("C:\\temp\\mySeatApp-dev-debug.apk");
//	
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("deviceName", "Demo PixelXL");
//		capabilities.setCapability("app", fs.getAbsolutePath());
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("plaformVersion", "9.0");
//		capabilities.setCapability("appWaitActivity", "SplashActivity, SplashActivity,OtherActivity, *, *.SplashActivity");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Galaxy S6");
		capabilities.setCapability("app", fs.getAbsolutePath());
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("plaformVersion", "7.0");
		capabilities.setCapability("appWaitActivity", "SplashActivity, SplashActivity,OtherActivity, *, *.SplashActivity");
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("noReset", true);
		
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
    @AfterSuite
    public void tearDown() throws Exception {
        driver.quit();
    }
}
