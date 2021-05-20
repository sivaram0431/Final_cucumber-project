package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.NeedsLocalLogs;
import org.openqa.selenium.support.PageFactory;

import pageobject.Book_hotel;
import pageobject.Booked_itenary;
import pageobject.Booking_confirmation;
import pageobject.Login_page;
import pageobject.search_hotel;
import pageobject.select_hotel;

public class page_objectmanager {
    public static WebDriver driver;
    
    
   
	private Login_page login;
    private search_hotel search;
    private select_hotel select;
    private Book_hotel bkhotel;
    private Booking_confirmation bcp;
    private Booked_itenary bit;
    
    public search_hotel getinstanceSearch() {
    	search = new search_hotel(driver);
		return search;
	}


	public select_hotel getinstanceSelect() {
		select = new select_hotel(driver);
		return select;
	}


	public Book_hotel getinstanceBkhotel() {
		bkhotel = new Book_hotel(driver);
		return bkhotel;
	}


	public Booking_confirmation getinstanceBcp() {
		bcp = new Booking_confirmation(driver);
		return bcp;
	}


	public Booked_itenary getinstanceBit() {
		bit = new Booked_itenary(driver);
		return bit;
	}
	
  public Login_page getinstanceLogin() {
    	login = new Login_page(driver);
		return login;
	}		
    			
  public page_objectmanager(WebDriver driver) {
		this.driver=driver;
		//page factory
		PageFactory.initElements(driver, this);			
  }	
	
}
