package com.Cybertek.StepDeffinitions;

import com.Cybertek.Pages.DashBoard;
import com.Cybertek.Pages.LoginPage;
import com.Cybertek.utilities.BrowserUtils;
import com.Cybertek.utilities.ConfigurationReader;
import com.Cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class loginstepDeff {
LoginPage loginPage=new LoginPage();
    @Given("User is on log in page")
    public void user_is_on_log_in_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }


    @When("User log in with {string} user name")
    public void user_log_in_with_user_name(String username) {
        loginPage.username.sendKeys(ConfigurationReader.get(username));

    }
    @When("User log in with {string} password")
    public void user_log_in_with_password(String password) {
       loginPage.password.sendKeys(ConfigurationReader.get(password));
    }
    @When("User enter the submit button")
    public void user_enter_the_submit_button() {
        loginPage.login_button.click();
    }
    @Then("User should see the following message {string}")
    public void user_should_see_the_following_message(String expectedmessage) {
        Assert.assertEquals(expectedmessage,loginPage.errorMessage.getText());
    }


    @Then("User should see {string} as current url")
    public void user_should_see_as_current_url(String expetedUrl) {
        BrowserUtils.waitForPageToLoad(10);
        Assert.assertEquals(expetedUrl,Driver.get().getCurrentUrl());
    }


    @Then("User should see {string} as a user name")
    public void user_should_see_as_a_user_name(String expectedUsername) {
        BrowserUtils.waitFor(5);
    Assert.assertEquals(expectedUsername,loginPage.dashboardUsername.getText());

    }

    @When("User should see the following list")
    public void user_should_see_the_following_list(List<String> expectedmenuopitons) {

        BrowserUtils.waitFor(5);
        DashBoard dashBoard= new DashBoard();
        List<String> actualOptions = BrowserUtils.getElementsText(dashBoard.menuOptions);
        Assert.assertEquals(expectedmenuopitons,actualOptions);
        System.out.println(expectedmenuopitons);
        System.out.println(actualOptions);
    }

}
