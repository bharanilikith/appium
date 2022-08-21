package native1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Exceldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		d.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		d.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	     d.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		URL u=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(u,d);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		FileInputStream f=new FileInputStream("./Excel/excel.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		driver.get(url);
		driver.findElement(By.xpath("//a[.='LOGIN']")).click();
		String username = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
String password = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
driver.findElement(By.id("password")).sendKeys(password);
driver.findElement(By.name("login")).click();


	}

}
