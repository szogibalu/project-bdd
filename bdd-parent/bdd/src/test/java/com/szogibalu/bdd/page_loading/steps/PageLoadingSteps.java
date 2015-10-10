package com.szogibalu.bdd.page_loading.steps;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PageLoadingSteps {  

  @Before
  public void initSelenium() throws Exception {
  }

  @Given("^I am a user$")
  public void I_am_a_user() {
	  Assert.fail();
  }

  @When("^I load the page$")
  public void I_load_the_page() {
	  Assert.fail();
    
  }

  @Then("^I should see the page$")
  public void I_should_see_the_page() {
	  Assert.fail();    
  }

  @After
  public void destroySelenium() {
	  
  }
}