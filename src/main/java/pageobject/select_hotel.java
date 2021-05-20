package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class select_hotel {
public static WebDriver driver;
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement rbutton;
	
	public static WebDriver getDriver() {
		return driver;
	}




	public WebElement getRbutton() {
		return rbutton;
	}




	public WebElement getContinuebutton() {
		return continuebutton;
	}




	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continuebutton;
	
	
	
	
	public select_hotel(WebDriver driver) {
		this.driver=driver;
		//page factory
		PageFactory.initElements(driver, this);
}
}