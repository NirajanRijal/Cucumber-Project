package org.example.stepdefinations;

import io.cucumber.java.*;
import org.example.utils.GlobalVariables;
import org.example.utils.SingletonBrowserClass;

public class Hooks {


    @Before
    public static void beforeall() {
        //setupdriver();
        GlobalVariables.driver = SingletonBrowserClass.getInstanceOfSingletonBrowserClass().getDriver();
    }


    @After
    public static void close() {
        //closedriver();
        GlobalVariables.driver.quit();
        GlobalVariables.driver = null;


    }

    @AfterStep
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("Scenario " + scenario.getName() + "is failed");
        }
    }
}






