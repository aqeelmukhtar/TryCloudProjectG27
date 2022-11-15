package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;

import com.trycloud.pages.Login;
import com.trycloud.utilities.BrowserUtils;

import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Files_Step_Def extends BasePage {

    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String arg0) {

    BrowserUtils.verifyTitle(Driver.getDriver(),arg0);
    }
}
