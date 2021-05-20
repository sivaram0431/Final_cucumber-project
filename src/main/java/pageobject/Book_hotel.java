package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_hotel {
public static WebDriver driver;
	
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement fname;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getBilladdress() {
		return billaddress;
	}

	public WebElement getCnum() {
		return cnum;
	}

	public WebElement getCtype() {
		return ctype;
	}

	public WebElement getCardmonth() {
		return cardmonth;
	}

	public WebElement getCardyear() {
		return cardyear;
	}

	public WebElement getCardcvv() {
		return cardcvv;
	}

	public WebElement getBooknowbtn() {
		return booknowbtn;
	}

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lname;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement billaddress;
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement cnum;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement ctype;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement cardmonth;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement cardyear;
	
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cardcvv;
	
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement booknowbtn;
	
	public Book_hotel(WebDriver driver) {
		this.driver=driver;
		//page factory
		PageFactory.initElements(driver, this);
	
}
}