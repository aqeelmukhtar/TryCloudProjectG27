package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@aria-label='Dashboard'])[1]")
    public WebElement dashboard;

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement files;

    @FindBy(xpath = "(//a[@aria-label='Photos'])[1]")
    public WebElement photos;

    @FindBy(xpath = "(//a[@aria-label='Activity'])[1]")
    public WebElement activity;

    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement talk;

    @FindBy(xpath = "(//a[@aria-label='Mail'])[1]")
    public WebElement mail;

    @FindBy(xpath = "(//a[@href='/index.php/apps/contacts/'])[1]")
    public WebElement contacts;

    @FindBy(xpath = "(//a[@aria-label='Circles'])[1]")
    public WebElement circles;

    @FindBy(xpath = "(//a[@aria-label='Calendar'])[1]")
    public WebElement calendar;

    @FindBy(xpath = "(//a[@aria-label='Deck'])[1]")
    public WebElement deck;

    public void module(String string) {

        switch (string) {

            case "dashboard":
                dashboard.click();
                break;
            case "files":
                files.click();
                break;
            case "photos":
                photos.click();
                break;
            case "activity":
                activity.click();
                break;
            case "talk":
                talk.click();
                break;
            case "mail":
                mail.click();
                break;
            case "contacts":
                contacts.click();
                break;
            case "circles":
                circles.click();
                break;
            case "calendar":
                calendar.click();
                break;
            case "deck":
                deck.click();
                break;


        }
    }


}
