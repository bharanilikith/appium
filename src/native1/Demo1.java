package native1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demo1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		d.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		d.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		d.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.calculator2");
		d.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.calculator2.Calculator");
		URL u=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(u,d);
		System.out.println("The device time is"+driver.getDeviceTime());
		System.out.println("The current application package "+driver.getCurrentPackage());
		System.out.println("The app is istalled "+driver.isAppInstalled("com.android.calculator2"));
		System.out.println("The current activity of the application "+driver.currentActivity());
		System.out.println("The orientation of the device "+driver.getOrientation());
		System.out.println("Devices is locked "+driver.isDeviceLocked());
		System.out.println("the keyword is dispalyed" + driver.isKeyboardShown());
		driver.resetApp();
		System.out.println("application is reset");
		Thread.sleep(5000);
		driver.closeApp();
		System.out.println("application is closed");
		Thread.sleep(5000);
		driver.launchApp();
		System.out.println("application is launched");
		
		
		

	}

}
