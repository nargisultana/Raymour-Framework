package dynamicxpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Xpath {

//class	

	@FindBy(xpath = "//a[@class='emailSignUpBtn']")
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

	@FindBy(xpath = "//a[@class= 'a-standalone']")
	WebElement findAgent;

	public void clickFindAgentElement() {
		findAgent.click();
	}

	@FindBy(xpath = "//div[@class='gAUl-']")
	WebElement findjewelry;

	public void clickFindJewelry() {
		findjewelry.click();
	}
	// name

	@FindBy(xpath = "//input[@name='Ntt']") // by name
	WebElement searchboxElement;

	public void clickSearchBox() {
		searchboxElement.click();
	}

	@FindBy(xpath = "//svg[@name='qutar']")
	WebElement qutarElement;

	public void clickQutarElement() {
		qutarElement.click();
	}

	@FindBy(xpath = "//a[@name='login']")
	WebElement logElement;

	public void clickLogElement() {
		logElement.click();
	}

	@FindBy(xpath = "//div[@name='signin']")
	WebElement signElement;

	public void clickSignElement() {
		signElement.click();
	}

	@FindBy(xpath = "//a[@name='surgery']")
	WebElement surgeryElement;

	public void clickSurgeryElement() {
		surgeryElement.click();
	}

	// id

	@FindBy(xpath = "//a[@id='close-country-popup']") // by id
	WebElement clickUsElement;

	public void clickCountry() {
		clickUsElement.click();
	}

	@FindBy(xpath = "//a[@id='new-viewEditCancel']")
	WebElement clickCancel;

	public void clickCancel() {
		clickCancel.click();
	}

	@FindBy(xpath = "//a[@[id='new-viewEditCancel']")
	WebElement edit;

	public void clickEditButton() {
		edit.click();
	}

	@FindBy(xpath = "//a[@id='ac-gn-link-search']")
	WebElement ipadElement;

	public void clickIpad() {
		ipadElement.click();
	}

	@FindBy(xpath = "//a[@id='ac-gn-firstfocus']")
	WebElement logoElement;

	public void clicklogoButton() {
		logoElement.click();
	}

	// text

	@FindBy(xpath = "//span[text()='Sign In']")
	WebElement clickSignInElement;

	public void clickSignIn() {
		clickSignInElement.click();
	}

	@FindBy(xpath = "//a[text() ='Log into Blackboard']") // text
	WebElement clickLogInElement;

	public void clickLogIn() {
		clickLogInElement.click();
	}

	@FindBy(xpath = "//a[text()='Faculty User Guides']") // TEXT
	WebElement clickFacultyElement;

	public void clickFaculty() {
		clickFacultyElement.click();
	}

	@FindBy(xpath = "//p[text()='View resources']") // text
	WebElement viewElement;

	public void clickViewElement() {
		viewElement.click();
	}

	@FindBy(xpath = "//span[text()='Women']") // text
	WebElement clickMen;

	public void clickMenElement() {
		clickMen.click();
	}

	// partial text

	@FindBy(xpath = "(//span[contains(text(), 'Help')])[1]") // partical text
	WebElement helpElement;

	public void clickHelpCenter() {
		helpElement.click();
	}

	@FindBy(xpath = "(//a[contains(text(), 'About')])[3]") // partial text
	WebElement aboutElement;

	public void clickAboutButton() {
		aboutElement.click();
	}

	@FindBy(xpath = "(//div[contains(text(), 'Mattre')])[1]")
	WebElement mattressButton;

	public void clickMattressButton() {
		mattressButton.click();
	}

	@FindBy(xpath = "(//a[contains(text(), 'Open an accou')])[1]") // partial
	WebElement newAccountElement;

	public void clickOpenAccount() {
		newAccountElement.click();
	}

	@FindBy(xpath = "(//a[contains(text(), 'Eve')])[2]")
	WebElement eveningButtonElement;

	public void clickEveningButton() {
		eveningButtonElement.click();
	}

}