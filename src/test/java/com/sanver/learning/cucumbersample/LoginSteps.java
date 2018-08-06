package com.sanver.learning.cucumbersample;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;

public class LoginSteps {
    @Given("^I navigate to the login page of the application$")
    public void iNavigateToTheLoginPageOfTheApplication() {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(List<User> users) {
        users.forEach(user -> System.out.printf("\nUser name: %s\nPassword: %s\n", user.getUserName(),
                user.getPassword()));
    }

    @And("^I click login button$")
    public void iClickLoginButton() {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUserNameAndPassword(String userName, String password) {
        System.out.printf("\nUser name: %s\nPassword: %s\n", userName, password);
    }
}
