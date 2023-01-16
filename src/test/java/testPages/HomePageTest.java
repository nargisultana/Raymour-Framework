package testPages;

import java.time.Duration;

import javax.annotation.WillClose;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	Dimension dimension;
	Actions actions;
	Select select;

	@Test(enabled = false)
	public void clickLogoElementTest() {
		homePage.clickLogoElement();
	}

	@Test(enabled = false)
	public void clicksearchElementTest() {
		homePage.clicksearchElement();
	}

	@Test(enabled = false)
	public void clickGiftsElementTest() {
		homePage.clickGiftsElement();
	}

	@Test(enabled = false)
	public void clickLivingRoomTest() {
		homePage.clickLivingRoom();
	}

	@Test(enabled = false)
	public void clickmattressElementTest() {
		homePage.clickMattress();
	}

	@Test(enabled = false)
	public void clickSearchElementTest() {
		homePage.searchKey();
	}

	// Third HomeWork

	@Test(enabled = false)
	public void role_use_of_cssSelector_as_locator_searchbox_by_class1() {
		driver.findElement(By.cssSelector("input.react-autosuggest__input")).click();
	}

	@Test(enabled = false)
	public void role01_use_of_cssSelector_as_locator_in_serachbox_by_id2() throws InterruptedException {
		driver.findElement(By.cssSelector("input#global-header-search")).click();
	}

	@Test(enabled = false)
	public void role03_use_of_cssSelector_as_locator_price_match_by_title() throws InterruptedException {
		driver.findElement(By.cssSelector("img.Image__Img.lazyautosizes.ls-is-cached.lazyloaded")).click();
	}

	@Test(enabled = false)
	public void clickAccountButtonTest() throws InterruptedException {
		homePage.accountButton();
		homePage.clickSignInButton();
		homePage.clickEmailBox();
		homePage.clickPasswordElement();
	}

	@Test(enabled = false)
	public void use_of_isDisplayed_in_image() {
		boolean elementDisplayed = driver
				.findElement(By.cssSelector("img.Image__Img.lazyautosizes.ls-is-cached.lazyloaded")).isDisplayed();
		System.out.println("Is the LOGO Displayed? Ans: " + elementDisplayed);
	}

	@Test(enabled = false)
	public void use_of_isEnabled_in_account_button() throws InterruptedException {
		boolean accountButtonAccount = driver
				.findElement(By.xpath("(//span[@class='Icon__Icon icon-chevron-down'])[4]")).isEnabled();
		System.out.println("Is the account button Enable? Ans: " + accountButtonAccount);
	}

	@Test(enabled = false)
	public void use_of_isSelected_in_check_box() {
		boolean checkBoxSelected = driver.findElement(By.xpath("(//span[@class='Icon__Icon icon-chat'])[4]"))
				.isSelected();
		System.out.println("Is the check Box selected? Ans: " + checkBoxSelected);

	}

	@Test(enabled = false)
	public void use_of_getTitle_method() {
		System.out.println("The title of the page is: " + driver.getTitle());
	}

	@Test(enabled = false)
	public void use_of_getTitle_method_in_next_page() throws InterruptedException {
		driver.findElement(By.cssSelector("a.Button.mb-1.py-2.Button--primary")).click();
		;
		Thread.sleep(5000);
		System.out.println("The title of the page is: " + driver.getTitle());
	}

	@Test(enabled = false)

	public void use_of_getCurrentURL_method() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='global-header-search']")).click();
		Thread.sleep(6000);
		System.out.println("The title of the page is: " + driver.getCurrentUrl());
		System.out.println("The title current URL Is: " + driver.getCurrentUrl());
	}

	@Test(enabled = false)

	public void use_of_getText_method_in_userid() {
		WebElement searchElement = driver.findElement(By.xpath("//input[@id='global-header-search']"));
		System.out.println("The text for the Web element is:  " + searchElement.getText());

	}

	@Test(enabled = false)
	public void use_of_get_attribute_method() {
		String value1 = driver
				.findElement(By.xpath("(//div[@class='GlobalHeaderMenuItem__Trigger u-reset-button'])[1]"))
				.getAttribute("class");
		System.out.println("The value of the class attribute is: " + value1);
	}

	@Test(enabled = false)

	public void use_of_sendkeys_method_then_click_submit_and_then_clear() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='global-header-search']")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("react-autosuggest__input")).sendKeys("mattress");
		Thread.sleep(5000);
		driver.findElement(By.className("react-autosuggest__input")).clear();
		Thread.sleep(4000);
	}
	// homework -4

	@Test(enabled = false)
	public void use_of_sendkeys_method_then_click_by_enter_key_or_button_and_then_clear() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://www.raymourflanigan.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.className("react-autosuggest__input")).sendKeys("mattress", Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.className("react-autosuggest__input")).clear();
		Thread.sleep(4000);
		driver.findElement(By.className("react-autosuggest__input")).sendKeys("sofa", Keys.RETURN);
		Thread.sleep(5000);
	}

	@Test(enabled = false)
	public void use_of_navigate_method() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to("https://www.jcpenney.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
	}

	// homework 5

	// Very important interview question
	// How can you reset a window size? or they can ask how you can change the
	// screen size by selenium
	@Test(enabled = false)
	public void use_of_set_specific_size_in_a_window() throws InterruptedException {
		Thread.sleep(3000);
		// Will get the size of cms window
		// System.out.println("The size of the maximize screen is: "+
		// driver.manage().window().getSize());
		dimension = new Dimension(800, 500);
		driver.manage().window().setSize(dimension);
		driver.navigate().to("https://www.cvs.com");
		Thread.sleep(4000);
		System.out.println("The size of the set screen is: " + driver.manage().window().getSize());
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("The size of the maximize screen is: " + driver.manage().window().getSize());
		Thread.sleep(5000);
		driver.manage().window().setSize(dimension); // just to show again the set size
		Thread.sleep(5000);
		System.out.println("The size of the set screen is: " + driver.manage().window().getSize());
		Thread.sleep(5000);
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		System.out.println("The size of the full screen is: " + driver.manage().window().getSize());
	}

	@Test(enabled = false)
	public void role1_use_of_soft_assert_method() throws InterruptedException {
		boolean elementDisplayed = driver
				.findElement(By.cssSelector("img.Image__Img.lazyautosizes.ls-is-cached.lazyloaded")).isDisplayed();
		System.out.println("Is the LOGO Displayed? Ans: " + elementDisplayed);
		Assert.assertTrue(true, "Application Logo is Displayed..............");

	}

	@Test(enabled = false)

	public void role2_use_of_hard_assert_method() throws InterruptedException { // test will be failed because expected
																				// true, but found false
		Thread.sleep(5000);
		driver.get("https://www.raymourflanigan.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		boolean elementDisplayed = driver
				.findElement(By.cssSelector("img.Image__Img.lazyautosizes.ls-is-cached.lazyloaded")).isDisplayed();
		System.out.println("Is the LOGO Displayed? Ans: " + elementDisplayed);
		Assert.assertTrue(false, "Application Logo is Displayed..........");

	}

	@Test(enabled = false)

	public void role3_use_of_hard_assert_method() throws InterruptedException { // test will be failed because expected
																				// false, but found true
		Thread.sleep(5000);
		driver.get("https://www.raymourflanigan.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		boolean elementDisplayed = driver
				.findElement(By.cssSelector("img.Image__Img.lazyautosizes.ls-is-cached.lazyloaded")).isDisplayed();
		System.out.println("Is the LOGO Displayed? Ans: " + elementDisplayed);
		Assert.assertFalse(true, "Application Logo is Displayed..........");

	}

	@Test(enabled = false)
	public void use_of_getTitle_method_with_assertion01() {
		String expected = "Raymour &amp; Flanigan - Your Home for Furniture, Mattresses &amp; Decor | Raymour &amp; Flanigan";
		String actual = driver.getTitle();
		System.out.println("The Title of the home page is: " + actual);

	}

	@Test(enabled = false)
	public void use_of_getTitle_method_with_assertion02() {
		String expected = "Raymour & Flanigan - Your Home for Furniture, Mattresses & Decor | Raymour Flanigan";
		String actual = driver.getTitle();
		System.out.println("The Title of the home page is: " + actual);
		Assert.assertEquals(actual, expected); // hard assertion
	}

	@Test(enabled = false)
	public void use_of_getTitle_method_with_assertion03() {
		String expected = "Raymour & Flanigan - Your Home for Furniture, Mattresses & Decor | Raymour & Flanigan";
		String actual = driver.getTitle();
		System.out.println("The Title of the home page is: " + actual);
		Assert.assertEquals(actual, expected, "Home page title doesn't match.....");
		String currentURL = driver.getCurrentUrl();
		System.out.println("The title current URL Is: " + currentURL);
	}

	// SOFT ASSERT
	@Test(enabled = false)
	public void use_of_getTitle_method_with_soft_assertion01() {
		String expected = "Raymour &amp; Flanigan - Your Home for Furniture, Mattresses &amp; Decor | Raymour &amp; Flanigan ";
		String actual = driver.getTitle();
		System.out.println("The Title of the home page is: " + actual);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actual, expected, "Home page title doesn't match.....");
		String currentURL = driver.getCurrentUrl();
		System.out.println("the current url is: " + currentURL);

	}

	// Mouse Hovar action

	@Test(enabled = false)
	public void use_of_mouse_hoveraction_on_sale() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://www.raymourflanigan.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		actions = new Actions(driver);
		WebElement sale = driver.findElement(By.xpath("//div[text()='Sale']"));
		Thread.sleep(5000);
		actions.moveToElement(sale).build().perform();
		Thread.sleep(4000);

	}
	// drop down, all categories
	// drop down is a commonly asked interview question
	// Most commonly use method in drop down --> selectByVisibleText()

	@Test(enabled = false)
	public void useOfDropDown_by_visual_text() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://www.amazon.com/ref=nav_logo");
		Thread.sleep(3000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropElement02 = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		select = new Select(dropElement02);
		select.selectByVisibleText("Appliances");
		Thread.sleep(3000);
	}

	// drop down, all categories
	// drop down is a commonly asked interview question
	// use method --> selectByValue()
	@Test(enabled = true)
	public void useOfDropDown_by_value() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://www.amazon.com/ref=nav_logo");
		Thread.sleep(3000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropElement03 = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		select = new Select(dropElement03);
		select.selectByValue("search-alias=mobile-apps");
		Thread.sleep(3000);
	}

}
