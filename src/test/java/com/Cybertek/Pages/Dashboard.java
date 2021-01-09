package com.Cybertek.Pages;

import com.Cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends BasePage{
    @FindBy(xpath = "//li[@id='user-menu']/a")
    public WebElement userName;

    public String getUsername(){

        String actualUusername=userName.getText();


return actualUusername;
    }




}
