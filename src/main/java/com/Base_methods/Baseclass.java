package com.Base_methods;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static WebDriver driver;
	
	//browser launch
	public static WebDriver getpro(String type) {
	 if (type.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
         driver = new ChromeDriver();
		} else if(type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
        driver.manage().window().maximize();
		return driver;
       
        
}
	
	//getmethod
	public static void openwebsite(String url) {
		driver.get(url);
	}
	
	//xpath
	public static void location(String xpathname) {
		driver.findElement(By.xpath(xpathname));
	}
	
	//click
	public static void  clickonelement(WebElement element) {
		element.click();
	}
	//Send keys
	public static void inputvalue(WebElement element,String s) {
		element.sendKeys(s);
	}
	//window close
	public static void  windowclose() {
		driver.close();
	}	
	//window quit
	public static void winquit() {
		driver.quit();
	}
	//navigatetourl
	public static void  navito(String url)	{
		driver.navigate().to(url);
		
}
	//navigatetoforward
	public static void naviforw() {
		driver.navigate().forward();
	}
	      
	//navigatebackward
	public static void navibac() {
		driver.navigate().back();
			
	}
	//Navigateto refresh
	public static void naviref() {
		driver.navigate().refresh();
	}
	
	//Alert
	public static void Alt() {
	Alert aler = driver.switchTo().alert();
	aler.accept();
	}

	//Action
	public static void mouseAct(WebElement element) {
	Actions ac = new Actions(driver);
	ac.moveToElement(element).build().perform();
	// ac.contextClick(element).build().perform();
	// ac.click(element);
	// ac.dragAndDrop(element, element);
	}

	//TakeScreenShot
	public static void takesnap() throws IOException {
	TakesScreenshot tc = (TakesScreenshot) driver;
	File scoure = tc.getScreenshotAs(OutputType.FILE);
	File desc = new File("C:\\Users\\sivaram\\eclipse-workspace\\Baseimplementation\\screeenshortscreenshots.png");
	FileUtils.copyFile(scoure, desc);
}
	
	//GetUrl
	public static void GeturlMethod(WebElement element) {
	driver.getCurrentUrl();
	}

	//ImplictWait
	public static void impwait() {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	//Frame
	public static void FrameMethod(WebElement element) {
	driver.switchTo().frame(element);
	}
	
	public static void SelectOption(WebElement element, String option, String input) {
		Select s = new Select(element);
		if (option.equals("index")) {
		int parseInt = Integer.parseInt(input);
		s.selectByIndex(parseInt);
		}else if(option.equals("value")){
		s.selectByValue(input);
		}else if (option.equals("text")) {
		s.selectByVisibleText(input);
		}
		}
}