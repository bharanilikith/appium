package native1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionState;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demo2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		d.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		d.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
//		d.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.calculator2");
//		d.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.calculator2.Calculator");
		URL u=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(u,d);
		//driver.openNotifications();
		
		ConnectionState con = driver.setConnection(new ConnectionStateBuilder()
//				.withAirplaneModeDisabled()
//				.withDataDisabled()
//				.withWiFiEnabled()
				.withWiFiDisabled().build());
		Thread.sleep(5000);
				System.out.println(con.isDataEnabled());
				System.out.println(con.isWiFiEnabled());
				//System.out.println(con.isAirplaneModeEnabled());
				
		

	}

}
