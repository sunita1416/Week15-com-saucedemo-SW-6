package com.saucedemo.steps;

import com.saucedemo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username) {
     new LoginPage().enterUsername(username);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password){
        new LoginPage().enterPassword(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginLink();
    }

    @Then("^I should be able to login successfully$")
    public void iShouldBeAbleToLoginSuccessfully() {
    }

    @And("^I click on login$")
    public void iClickOnLogin() {
    }

    @Then("^I should be able to login successfully and see \"([^\"]*)\"$")
    public void iShouldBeAbleToLoginSuccessfullyAndSee(String text){
        Assert.assertEquals(text, new LoginPage().getProductsText(), "Products Page not displayed");
    }


}
