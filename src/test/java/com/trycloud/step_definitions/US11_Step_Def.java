package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.Talk;
import com.trycloud.pages.US11;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US11_Step_Def  {
    US11 us11 = new US11();
    Talk talk = new Talk();
    String message1 = "wussap1";


    @When("the user clicks the Talk module")
    public void theUserClicksTheTalkModule() {
        talk.talk.click();

    }

    @When("user search user from the search box")
    public void user_search_user_from_the_search_box() {
        us11.searchBox.sendKeys("User67");

        us11.selectedUser.click();

    }
    @When("user write a message")
    public void user_write_a_message() {
        us11.messageBox.click();
        us11.messageBox.sendKeys(message1);
    }
    @When("user clicks to submit button")
    public void user_clicks_to_submit_button() {
        us11.submitBtn.click();
    }
    @Then("the user should be able to see the message is displayed on the conversation log")
    public void the_user_should_be_able_to_see_the_message_is_displayed_on_the_conversation_log() {
        for (WebElement eachMessage : us11.message) {
            if (eachMessage.getText() == message1) {
                Assert.assertEquals(message1, eachMessage.getText());

            }
        }
    }


}
