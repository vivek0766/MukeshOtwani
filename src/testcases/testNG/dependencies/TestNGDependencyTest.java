package testcases.testNG.dependencies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDependencyTest {

	WebDriver driver;

	@Test(priority=1, description="Testing enterprise website")
	public void loginpageTest() {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.enterprise.com/en/home.html");
		driver.findElement(By.className("primary-nav-label")).click();
//		driver.findElement(By.id("search-container")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("The login page is displyed");
	}

	@Test(dependsOnMethods="loginpageTest")
	public void homepageTest() throws InterruptedException {
		Thread.sleep(10);
		System.out.println("The Home page is displyed");
	}

	@Test(priority =3, dependsOnMethods ="loginpageTest")
	public void logoutpageTest() {
		System.out.println("The user came out of the Account");
	}

	@Test(dependsOnMethods="loginpageTest")
	public void closeBrowser() {
		driver.close();
		System.out.println("The browser is closed. The Test is Done");
	}

}
