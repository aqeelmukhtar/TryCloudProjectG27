package com.trycloud.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public Login() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement invalidUserAndPass;


//    When you call this method,It will automatically take all information from config.properties and then login.
    public void autoLogin() {
        Driver.getDriver().get("http://qa3.trycloud.net/index.php/login?clear=1");
        username.sendKeys(ConfigurationReader.getProperty("user"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

}
