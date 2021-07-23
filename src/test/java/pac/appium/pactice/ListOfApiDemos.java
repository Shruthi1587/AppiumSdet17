package pac.appium.pactice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ListOfApiDemos {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "Android SDK built for x86");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "8.1.0");
		  dc.setCapability("UDID", "emulator-5554");
		 
		  dc.setCapability("appPackage", "io.appium.android.apis");
		  dc.setCapability("appActivity", ".ApiDemos");
		  
        URL url = new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		 	
		  List<MobileElement> option = driver.findElementsByClassName("android.widget.TextView");
		  
		  for(int i=1;i<option.size();i++)
		  {
			  System.out.println(option.get(i).getText());
		  }
	}

}
