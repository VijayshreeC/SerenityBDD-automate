package com.step.definitions;

import com.step.steps.Step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDef {
	
	@Steps
	Step steps;
	
	@Given("^I am logged in as admin$")
	public void i_am_logged_in_as_admin() {
		steps.openBrowser();
	}

	@When("^I click on 'Add'$")
	public void i_click_on_Add() {
	}
	

	@Then("^I should see a warning that the phone number is too short$")
	public void i_should_see_a_warning_that_the_phone_number_is_too_short() {
		
	}

}
