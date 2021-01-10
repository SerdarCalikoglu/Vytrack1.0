package com.Cybertek.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;

public class LoginPage extends BasePage{
    @FindBy(id = "prependedInput")
    public WebElement username;

    @FindBy(css = "#prependedInput2")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"_submit\"]")
    public WebElement login_button;

    @FindBy(xpath = "//div[.='Invalid user name or password.']")
    public WebElement errorMessage;

    @FindBy(xpath = "//li[@id='user-menu']/a")
    public WebElement dashboardUsername;


}
