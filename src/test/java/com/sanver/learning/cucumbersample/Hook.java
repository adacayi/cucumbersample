package com.sanver.learning.cucumbersample;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
    @Before
    public void setUp(Scenario scenario) {
        String scenarioName = scenario.getName();
        System.out.printf("\nHooking up to %s", scenarioName);
    }

    @After
    public void tearDown(Scenario scenario) {
        String scenarioName = scenario.getName();

        if (scenario.isFailed()) {
            System.out.printf("\n%s failed\n", scenarioName);
        }

        System.out.printf("\nTearing down %s\n", scenarioName);
    }
}
