package com.pageexecution;

import com.basepackage.BaseClassEx;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonOrder {

	@Given("Launch browser and load amazon url")
	public void launch_browser_and_amazon_load_url() {
		BaseClassEx.browserLaunch();
		BaseClassEx.loadUrl("https://www.amazon.in/");
		System.out.println("Launch browser and amazon load url");
		
	}

	@Given("Login to account and search for iphone model")
	public void login_to_account_and_search_for_iphone_model() {
	}

	@When("Select the phone and add to cart")
	public void select_the_phone_and_add_to_cart() {
	}

	@When("Provide valid CC details and address then submit order")
	public void provide_valid_cc_details_and_address_then_submit_order() {
	}

	@Then("validate if order is successful and order id is generated")
	public void validate_if_order_is_successful_and_order_id_is_generated() {
	}

	@Then("Logout from amazon application")
	public void logout_from_amazon_application() {
		System.out.println("Logout from amazon application and close browser");
		BaseClassEx.closeBrowser();
		 System.out.println(2/0);
	}

	@Given("Login to the application")
	public void login_to_the_application() {
	   System.out.println(2/0);
	}
	@When("Select the router and add to cart")
	public void select_the_router_and_add_to_cart() {
	 
	}
	@Then("Validate the order detail and shipping detail")
	public void validate_the_order_detail_and_shipping_detail() {

	}



}
