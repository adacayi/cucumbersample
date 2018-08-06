package com.sanver.learning.cucumbersample;

import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.time.LocalDate;
import java.util.List;

public class LoginSteps {
    private WebDriver webDriver;

    public LoginSteps(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

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
        System.out.printf("\n%s is installed\n", webDriver.getName());
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUserNameAndPassword(String userName, String password) {
        System.out.printf("\nUser name: %s\nPassword: %s\n", userName, password);
    }

    @And("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterUsernameAsAndPasswordAs(String userName, String password) {
        System.out.printf("\nUser name: %s\nPassword: %s\n", userName, password);
    }

    @And("^I enter the date as \"([^\"]*)\"$")
    public void iEnterTheDateAs(@Transform(DateTransformer.class) LocalDate date) {
        System.out.printf("\nEntered date is %s", date.toString());
    }
}
