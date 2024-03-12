package stepdefinations;

import io.cucumber.java.en.*;
import org.example.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login extends BaseClass {

   @Given("user enter valid username and password")
    public void user_enter_valid_username_and_password() {
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("nirajanrijal8@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@123");
    }

    @And("user click the login bottom")
    public void user_click_the_login_bottom() {
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed());
    }

    @Given("user enter invalid username {string} or password {string}")
    public void user_enter_invalid_username_or_password(String username, String password) {
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
    }

    @Then("user is not able to successfully logged in")
    public void user_is_not_able_to_successfully_logged_in() {
        System.out.println("Wrong username or password");
    }



}


