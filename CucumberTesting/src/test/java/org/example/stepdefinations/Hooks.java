package org.example.stepdefinations;

import io.cucumber.java.*;
import org.example.utils.GlobalVariables;
import org.example.utils.SingletonBrowserClass;

public class Hooks{



    @BeforeAll
    public static void beforeall(){
        //setupdriver();
        GlobalVariables.driver = SingletonBrowserClass.getInstanceOfSingletonBrowserClass().getDriver();
    }


    @AfterAll
    public static void close(){
        //closedriver();
        GlobalVariables.driver.quit();
        GlobalVariables.driver=null;



    }
}






