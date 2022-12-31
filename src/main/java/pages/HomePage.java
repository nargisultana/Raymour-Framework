package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (css = "img.Image__Img.lazyautosizes.ls-is-cached.lazyloaded")
	WebElement logoElement;
	
	public void clickLogoElement() {
		logoElement.click();
		
	}
	@FindBy(xpath = "//input[@id='global-header-search']")
	WebElement searchElement;
	
	public void clicksearchElement() {
		searchElement.click();
	}
	@FindBy(xpath = "(//span[contains(text(), 'Account')])[2]")
	WebElement accountElement;
	public void clickAccount() {
		accountElement.click();
	}
	/*@FindBy(xpath = "//a[@class='emailSignUpBtn']")
	WebElement shopnow;
	
	public void testShopNowElement() {
		shopnow.click();
	}

	@FindBy(xpath = "//img[@class='credit-icon']")
	WebElement creditcard;
	
	public void clickCreditCard() {
		creditcard.click();
	}
	@FindBy(xpath = "//img[@class='burl-heart']")
	WebElement loyaltyElement;
	
	public void clickLoyaltyElement() {
		loyaltyElement.click();
	}
	
	*/

}
