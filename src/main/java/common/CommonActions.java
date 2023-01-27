package common;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import reporting.Logs;


public class CommonActions {
	
	
	/*
	 * public static void clickElement(WebElement element) throws NoSuchElementException, NullPointerException{
	
		
		element.click();
		Logs.log(element + " <-----> has been clicked");// Here Webelement type converted to string type
		Logs.log(element+ " <------> has not been found");
		Assert.fail();

	}
	
	public static void inputText(WebElement element, String input) throws NoSuchElementException, NullPointerException {
		
			element.sendKeys(input);
			Logs.log(input + "<-------> has been put into <----->" + element);
			Logs.log(element + "");
		}
		
		*/
	
	public static void clickElement(WebElement element) {
		try {
			element.click();
			Logs.log(element + " <-----> has been clicked"); // Here WebElement type converted to String type, String+String
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log(element + " <-----> has not been found");
			Assert.fail();
		}


	}
	
	public static void inputText(WebElement element, String input) {
		try {
			element.sendKeys(input);
			Logs.log(input + " <-----> has been put into <-----> " + element);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log(element + " <-----> has not been found, so couldn't put the input");
			Assert.fail();
		}
}
	

}