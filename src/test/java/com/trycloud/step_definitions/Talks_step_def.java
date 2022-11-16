package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.Login;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Talks_step_def extends BasePage {
    Login login = new Login();



    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        login.autoLogin();

    }



    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {

        Assert.assertEquals(string, Driver.getDriver().getTitle());







    }

    @When("the user clicks the Talk module")
    public void theUserClicksTheTalkModule() {
        talk.click();
        BrowserUtils.sleep(10);
    }
}
