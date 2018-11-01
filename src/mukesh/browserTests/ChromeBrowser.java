package mukesh.browserTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		driver.get("http://localhost:10080/autotools/login.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='j_username']")).sendKeys("vivek@vivek.com");
		driver.findElement(By.xpath(".//*[@id='j_password']")).sendKeys("Kvivek0766");
		driver.findElement(By.xpath("html/body/div[2]/form/div[3]/div/button")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/ul/li[1]/ul/li[1]/a")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();

	}

}
