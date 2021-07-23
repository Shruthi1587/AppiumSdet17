package pac.appium.pactice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class GeneralStoreSenario {

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
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("shruthi");
		  
		  driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		  
		  driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		  
		  driver.findElementByXPath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']").click();
		  
		  driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.androidsample.generalstore:id/appbar_btn_cart']")).click();
		  
		  String result=driver.findElement(By.xpath("//android.widget.TextView[@elementId='b2865ce6-89c4-4c65-b6cd-47ea1003ef2a']")).getText();
		  
		  System.out.println(result);
	}

}
