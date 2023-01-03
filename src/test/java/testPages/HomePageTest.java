package testPages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = true)
	public void clickLogoElementTest() {
		homePage.clickLogoElement();
	}

	@Test(enabled = true)
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

	@Test(enabled = true)
	public void clickSearchElementTest() {
		homePage.searchKey();
	}

}
