package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Set;

public class US11 {

    public US11() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@placeholder='Search conversations or users']")
    public WebElement searchBox;



    @FindBy(xpath = "(//span[@class='acli__content__line-one__title'])[1]")
    public WebElement selectedUser;

    @FindBy(xpath = "//div[@class='new-message-form__advancedinput']")
    public WebElement messageBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "//div[@class='rich-text--wrapper']")
    public List<WebElement> message;
}
