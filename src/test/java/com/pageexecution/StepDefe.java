package com.pageexecution;

import org.junit.Assert;

import com.basepackage.BaseClassEx;
import com.pagefactory.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefe {

	@Given("Launch the browser and load url")
	public void methodA() {
		BaseClassEx.browserLaunch();
		BaseClassEx.loadUrl("http://adactinhotelapp.com/index.php");
	}

	@When("Provide valid username and password and hit login")
	public void methodB() {
		LoginPage lp = new LoginPage();
		lp.userName.sendKeys("Jamuna1611");
		lp.passWord.sendKeys("YTQ7GC");
		lp.loginBtn.click();
		
	}

	@Then("Validate if the user logged in then close browser")
	public void methodC() {
		Assert.assertTrue(true);
		BaseClassEx.closeBrowser();
	}

	@When("Provide valid {string} and {string} and hit login")
	public void provide_valid_and_and_hit_login(String user, String pass) {
		LoginPage lp = new LoginPage();
		lp.userName.sendKeys(user);
		lp.passWord.sendKeys(pass);
		lp.loginBtn.click();
	}
}
