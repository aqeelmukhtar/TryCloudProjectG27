package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.Login;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_step_def extends BasePage {
    Login login = new Login();


    @Given("user on the login page")
    public void user_on_the_login_page() {

        Driver.getDriver().get("http://qa3.trycloud.net");

    }
    @When("user use username {string} and passcode {string}")
    public void userUseUsernameAndPasscode(String arg0, String arg1) {
       login.username.sendKeys(arg0);
       login.password.sendKeys(arg1);

    }


    @When("user click the login button")
    public void user_click_the_login_button() {
        login.loginButton.click();

    }
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {

    }


    @And("user click the dashboard")
    public void userClickTheDashboard() {


        contacts.click();
        dashboard.click();
        mail.click();





    }


}
