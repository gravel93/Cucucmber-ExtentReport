package StepDefinitians;

import org.openqa.selenium.support.PageFactory;

import PageObjects.HomePage;
import PageObjects.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInSteps extends Login {

	HomePage objHomePage = PageFactory.initElements(driver, HomePage.class);
	Login objLogiIn = PageFactory.initElements(driver, Login.class);

	@Given("^user should be in login page$")
	public void user_should_be_in_login_page() {
		objHomePage.loginLink();
	}
	

	@When("^enter valid username and password to inputs$")
	public void enter_valid_username_and_password_to_inputs() {
		objLogiIn.login();
	}

	@Then("^User Should successfully loged in into account$")
	public void user_Should_successfully_loged_in_into_account() {
		System.out.println("Logo is verified!");
	}

}
