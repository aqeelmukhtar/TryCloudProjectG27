package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.Files;
import com.trycloud.pages.Login;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Files_step_definitions extends BasePage {

    Files file = new Files();
    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
Driver.getDriver().get("http://qa3.trycloud.net/index.php/login?clear=");
file.username.sendKeys(ConfigurationReader.getProperty("user1"));
file.password.sendKeys(ConfigurationReader.getProperty("password1"));
file.loginButton.click();

    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        file.files.click();
    }
    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
     file.addNewButton.click();
    }

    @When("user write a folder name")
    public void user_write_a_folder_name() {
        file.newFolderButton.click();
        file.newFolderEntry.sendKeys(ConfigurationReader.getProperty("file"));
    }
    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
     file.submitButton.click();
    }
    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
        Assert.assertTrue(file.newFolder.isDisplayed());
    }

}
