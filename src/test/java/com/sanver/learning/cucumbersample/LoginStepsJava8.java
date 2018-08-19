package com.sanver.learning.cucumbersample;

import cucumber.api.java8.En;

public class LoginStepsJava8 implements En {
    public LoginStepsJava8() {
        And("^I set the Java version to \"([^\"]*)\"$", (String version) ->
                System.out.printf("\nThe version of Java is set to %s", version));
    }
}
