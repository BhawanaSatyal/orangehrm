package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepsDef {

    HomePage homePage = new HomePage();

    LoginPage loginPage = new LoginPage();

    LogoutSuccess logoutSuccess = new LogoutSuccess();




    @Given("I am on Login Page")
    public void i_am_on_login_page() {
        homePage.checkIamOnHomePage();


    }



    @When("I enter admin log in username")
    public void i_enter_admin_log_in_username() {
        loginPage.IEnterUserName();

    }

    @When("I enter valid password")
    public void i_enter_valid_password() {
        loginPage.IEnterValidPassword();


    }

    @When("I click on log in submit button")
    public void i_click_on_log_in_submit_button() {
        loginPage.IclickOnLoginButton();

    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {

    }


    @Given("I am already logged in")
    public void i_am_already_logged_in() {

    }

    @When("I click on Logout button")
    public void i_click_on_logout_button() {

    }

    @Then("I should be able to log out successfully")
    public void i_should_be_able_to_log_out_successfully() {

    }

    @Then("see success message")
    public void see_success_message() {

    }

}
