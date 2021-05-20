package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_itenary {
public static WebDriver driver;
	
	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logoutbutton;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogoutbutton() {
		return logoutbutton;
	}

	public Booked_itenary(WebDriver driver) {
		this.driver=driver;
		//page factory
		PageFactory.initElements(driver, this);
	
}
}