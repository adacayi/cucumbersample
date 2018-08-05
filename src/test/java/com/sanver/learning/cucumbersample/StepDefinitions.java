package com.sanver.learning.cucumbersample;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {
    private Belly belly;

    @Given("^I have (\\d+) cukes in my belly$")
    public void iHaveCukesInMyBelly(int cukes) {
        belly = new Belly();
        belly.eat(cukes);
    }

    @When("^I wait (\\d+) hour$")
    public void iWaitHour(int hours) {
        belly.waitFor(hours);
    }

    @Then("^my belly should growl$")
    public void myBellyShouldGrowl() {
        Assertions.assertTrue(belly.isGrowling());
    }
}
