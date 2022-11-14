package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Files {
    public Files() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "user")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(xpath = "(//a[@aria-label='Dashboard'])[1]")
    public WebElement dashboard;
    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement files;
    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addNewButton;
    @FindBy(xpath = "(//span[@class='displayname'])[2]")
    public WebElement newFolderButton;
    @FindBy(id = "view13-input-folder")
    public WebElement newFolderEntry;
    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement submitButton;
    @FindBy(xpath = "//*[@id='fileList']/tr[13]/td[2]/a/span[1]/span")
    public WebElement newFolder;


}
