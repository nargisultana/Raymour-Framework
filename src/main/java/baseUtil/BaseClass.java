package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.base.CaseFormat;

import static utils.IConstant.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import utils.Configuration;

public class BaseClass {

	public WebDriver driver;
	public HomePage homePage;
	Configuration configuration;

	@BeforeMethod
	public void setUp() {
		/*
		 * 1st way, to show the location of chrome driver
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\numan\\eclipse-workspace\\com.amfam\\driver\\chromedriver.exe");
		 */

		/*
		 * 2nd way, to show the location of chrome driver
		 * System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		 * + "/driver/chromedriver.exe");
		 */

		// 3rd way, to show the location of chrome driver
		// System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// If you wanna use gecko driver, you must have firefox browser in your system
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		// driver = new FirefoxDriver();

		// System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		// driver = new EdgeDriver();

		// 108.0.5359.71 -- current version, it always changed, so use it
		// 108.0.5359.22 -- older version
		// 107.0.5304.62 -- older version from above
		// older version sometimes used for stability of browser, sometime for the
		// request of Authority
		// if you choose version, then it will use that specific version
		// if you don't use driverVersion() method, it will open the most updated
		// version
		// WebDriverManager.chromedriver().driverVersion("107.0.5304.62").setup();
		// driver = new ChromeDriver();

		// WebDriverManager is used for most updated firefoxdriver()
		// WebDriverManager.firefoxdriver().setup();
		// driver = new FirefoxDriver();

		// WebDriverManager.edgedriver().setup();
		// driver = new EdgeDriver();
		/*
		 * //System.setProperty("webdriver.chrome.driver",
		 * "/Users/nyc/eclipse-workspace/com.amfam/Driver/chromedriver");
		 * //driver.manage().window().fullscreen(); //
		 * System.setProperty("webdriver.chrome.driver", //
		 * System.getProperty("user.dir")+"/driver/chromedriver");
		 * 
		 */
		// System.setProperty("webdriver.chrome.driver", "./driver/chromedriver"));
		// System.setProperty("webdriver.gecko.driver",
		// "/Users/nyc/eclipse-workspace/com.Raymour/driver/geckodriver 4");

		// System.setProperty("webdriver.msedge.driver" , "./driver/msedgedriver");
		// webDriver manger works when none of the browser is not working.
		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		// driver = new EdgeDriver();
		// driver = new FirefoxDriver();

		// WebDriverManager.chromedriver().driverVersion("108.0.5359.22").setup();
		// driver = new ChromeDriver();

		/*
		 * WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver();
		 * 
		 * WebDriverManager.edgedriver().setup(); driver = new EdgeDriver();
		 */

		configuration = new Configuration();
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		driver = new ChromeDriver();
		// initDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.get("https://www.raymourflanigan.com/");
		// we are calling URL from properties file.
		driver.get(configuration.getProperty((URL)));
		long pageLoadTime = Long.parseLong(configuration.getProperty((PAGELOAD_WAIT)));
		long implicitlyWait = Long.parseLong(configuration.getProperty((IMPLICITY_WAIT)));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
		homePage = new HomePage(driver);

	}

	/*
	 * private void initDriver() { String browserName =
	 * configuration.getProperty(BROWSER);
	 * 
	 * //switch(browserName) { case CHROME:
	 * System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	 * driver = new ChromeDriver(); break; case FIREFOX:
	 * System.setProperty("webdriver.gecko.driver", "./driver/gecodriver"); driver =
	 * new FirefoxDriver(); break; case EDGE:
	 * System.setProperty("webdriver.edge.driver", "./driver/msedgedriver"); driver
	 * = new EdgeDriver(); break; default: WebDriverManager.chromedriver().setup();
	 * driver = new ChromeDriver(); break; }
	 * 
	 * 
	 * }
	 */

	@AfterMethod
	public void tear() {
		driver.quit();

	}

}
