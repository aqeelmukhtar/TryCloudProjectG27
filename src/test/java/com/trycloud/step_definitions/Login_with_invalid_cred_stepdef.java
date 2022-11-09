package com.trycloud.step_definitions;

import com.trycloud.pages.Login;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_with_invalid_cred_stepdef {
    Login login = new Login();

    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String user, String pass) {
        login.username.sendKeys(user);
        login.password.sendKeys(pass);

    }
    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String string) {
        Assert.assertEquals(string,login.invalidUserAndPass.getText());

    }


}
