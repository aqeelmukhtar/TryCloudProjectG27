package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.CommentFiles;
import com.trycloud.pages.Login;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommentFiles_Step_Definition extends BasePage {
        Login login = new Login();
    CommentFiles commentFiles = new CommentFiles();
    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

        login.autoLogin();


    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        files.click();
    }
    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {

        commentFiles.actionIcon.click();

    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        commentFiles.details.click();

    }
    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {
        commentFiles.comments.sendKeys("gm");

    }
    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        commentFiles.submitButton.click();

    }
    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {

        commentFiles.verifyMessage.isDisplayed();
    }

}
