package mukesh.dropdowns.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AutotoolsDropDown {
	@Test
	public void selectDropDown() {
		System.setProperty("webdriver.ie.driver", "G:\\Selenium Drivers\\InternetExplorerDrivers\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://localhost:10080/autotools/login.html");
		driver.findElement(By.xpath(".//*[@id='j_username']")).sendKeys("vivek@vivek.com");
		driver.findElement(By.xpath(".//*[@id='j_password']")).sendKeys("Kvivek0766");
		driver.findElement(By.xpath("html/body/div[2]/form/div[3]/div/label/input")).click();
		driver.findElement(By.xpath("html/body/div[2]/form/div[3]/div/button")).click();
		driver.manage().window().maximize();
		// driver.findElement(By.className("dropdown-toggel")).getText();
		WebElement dropDown = driver.findElement(By.xpath("html/body/div[1]/div/div/div/ul/li[1]/a"));
		Select usernameDD = new Select(dropDown);

		usernameDD.selectByVisibleText("Vivek Reddy");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
          System.out.println("the username is vivek reddy selected");
			e.printStackTrace();
		}
		driver.navigate().back();

	}

}
