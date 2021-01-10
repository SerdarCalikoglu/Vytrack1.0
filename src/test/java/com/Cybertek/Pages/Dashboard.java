package com.Cybertek.Pages;

import com.Cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Dashboard extends BasePage{
    @FindBy(xpath = "//li[@id='user-menu']/a")
    public WebElement userName;

    @FindBy(css="span.title-level-1")
    public List<WebElement> menuOptions;

    public String getUsername(){

        String actualUusername=userName.getText();


return actualUusername;
    }




}
