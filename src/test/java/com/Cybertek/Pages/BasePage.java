package com.Cybertek.Pages;

import com.Cybertek.utilities.BrowserUtils;
import com.Cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class  BasePage {


     public BasePage(){
         PageFactory.initElements(Driver.get(),this);

     }

    public void navigateTabToModule(String tab,String module){
        String xpathTab="(//span[contains(text(),'"+tab+"')])[1]";
        String xpathModule="//span[contains(text(),'"+module+"')]";

        //String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        //String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(xpathTab), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(xpathTab));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(xpathTab), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(xpathModule), 5);
            BrowserUtils.waitForVisibility(By.xpath(xpathModule), 5);
            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(xpathModule)));
            Driver.get().findElement(By.xpath(xpathModule)).click();
        } catch (Exception e) {
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(xpathModule)),  5);

        }

    }
}
