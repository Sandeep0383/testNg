package com.next.stepdef;

import com.next.pageobjects.SearchPageObject;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchStepDef {
    private SearchPageObject searchPageObject=new SearchPageObject();
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
        String actual=searchPageObject.getHomePageUrl();
        assertThat("Home page not diplayed",actual, Matchers.endsWith("co.uk/"));
    }

    @When("^I search for a product \"([^\"]*)\"$")
    public void iSearchForAProduct(String item) throws Throwable {
        searchPageObject.doSearch(item);
    }

    @Then("^I can see the respective result$")
    public void iCanSeeTheRespectiveResult() {

    }
}