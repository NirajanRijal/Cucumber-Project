package org.example.stepdefinations;

import io.cucumber.java.en.*;
import org.example.utils.GlobalVariables;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Login{

   @Given("user enter valid username and password")
    public void user_enter_valid_username_and_password() {
        GlobalVariables.driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        GlobalVariables.driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("nirajanrijal8@gmail.com");
        GlobalVariables.driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@123");
    }

    @And("user click the login bottom")
    public void user_click_the_login_bottom() {
        GlobalVariables.driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        Assert.assertTrue(GlobalVariables.driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed());
    }

    @Given("user enter invalid username {string} or password {string}")
    public void user_enter_invalid_username_or_password(String username, String password) {
        GlobalVariables.driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        GlobalVariables.driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(username);
        GlobalVariables.driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
    }

    @Then("user is not able to successfully logged in")
    public void user_is_not_able_to_successfully_logged_in() {
        System.out.println("Wrong username or password");
    }



}


