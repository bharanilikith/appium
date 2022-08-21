package native1;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Sample {

	@Parameters({"url"})
	@Test
	public void demo() throws IOException{
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		d.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		d.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		//d.setCapability(AndroidMobileCapabilityType.BROWSER_NAME,"chrome");
		d.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.calculator2");
		d.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.calculator2.Calculator");
		URL u=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(u,d);
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./photo/cal.png");
		FileUtils.copyFile(src, dest);
		
	}

    }
