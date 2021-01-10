package com.Cybertek.StepDeffinitions;

import com.Cybertek.Pages.LoginPage;
import com.Cybertek.utilities.BrowserUtils;
import com.Cybertek.utilities.ConfigurationReader;
import com.Cybertek.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class modulecheckstepDeff {

    LoginPage loginPage = new LoginPage();
    @When("User enter {string} credentials")
    public void user_enter_credentials(String login) {
        String username=null;
        String password=null;

        switch (login){
            case "driver":
                username= ConfigurationReader.get("driver_username");
                password=ConfigurationReader.get("driver_password");
                break;
            case "salesmanager":
                username= ConfigurationReader.get("sales_manager_username");
                password=ConfigurationReader.get("sales_manager_password");
                break;
            case "storemanager":
                username= ConfigurationReader.get("store_manager_username");
                password=ConfigurationReader.get("store_manager_password");
                break;
            default:
                System.out.println("Invalid username");
                break;
        }
        loginPage.loginWithUsernameAndPassword(username,password);

    }


    @Then("User should land on the application")
    public void user_should_land_on_the_application() {
        System.out.println("Not yet implemented");
        String expectedurl ="https://qa3.vytrack.com/";
        Assert.assertEquals(expectedurl, Driver.get().getCurrentUrl());
    }
    @Then("User click on the {string} and {string}")
    public void user_click_on_the_and(String tab, String module) {
        System.out.println("Not yet implemented");

        loginPage.navigateTabToModule(tab,module);
    }
    @Then("User should land the page of {string}")
    public void user_should_land_the_page_of(String pageTitle) {

        BrowserUtils.waitFor(2);
        Assert.assertEquals(pageTitle,Driver.get().getTitle());

    }

}
