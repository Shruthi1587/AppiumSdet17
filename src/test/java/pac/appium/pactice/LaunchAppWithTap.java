package pac.appium.pactice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LaunchAppWithTap {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "Android SDK built for x86");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "8.1.0");
		  dc.setCapability("UDID", "emulator-5554");
		  //DC for Android 
		  dc.setCapability("appPackage", "com.android.calculator2");
		  dc.setCapability("appActivity", ".Calculator");
		  
		  // Appium Server Port No.
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);

		  driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		  
		  MobileElement seven = (MobileElement) driver.findElement(By.id("com.android.calculator2:id/digit_7"));
		  driver.tap(1, seven, 500);
		  
		  MobileElement plus=(MobileElement) driver.findElementByAccessibilityId("plus");
		  driver.tap(1, seven, 300);
		  
		  MobileElement three=(MobileElement) driver.findElement(By.id("com.android.calculator2:id/digit_3"));
		  driver.tap(1, three, 500);
		  
		  MobileElement equals=(MobileElement) driver.findElementByAccessibilityId("equals");
		  driver.tap(1, three, 300);
		  String result=driver.findElement(By.id("com.android.calculator2:id/result")).getText();
		  
		  System.out.println(result);

	}

}
