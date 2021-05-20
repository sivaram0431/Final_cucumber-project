package com.acactin_Testrunner;

import javax.swing.text.html.HTML;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base_methods.Baseclass;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//addin_project",glue = "com.step_definition",monochrome = true,dryRun = false,strict = true,
plugin = {"html:Report/HTML_Report",
		"pretty",
		"json:Reports/Cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtendReport.html"
		
})
public class Test_Runner {
   public static WebDriver driver;
   
    @BeforeClass
	public static void set_up() {
		driver = Baseclass.getpro("chrome");

	}
	
	@AfterClass	
	public static void teardown() {
		driver.close();
	}
	
	
}
