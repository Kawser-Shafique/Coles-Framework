package com.coles.steps;

import org.openqa.selenium.WebDriver;

import com.coles.common.Common;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	Common cs;
	
	@Given("^I am on company homepage$")
	public void i_am_on_company_homepage() throws Throwable {
	  driver = Common.getbrowser("chrome", driver);
	  driver.get(Common.getGetURL());
	}

	@When("^I enter search term$")
	public void i_enter_search_term() throws Throwable {
	   
	}

	@When("^I click on Search button$")
	public void i_click_on_Search_button() throws Throwable {
	    
	}

	@Then("^I find relative search contents on company homepage$")
	public void i_find_relative_search_contents_on_company_homepage() throws Throwable {
	  
	}

}
