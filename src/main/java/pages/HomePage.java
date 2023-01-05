package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "img.Image__Img.lazyautosizes.ls-is-cached.lazyloaded")
	WebElement logoElement;

	public void clickLogoElement() {
		logoElement.click();

	}

	@FindBy(xpath = "//input[@id='global-header-search']")
	WebElement searchElement;

	public void clicksearchElement() {
		searchElement.click();
	}

	@FindBy(xpath = "(//div[contains(text(),'Living R')])[1]")
	WebElement livingroom;

	public void clickLivingRoom() {
		livingroom.click();
	}

	@FindBy(xpath = "(//div[contains(text(), 'Mattre')])[1]")
	WebElement mattressElement;

	public void clickMattress() {
		mattressElement.click();
	}

	@FindBy(xpath = "(//div[ (text())='Gifts'])[1]")
	WebElement giftsElement;

	public void clickGiftsElement() {
		giftsElement.click();
	}

	@FindBy(className = "react-autosuggest__input")
	WebElement searchElement2;

	public void searchKey() {
		searchElement2.sendKeys("mattress");
	}

	@FindBy(xpath = "(//span[contains(text(), 'Account')])[2]")
	WebElement accountElement;

	public void accountButton() throws InterruptedException {
		accountElement.click();
		Thread.sleep(6000);
	}

	@FindBy(css = "a.Button.mb-1.py-2.Button--primary")
	WebElement signInElement;

	public void clickSignInButton() throws InterruptedException {
		signInElement.click();
		Thread.sleep(5000);
	}

	@FindBy(xpath = "//input[@name='email']")
	WebElement clickEmailElement;

	public void clickEmailBox() throws InterruptedException {
		clickEmailElement.click();
		Thread.sleep(5000);
	}

	@FindBy(css = "input#password")
	WebElement PasswordElement;

	public void clickPasswordElement() {

		PasswordElement.click();
	}

	@FindBy(css = "div.Image.GlobalHeaderMain__LogoImg.Image--contain.Image--high-contrast")
	WebElement logo;

	public boolean logoDisplayed() {
		boolean flag = logo.isDisplayed();
		System.out.println("The logo is Displayed? Ans: " + flag);
		return flag;
	}

}
