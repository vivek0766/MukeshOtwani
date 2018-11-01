package mukesh.dropdowns.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FBMonthDropdownTest {
	@Test
	public void monthDropdownTest() {
		System.out.println("test begin");
		System.setProperty("webdriver.ie.driver", "G:\\Selenium Drivers\\InternetExplorerDrivers\\IEDriverServer_Win32_3.6.0\\IEDriverServer.exe");
		System.out.println("Internet driver loaded");
		WebDriver driver = new InternetExplorerDriver();
		//WebDriver driver = new ChromeDriver();
		System.out.println("Internet driver initialized");
		driver.get("https://www.facebook.com/");
		
		System.out.println(" the title of Login Page ->" + driver.getTitle());
		driver.findElement(By.className("inputtext")).sendKeys("5104748834");
		driver.findElement(By.id("pass")).sendKeys("nannaamma");
		

		

		WebElement dropdown = driver.findElement(By.id("month"));
		Select monthDropDown = new Select(dropdown);

		monthDropDown.selectByIndex(9);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("The month of vivek birth is september");
			e.printStackTrace();
		}
		monthDropDown.selectByVisibleText("Aug");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("u_0_2")).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.navigate().back();

	}
}
