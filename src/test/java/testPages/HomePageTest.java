package testPages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	
	@Test(enabled=false)
	public void clickLogoElementTest() {
		homePage.clickLogoElement();
	}
	@Test(enabled=false)
	public void clicksearchElementTest() {
		homePage.clicksearchElement();
	}
	@Test(enabled=true)
	public void clickAccountElementTest() {
		homePage.clickAccount();
	}

/*	@Test
	public void clickshopnowtest() {
		homePage.testShopNowElement();

	}

	@Test
	public void clickCreditCardTest() {
		homePage.clickCreditCard();

	}
	@Test
	public void clickLoyaltyElementTest() {
		homePage.clickLoyaltyElement();
	}*/
}
