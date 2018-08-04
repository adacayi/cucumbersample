package com.sanver.learning.cucumbersample;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {
    private Belly belly;

    @Given("I have {int} cukes in my belly")
    public void i_have_cukes_in_my_belly(Integer cukes) {
        belly = new Belly();
        belly.eat(cukes);
    }

    @When("I wait {int} hour")
    public void i_wait_hour(Integer hours) {
        belly.waitFor(hours);
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        Assertions.assertTrue(belly.isGrowling());
    }
}
