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

}
