
Feature: Luma Create New Customer Account

  Background: Common steps
    Given visit the Create New Customer Account page

  @TC_001
  Scenario:TC_001 The user should be able to create a new customer account successfully
    Given Fill the form with valid new customer data
    And check the Sign Up for Newsletter checkbox
    When click on the Create an Account button
    Then Then Verify that system navigates to "My Account" page and the message is visible on the page.
    And close driver

  Scenario:TC_002 First name should be a required data.
    And fill the form with valid Last Name, Email, Password and Confirm Password test data except first name.
    And check the Sign Up for Newsletter checkbox
    When click on the Create an Account button
    Then verify that there is the warning message under the First Name inputbox
    And close driver

  Scenario:TC_003 Last name should be a required data.
    And check the Sign Up for Newsletter checkbox
    And fill the form with valid First Name, Email, Password and Confirm Password test data except last name.
    When click on the Create an Account button
    Then verify the warning message under the Last Name inputbox
    And close driver

  Scenario:TC_004 When "Sign Up for Newsletter" checkbox is checked, the user should be subscribed the newsletters.
    When Fill the form with valid new customer data
    And check the Sign Up for Newsletter checkbox
    And click on the Create an Account button
    Then verify that "You are subscribed to "General Subscription"." message is visible under the Newsletter section.
    And close driver

    Scenario:TC_005 When "Sign Up for Newsletter" checkbox is not checked, the user should not be subscribed the newsletters.
      When Fill the form with valid new customer data and do not check the "Sign Up for Newsletter" checkbox
      And click on the Create an Account button
      Then verify that "You aren't subscribed to our newsletter." message is visible under the Newsletter section.
      And close driver











