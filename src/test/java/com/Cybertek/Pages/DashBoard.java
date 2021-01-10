package com.Cybertek.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashBoard extends BasePage{
    @FindBy(xpath = "//li[@id='user-menu']/a")
    public WebElement login_button;

    @FindBy(css = "span.title-level-1")
    public List<WebElement> menuOptions;



}
