package testcases.testNG.priority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestNGSuites {
	
	@Test
	public void loginAutotools(){
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium Drivers\\geckodrivers\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("http://localhost:10080/autotools/login.html");
		System.out.println("autotools login page has been displayed");
	}
	@Test
	public void whatsAppWeb(){
		System.setProperty("webdriver.ie.driver", "G:\\Selenium Drivers\\InternetExplorerDrivers\\IEDriverServer_Win32_3.6.0\\IEDriverServer.exe");
		WebDriver driver2 = new InternetExplorerDriver();
		driver2.get("https://web.whatsapp.com/");
		System.out.println("whatsApp web application has been opened");
	}
	@Test
	public void youTube(){
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromeDriver\\chromedriver.exe");
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://www.youtube.com/");
		System.out.println("youTube is initialized");
	}

}
