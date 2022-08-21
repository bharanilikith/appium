package native1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demo4 {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		d.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		d.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	     d.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		URL u=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(u,d);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Properties p=new Properties();
		p.load(new FileInputStream("./data.properties"));
		driver.get(p.getProperty("url"));
		Thread.sleep(3000);
		
		driver.findElementById("username").sendKeys(p.getProperty("username1"));
		//driver.findElement(By.id("username")).sendKeys(p.getProperty("username1"));
//		driver.findElement(By.id("password")).sendKeys(p.getProperty("password"));
//		driver.findElement(By.name("login")).click();
		
		//driver.findElem

	}

}
