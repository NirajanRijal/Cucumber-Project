package org.example.stepdefinations;

import io.cucumber.java.en.*;
import org.example.utils.GlobalVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddCart{

    @Given("user is logged in to the application")
    public void user_is_logged_in_to_the_application() {
        GlobalVariables.driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        GlobalVariables.driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("nirajanrijal8@gmail.com");
        GlobalVariables.driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@123");
    }
    @When("click on laptops and notebook")
    public void click_on_laptops_and_notebook() {
        Actions actions = new Actions(GlobalVariables.driver);
        WebElement lapandnote= GlobalVariables.driver.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Laptops & Notebooks']"));
        actions.moveToElement(lapandnote).build().perform();
        WebElement alllap= GlobalVariables.driver.findElement(By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']"));
        actions.moveToElement(alllap).click().build().perform();
    }
    @When("user add hp laptop on cart")
    public void user_add_hp_laptop_on_cart() {
        GlobalVariables.driver.findElement(By.xpath("//img[@title='HP LP3065']")).click();
        GlobalVariables.driver.findElement(By.xpath("//button[@id='button-cart']")).click();
    }
    @Then("product is added in cart")
    public void product_is_added_in_cart() {
        System.out.println("Product added to cart");
    }








}

