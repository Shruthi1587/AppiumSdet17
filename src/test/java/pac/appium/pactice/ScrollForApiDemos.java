package pac.appium.pactice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.appium.GenericUtils.ReadDCfromPropertyfile;

import io.appium.java_client.android.AndroidDriver;

public class ScrollForApiDemos {
	static AndroidDriver driver;
	public static void main(String[] args) throws Throwable {
		DesiredCapabilities dc = new DesiredCapabilities();
		// Common DC (Android or IOS)
		/* dc.setCapability("deviceName", "Android SDK built for x86");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "8.1.0");
		  dc.setCapability("UDID", "emulator-5554");*/

		ReadDCfromPropertyfile dcfile=new ReadDCfromPropertyfile();
		String DN = dcfile.readDataFromPropertyFile("deviceName");
		String AN = dcfile.readDataFromPropertyFile("automationName");
		String PN = dcfile.readDataFromPropertyFile("platformName");
		String PV = dcfile.readDataFromPropertyFile("platformVersion");
		String ID = dcfile.readDataFromPropertyFile("UDID");


		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");

		URL url = new URL("http://localhost:4723/wd/hub");

		driver = new AndroidDriver(url, dc);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByAccessibilityId("Views").click();

		scrollToElement(driver, "text", "WebView");

		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/text1']")).click();



	}
	public static void scrollToElement(AndroidDriver driver,String an,String av)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}
}
