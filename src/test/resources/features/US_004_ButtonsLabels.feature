Feature: Luma Buttons Labels Verification

  Background: Common steps
    Given visit the Create New Customer Account page

  Scenario:TC_001 Verify the visible texts in the body of the page
    Then verify the Create New Customer Account header is visible
    Then verify Personal Information section name is visible
    Then verify the First Name text is visible on the First Name inputbox
    Then verify the Last Name text is visible on the Last Name inputbox
    Then verify Sign-in Information section name is visible
    Then verify Email text is visible on the email inputbox
    Then verify the Password text is visible on the Password inputbox
    Then verify the Confirm Password text is visible on the Confirm Password inputbox
    Then verify the Create an Account text is clickable

  Scenario:TC_002 Verify the labels, visibilities and clickabilities of the web elements in the header of the page
    Then verify the visibility of the LUMA icon
    Then verify the visibility and label of the Whats's New button
    Then verify the visibility and label of the Women button
    Then verify the visibility and label of the Men button
    Then verify the visibility and label of the Gear button
    Then verify the visibility and label of the Training button
    Then verify the visibility and label of the Sale button
    Then verify the visibility of the the shopping cart icon button
    Then verify the visibility of the Default welcome msg! text
    Then verify the visibility and label of the Sign In button
    Then verify the visibility and label of the Create an Account button

  Scenario:TC_003 Verify the labels in the footer of the page
    And scroll pagedown
    Then verify the visibility of the About us button
    Then verify the visibility of the Customer Service button
    Then verify the visibility of the Search Terms button
    Then verify the visibility of the Privacy and Cookie Policy button
    Then verify the visibility  of the Advanced Search button
    Then verify the visibility of the Orders and Returns button
    Then verify the visibility of the Contact Us button
    Then verify the visibility of the Subscribe Us button
