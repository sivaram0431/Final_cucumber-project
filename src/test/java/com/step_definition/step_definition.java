package com.step_definition;

import org.openqa.selenium.WebDriver;

import com.Base_methods.Baseclass;
import com.acactin_Testrunner.Test_Runner;
import com.adactin.helper.page_objectmanager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobject.Book_hotel;
import pageobject.Booked_itenary;
import pageobject.Booking_confirmation;
import pageobject.Login_page;
import pageobject.search_hotel;
import pageobject.select_hotel;

public class step_definition extends Baseclass {
	public static WebDriver driver = Test_Runner.driver;
	
	 //public static Login_page login = new Login_page(driver);
	// public static search_hotel shotel = new search_hotel(driver);
	// public static select_hotel selhotel = new select_hotel(driver);
	// public static Book_hotel bhotel = new Book_hotel(driver);
	// public static Booking_confirmation bcpage = new Booking_confirmation(driver);
	// public static Booked_itenary myiten = new Booked_itenary(driver);
	 public static page_objectmanager pom = new page_objectmanager(driver);
	 
	 
	//scenario 1
	@Given("^User Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
	    openwebsite("https://adactinhotelapp.com/");
	   
	}

	@When("^User Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
	 //inputvalue(login.getUname(), "sivaram0431");
		inputvalue(pom.getinstanceLogin().getUname(), "sivaram0431");
	}

	@When("^User Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
	   // inputvalue(login.getPwd(), "116070019");
		inputvalue(pom.getinstanceLogin().getPwd(), "116070019");
	}

	@Then("^User click On the Login Button And It Navigates To Search Hotel Page$")
	public void user_click_On_the_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
	  // clickonelement(login.getLoginbutton());
		clickonelement(pom.getinstanceLogin().getLoginbutton());
	}
   //Scenario2
	
	@When("^User Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		Thread.sleep(5000);
	    SelectOption(pom.getinstanceSearch().getLocation(), "text" ,"Sydney");
	}

	@When("^User Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		SelectOption(pom.getinstanceSearch().getHotels(), "text" ,"Hotel Creek");
	}

	@When("^User Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		SelectOption(pom.getinstanceSearch().getRoomtype(), "text" ,"Standard");
	}

	@When("^User Select The No Of Rooms$")
	public void user_Select_The_No_Of_Rooms() throws Throwable {
	    SelectOption(pom.getinstanceSearch().getRoomno(), "text", "2 - Two");
	}

	@When("^User Enter The Checkin Date$")
	public void user_Enter_The_Checkin_Date() throws Throwable {
	    inputvalue(pom.getinstanceSearch().getDatein(), "13/05/2021");
	}

	@When("^User Enter The Checkout Date$")
	public void user_Enter_The_Checkout_Date() throws Throwable {
	    inputvalue(pom.getinstanceSearch().getDateout(), "16/05/2021");
	}

	@When("^User Select The Adults Per Room$")
	public void user_Select_The_Adults_Per_Room() throws Throwable {
		SelectOption(pom.getinstanceSearch().getAdultroom(), "text", "1 - One");
	}

	@When("^User Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {
		SelectOption(pom.getinstanceSearch().getChildroom(), "text", "1 - One");
	}

	@Then("^User Click On The Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
	    clickonelement(pom.getinstanceSearch().getSearchbutton());
	}
  //scenario 3
	
	@When("^Select Hotel With Radio Button$")
	public void select_Hotel_With_Radio_Button() throws Throwable {
	    clickonelement(pom.getinstanceSelect().getRbutton());
	}

	@Then("^Click The continue Button It Navigates To Book a hotel Page$")
	public void click_The_continue_Button_It_Navigates_To_Book_a_hotel_Page() throws Throwable {
        clickonelement(pom.getinstanceSelect().getContinuebutton());
	}

//Scenario 4
	@When("^User Enter The First Name$")
	public void user_Enter_The_First_Name() throws Throwable {
	   inputvalue(pom.getinstanceBkhotel().getFname(), "siva");
	}

	@When("^User Enter The Last Name$")
	public void user_Enter_The_Last_Name() throws Throwable {
	    inputvalue(pom.getinstanceBkhotel().getLname(), "ram");
	}

	@When("^User Enter The Billing Address$")
	public void user_Enter_The_Billing_Address() throws Throwable {
	   inputvalue(pom.getinstanceBkhotel().getBilladdress(), "Billing Address is Trichy");
	}

	@When("^User Enter The Credit Card No$")
	public void user_Enter_The_Credit_Card_No() throws Throwable {
	    inputvalue(pom.getinstanceBkhotel().getCnum(),"1478523691236548");
	}

	@When("^User Se;ect The credit card Type$")
	public void user_Se_ect_The_credit_card_Type() throws Throwable {
	    SelectOption(pom.getinstanceBkhotel().getCtype(), "text","American Express");
	}

	@When("^User Select The Credit Card expiry Month$")
	public void user_Select_The_Credit_Card_expiry_Month() throws Throwable {
	   SelectOption(pom.getinstanceBkhotel().getCardmonth(), "text", "January");
	}

	@When("^User Select The Credit Card expiry Year$")
	public void user_Select_The_Credit_Card_expiry_Year() throws Throwable {
	   SelectOption(pom.getinstanceBkhotel().getCardyear(), "value", "2021");
	}

	@When("^Use Enter The CVV NO$")
	public void use_Enter_The_CVV_NO() throws Throwable {
	    inputvalue(pom.getinstanceBkhotel().getCardcvv(), "123");
	}

	@Then("^User Click On The BookNow Button And It Navigates To Booking Confirmation page$")
	public void user_Click_On_The_BookNow_Button_And_It_Navigates_To_Booking_Confirmation_page() throws Throwable {
	   clickonelement(pom.getinstanceBkhotel().getBooknowbtn());
	}
    
	//Scenario 5
	@When("^User click The my Iternity  It Navigates to the My Iternity Page$")
	public void user_click_The_my_Iternity_It_Navigates_to_the_My_Iternity_Page() throws Throwable {
		Thread.sleep(5000);
	    clickonelement(pom.getinstanceBcp().getMyitenatybutton());
	}

	//scenarion 6
	@When("^User Click The MY logout button it Navigates to Login Page$")
	public void user_Click_The_MY_logout_button_it_Navigates_to_Login_Page() throws Throwable {
		Thread.sleep(5000);
	   clickonelement(pom.getinstanceBit().getLogoutbutton());
	}


}
