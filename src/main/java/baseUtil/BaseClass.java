package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {

	public WebDriver driver;
	public HomePage homePage;

	@BeforeMethod
	public void setUp() {

		//System.setProperty("webdriver.chrome.driver", "/Users/nyc/eclipse-workspace/com.amfam/Driver/chromedriver");
		//driver.manage().window().fullscreen();
		 System.setProperty("webdriver.chrome.driver",
		 System.getProperty("user.dir")+"/driver/chromedriver");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.raymourflanigan.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);

	}

	@AfterMethod
	public void tear() {
		driver.quit();

	}

}
