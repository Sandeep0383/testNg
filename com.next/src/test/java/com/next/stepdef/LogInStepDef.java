package com.next.stepdef;

import com.next.pageobjects.LogInPageObject;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInStepDef {
private LogInPageObject logInPageObject=new LogInPageObject();
    @When("^I enter the \"([^\"]*)\",\"([^\"]*)\"$")
    public void iEnterThe(String username, String password) throws Throwable {
     logInPageObject.singUp(username,password);
    }

    @Then("^I can register the site$")
    public void iCanRegisterTheSite() {
    }

    }

