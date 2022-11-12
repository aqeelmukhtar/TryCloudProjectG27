package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommentFile {


    public CommentFile() {

        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(xpath = "((//tbody)[1]/tr/td/a/span/a[@href='#'])[1]")
    public WebElement actionIcon;


    @FindBy(xpath = "//a[@data-action='Details']")
    public WebElement details;


    @FindBy(xpath = "//a[@id='commentsTabView']")
    public WebElement comments;


    @FindBy(xpath = "//div[@class='message']")
    public WebElement commentInput;


    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='icon-comment']")
    public WebElement verifyMessage;
}