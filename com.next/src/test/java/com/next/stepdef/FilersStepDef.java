package com.next.stepdef;

import com.next.pageobjects.FilterPageObject;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FilersStepDef {
    private FilterPageObject filterPageObject=new FilterPageObject();
    @When("^I select \"([^\"]*)\"$")
    public void iSelect(String customerSelectedlink) {
        filterPageObject.moveTo(customerSelectedlink);
    }

    @And("^I move to \"([^\"]*)\"$")
    public void iMoveTo(String arg0){
    }

    @Then("^I take screen shot$")
    public void iTakeScreenShot() {
    }
}

