package native1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demo3 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		d.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		d.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		d.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.calculator2");
		d.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.calculator2.Calculator");
		URL u=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(u,d);
		for(int i=0;i<=6;i++)
		{
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BRIGHTNESS_DOWN));
		}
		Thread.sleep(5000);
		for(int i=0;i<=6;i++)
		{
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BRIGHTNESS_UP));
		}
		Thread.sleep(5000);
		driver.closeApp();
		

	}

}
