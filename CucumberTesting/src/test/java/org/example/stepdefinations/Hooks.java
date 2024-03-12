package stepdefinations;

import io.cucumber.java.*;
import org.example.BaseClass;
import org.openqa.selenium.WebDriver;

public class Hooks extends BaseClass {

    @Before
    public void setup(){
        setupdriver();



    }

    @After
    public void close(){
        closedriver();


    }
}




