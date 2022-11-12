package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.CommentFile;
import com.trycloud.pages.Login;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommentFiles_Step_Definition extends BasePage {
    Login login = new Login();
    CommentFile commentFiles = new CommentFile();

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

    @And("user write a comment inside the input box")
    public void userWriteAInsideTheInputBox() {
        commentFiles.comments.click();
        commentFiles.commentInput.sendKeys(ConfigurationReader.getProperty("comment"));
    }

    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        commentFiles.submitButton.click();
    }



    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
        BrowserUtils.sleep(3);
        String actualMessage = commentFiles.verifyMessage.getText();

        Assert.assertEquals("There is mismatching",ConfigurationReader.getProperty("comment"), actualMessage);
    }

}