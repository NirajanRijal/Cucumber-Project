Feature: user login


  Scenario: user is able to login with valid id

    Given user enter valid username and password
    And user click the login bottom
    Then user is successfully logged in


  Scenario Outline: user is not able to login with invalid id

    Given user enter invalid username "<username>" or password "<password>"
    And user click the login bottom
    Then user is not able to successfully logged in

    Examples:
      | username               |password |
      | nirajanrijal8@gmail.com|tes@1234|
      | nirajanrijal8@gmail.com|tes@678|



