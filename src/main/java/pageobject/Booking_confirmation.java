package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_confirmation {
public static WebDriver driver;
	
	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement myitenatybutton;
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getMyitenatybutton() {
		return myitenatybutton;
	}
	public Booking_confirmation(WebDriver driver) {
		this.driver=driver;
		//page factory
		PageFactory.initElements(driver, this);
}
}