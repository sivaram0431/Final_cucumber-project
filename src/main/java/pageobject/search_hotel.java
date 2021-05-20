package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search_hotel {
public static WebDriver driver;
	
	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement roomno;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement datein;
	
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement dateout;
	
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultroom;
	
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childroom;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchbutton;
	
	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public search_hotel(WebDriver driver) {
		this.driver=driver;
		//page factory
		PageFactory.initElements(driver, this);
	
	
}
}