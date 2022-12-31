package common;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;


public class CommonActions {
	public static void clickElement(WebElement element) throws NoSuchElementException, NullPointerException{
	
			element.click();
		

	}
	
	public static void inputText(WebElement element, String input) throws NoSuchElementException, NullPointerException {
		
			element.sendKeys(input);
		}
	

}