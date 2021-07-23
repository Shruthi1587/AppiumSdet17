package pac.appium.pactice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Swipe {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "Android SDK built for x86");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "8.1.0");
		  dc.setCapability("UDID", "emulator-5554");
		 
		  dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		  dc.setCapability("appActivity", ".TouchScreenTestActivity");
		  
         URL url = new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 /* 
		  * Hardcoded 
		  * 
		  //vertical swipe
		  driver.swipe(610, 480, 610, 2050, 500);
		  //horizontal swipe
		  driver.swipe(100, 1170, 1169, 1170, 1000);
		  //inclined swipe
		  driver.swipe(150, 1900, 1100, 495, 1000);
		  */
		  
		  Dimension size = driver.manage().window().getSize();
		  
		  int height = size.getHeight();
		  int width = size.getWidth();
		  
		  System.out.println("Height of the phone is="+height);
		  System.out.println("Width of the phone is="+width);
		  
		  //General way
		//Vertical Swipe
		  driver.swipe( width/2, (int) (height*0.25), width/2, (int) (height*0.80), 1000);

		  // Horizontal swipe
		  driver.swipe((int)(width*.20), height/2, (int ) (width*.80),height/2, 1000);
	}

}
