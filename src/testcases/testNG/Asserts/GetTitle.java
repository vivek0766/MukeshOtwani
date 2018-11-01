package testcases.testNG.Asserts;

import java.util.concurrent.locks.Condition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTitle {

	@Test
	public void getPageTitle() {
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium Drivers\\geckodrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.netflix.com/browse");
		String pageTitle = driver.getTitle();
		System.out.println("The Title of page is-->" + pageTitle);

		// String expectedTitle = "Netflix";
		// Assert.assertEquals(pageTitle, expectedTitle);

		Assert.assertTrue(pageTitle.contains("flix"));
		System.out.println("The Test is Passed ");

	}

	@Test
	public void getPageSource() {
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium Drivers\\geckodrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.netflix.com/browse");
		String pageSourse = driver.getPageSource();
		System.out.println(" The Source of the Page is -->"+pageSourse);
		Assert.assertTrue(pageSourse.contains("netflix"));
		System.out.println("The Test is Passed ");

	}

}
