package pac.appium.pactice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ApiDemosClickEarth {
	static AndroidDriver driver;
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


		driver.findElementByAccessibilityId("Views").click();

		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")).click();

		driver.findElementByAccessibilityId("2. Dark Theme").click();
		
    

		String text = driver.findElement(By.id("io.appium.android.apis:id/edit")).getAttribute("text");
		System.out.println(text);
		
		String check = driver.findElementByAccessibilityId("Checkbox 1").getAttribute("checked");
		
		if(check=="true")
		{
			System.out.println("The checkbox is enabled");
			
		} 
		else
		{
			System.out.println("The checkbox is not enabled");
			driver.findElementByAccessibilityId("Checkbox 1").click();
		}
		 String btn = driver.findElementByAccessibilityId("RadioButton 1").getAttribute("checked");
		 if(btn=="true")
		 {
			 System.out.println("The button is enabled");
		 }
		 else
		 {
			 System.out.println("The button is not enabled");
			 driver.findElementByAccessibilityId("RadioButton 1").click();
		 }
		 driver.hideKeyboard();
		 driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/text1']")).click(); 
		 List<MobileElement> planets = driver.findElements(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1']"));
		  
		  for(int i=0;i<planets.size();i++)
		  {
			  System.out.println(planets.get(i).getText());
		  }
		  driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Earth']")).click();

	}

}
