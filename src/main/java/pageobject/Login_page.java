package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement uname;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUname() {
		return uname;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	@FindBy(xpath = "//input[@name='password']")
	private WebElement pwd;
	
	@FindBy(xpath = "//input[@class='login_button']")
	private WebElement loginbutton;
	
	public Login_page(WebDriver driver) {
		this.driver=driver;
		//page factory
		PageFactory.initElements(driver, this);
	}
	
}
