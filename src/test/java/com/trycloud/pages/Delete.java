package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.apache.hc.core5.http.Message;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delete {

    public Delete() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='nav-icon-files svg active']")
    public WebElement files;

    @FindBy (xpath = "//a[@class='action action-menu permanent open']")
    public WebElement actionIcon;























}
