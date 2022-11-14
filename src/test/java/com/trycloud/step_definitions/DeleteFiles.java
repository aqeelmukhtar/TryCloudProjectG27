package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.Files;
import com.trycloud.pages.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class DeleteFiles extends BasePage {
    Login login = new Login();

    DeleteFiles deleteFiles = new DeleteFiles();


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

    Login.autologin();
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        files.click();
    }
    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        deleteFiles.actionicon.click();
    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {

    }
    @When("the user clicks the {string} sub-module on the left side")
    public void the_user_clicks_the_sub_module_on_the_left_side(String string) {

    }
    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {

    }

}
