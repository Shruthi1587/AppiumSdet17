package pac.appium.pactice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ScrollAction {

	static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "Android SDK built for x86");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "8.1.0");
		  dc.setCapability("UDID", "emulator-5554");
		 
		  dc.setCapability("appPackage", "com.androidsample.generalstore");
		  dc.setCapability("appActivity", ".SplashActivity");
		  
         URL url = new URL("http://localhost:4723/wd/hub");
		  
		  driver = new AndroidDriver(url, dc);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/text1']")).click();
		  scrollToElement(driver, "text", "Brazil");
		  driver.findElement(By.xpath("//android.widget.TextView[@text='Brazil']")).click();
	}

	public static void scrollToElement(AndroidDriver driver,String an,String av)
	 {
	  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	 }
}
