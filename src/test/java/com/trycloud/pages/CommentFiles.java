package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommentFiles {


    public CommentFiles () {

        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy (xpath = "//a[@class='action action-menu permanent open']")
    public WebElement actionIcon;


    @FindBy (xpath = "//span[text()='Details']")
    public WebElement details;


    @FindBy (xpath = "//a[@id='commentsTabView']")
    public WebElement comments;



    @FindBy (xpath = "//div[@class='message']")
    public WebElement commentInput;


    @FindBy (xpath = "(//input[@type='submit'])[1]")
    public WebElement submitButton;

    @FindBy (xpath = "//div[.='gm']")
    public WebElement verifyMessage;
















}
