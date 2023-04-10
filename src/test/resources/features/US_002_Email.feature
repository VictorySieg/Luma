Feature: Luma Register Email Verification

  Background: Common steps
    Given visit the Create New Customer Account page

  Scenario:TC_001  Email should be a required data.
    And fill the form with valid First Name, Last Name, Password and Confirm Password test date except email
    When click on the Create an Account button
    Then verify that the email required and the warning message under the Email inputbox
    And close driver

  Scenario:TC_002 There should be "@" and "." signs in Email
    And enter an email that has a word without "@" and "." signs in the Email inputbox
    When click on the Create an Account button
    Then verify the warning message under the Email inputbox
    And close driver

  Scenario:TC_003 When the email contains  "." sign but not the  "@" sign, the warning message should appear.
    And type an email that has a word with "." but without "@" sign in the Email inputbox
    When click on the Create an Account button
    Then verify the warning message under the Email inputbox
    And close driver

  Scenario:TC_004 When the email contains  "@" sign but not the  "." sign, the warning message should appear.
    And type an email that a word with "@" extension in the Email inputbox
    When click on the Create an Account button
    Then verify the warning message under the Email inputbox
    And close driver

  Scenario:TC_005 Email should be accepted when there is a letter before the "@" sign in the email
    And type an email that has one letter before the "@" sign in the Email inputbox
    When click on the Create an Account button
    Then verify that the warning message doesnt appear under the "Email" inputbox
    And close driver

  Scenario:TC_006 Email should be accepted when there is a number before the "@" sign in the email
    And enter  an email that has a number before the "@" sign in the Email inputbox
    When click on the Create an Account button
    Then verify that the warning message doesnt appear under the "Email" inputbox
    And close driver

  Scenario:TC_007 Email should not be accepted when there is nothing before "@" sign
    And type an email that has nothing before the "@" sign in the Email inputbox
    When click on the Create an Account button
    Then verify the warning message under the Email inputbox
    And close driver

  Scenario:TC_008 Email should be accepted when there is a special character before the "@" sign in the email
    And type an email that has a special character before the "@" sign in the Email inputbox
    When click on the Create an Account button
    Then verify that the warning message doesnt appear under the "Email" inputbox
    And close driver

  Scenario:TC_009 Email should be accepted when there is a letter between "@" and "." sign
    And type an email that has a letter between the "@" and the "." sign in the Email inputbox
    When click on the Create an Account button
    Then verify that the warning message doesnt appear under the "Email" inputbox
    And close driver

  Scenario:TC_010 Email should be accepted when there is a numberbetween "@" and "." sign
    And type an email that has a number between the "@" and the "." sign in the Email inputbox
    When click on the Create an Account button
    Then verify that the warning message doesnt appear under the "Email" inputbox
    And close driver

  Scenario:TC_011 Email should not be accepted when there is nothing between "@" and "." sign
    And type an email that has nothing between the "@" and the "." sign in the Email inputbox
    When click on the Create an Account button
    Then verify the warning message under the Email inputbox
    And close driver

  Scenario:TC_012 There should be at least one letter or number between the "@" sign and the "." sign in the email
    And type an email that has a special character between the "@" and the "." sign in the Email inputbox
    When click on the Create an Account button
    Then verify the warning message under the Email inputbox
    And close driver

  Scenario:TC_013 When there is just one letter after the "." sign in the email, the warning message should appear.
    And type an email that has one letter after the "." sign in the Email inputbox
    When click on the Create an Account button
    Then verify the warning message under the Email inputbox
    And close driver

  Scenario:TC_014 There should be at least two letters after the "." sign in the email
    And type an email that has two letter after the "." sign in the Email inputbox
    When click on the Create an Account button
    Then verify that the warning message doesnt appear under the "Email" inputbox
    And close driver

  Scenario:TC_015 There should not be number after the "." sign in the email
    And type an email that has numbers after the "." sign in the Email inputbox
    When click on the Create an Account button
    Then verify the warning message under the Email inputbox
    And close driver

  Scenario:TC_016 There should not be special character after the "." sign in the email
    And type an email that has special character after the "." sign in the Email inputbox
    When click on the Create an Account button
    Then verify the warning message under the Email inputbox
    And close driver

  Scenario:TC_017 user should not be able to register twice with the same email
    And fill the form with valid datas and register
    And log out of account
    When click on Create an Account button
    And fill the form with valid datas and same email
    And click on the Create an Account button
    Then verify the same email warning message under the "Email" inputbox
    And close driver