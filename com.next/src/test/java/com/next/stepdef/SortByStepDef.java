package com.next.stepdef;

import com.next.pageobjects.SortByPageObject;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SortByStepDef {

private SortByPageObject sortByPageObject=new SortByPageObject();
    @And("^I set sort by filter a \"([^\"]*)\"$")
    public void iSetSortByFilterA(String customerSelectedSort ) throws Throwable {
        sortByPageObject.setSortBy(customerSelectedSort);
        }
    @Then("^I should see all the product in sorted order price$")
    public void iShouldSeeAllTheProductInSortedOrderPrice() {

    }
}

