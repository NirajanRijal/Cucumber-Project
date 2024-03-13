
Feature: Add product to shopping cart


  Background:
    Given user is logged in to the application

    @cart
    Scenario: user is able to add product in shopping cart

      When click on laptops and notebook
      And user add hp laptop on cart
      Then product is added in cart



