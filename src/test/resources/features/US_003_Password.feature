Feature: Luma Register Password Verification

  Background: Common steps
    Given visit the Create New Customer Account page

  Scenario:TC_001 Password should be a required data.
    And fill the form with valid First Name, Last Name, Email and Confirm Password test data except password
    And click on the Create an Account button
    Then verify the warning message under the Password inputbox
    And close driver

  Scenario:TC_002 Confirm Password should be a required data.
    And fill the form with valid First Name, Last Name, Email and Password test data except confirm password
    And click on the Create an Account button
    Then verify the warning message under the Confirm Password inputbox
    And close driver

  Scenario:TC_003 Password should not be eccepted with just a number
    And type one number in Password inputbox
    And click on the Create an Account button
    Then verify the minimum length warning message under the Password inputbox
    And close driver

  Scenario:TC_004 Minimum length of this field must be equal or greater than 8 symbols
    And type 7 numbers in Password inputbox
    And click on the Create an Account button
    Then verify the minimum length warning message under the Password inputbox
    And close driver

  Scenario:TC_005 There should't be any space before the password.
    And click the Password inputbox and press 2 times the space key and type 7 more numbers
    Then verify the minimum length warning message under the Password inputbox
    And close driver

  Scenario:TC_006 trailing spaces will be ignored. There should't be any space after the password.
    And click the Password inputbox and type 7 numbers and press 2 times the space key
    Then verify the minimum length warning message under the Password inputbox
    And close driver

  Scenario:TC_007 There can be space character in the password.
    And type one number then give a space then type 6 more numbers in Password inputbox
    Then verify the minimum of different classes of character warning message under the Password inputbox
    And close driver

  Scenario:TC_008 When there are just numbers or letters or specials charachters in the password, the warning message should appear under the password inputbox.
    And type eight numbers in Password inputbox
    Then verify the minimum of different classes of character warning message under the Password inputbox
    And clear the password inputbox
    And type eight letter in lower case in Password inputbox
    Then verify the minimum of different classes of character warning message under the Password inputbox
    And clear the password inputbox
    And type eight letter in upper case in Password inputbox
    Then verify the minimum of different classes of character warning message under the Password inputbox
    And clear the password inputbox
    And type eight special characters in Password inputbox
    Then verify the minimum of different classes of character warning message under the Password inputbox
    And close driver

  Scenario:TC_009 When there are two different classes of character in the password, the warning message should appear under the password inputbox.
    And And type one letter in upper case and 7 letters in lower case in Password inputbox
    Then verify the minimum of different classes of character warning message under the Password inputbox
    And clear the password inputbox
    And type one number and 7 letters in lower case in Password inputbox
    Then verify the minimum of different classes of character warning message under the Password inputbox
    And clear the password inputbox
    And type one number and 7 letters in upper case in Password inputbox
    Then verify the minimum of different classes of character warning message under the Password inputbox
    And clear the password inputbox
    And type one letter in lower case and 7 special characters in Password inputbox
    Then verify the minimum of different classes of character warning message under the Password inputbox
    And clear the password inputbox
    And type one special character letter and 7 numbers in Password inputbox
    Then verify the minimum of different classes of character warning message under the Password inputbox
    And clear the password inputbox
    And type one letter in upper case and 7 special characters in Password inputbox
    Then verify the minimum of different classes of character warning message under the Password inputbox
    And close driver

  Scenario:TC_010 When there are three different classes of character in the password, the warning message should not appear under the password inputbox.
    And type one letter in upper case, one letter in lower and 6 number in Password inputbox
    Then verify that the password is confirmed
    And close driver

  Scenario:TC_011 When there are numbers, special characters and letters in lower case in the password, the warning message should not appear under the password inputbox.
    And type one special character, one letter in lower case and 6 number in Password inputbox
    Then verify that the password is confirmed
    And close driver

  Scenario:TC_012 When there are special characters, letters in upper case and letters in lower case in the password, the warning message should not appear under the password inputbox.
    And type one letter in upper case, one letter in lower case and 6 special characters in Password inputbox
    Then verify that the password is confirmed
    And close driver

  Scenario:TC_013 When there are special characters, letters in upper case and numbers in the password, the warning message should not appear under the password inputbox.
    And type one letter in upper case, one special character and 6 number in Password inputbox
    Then verify that the password is confirmed
    And close driver

  Scenario:TC_014 When there are four different classes of character in the password, the warning message should not appear under the password inputbox.
    And type one special character, one letter in lower case, one letter in upper case and 5 number in Password inputbox
    Then verify that the password is confirmed
    And close driver

  Scenario:TC_015 When Password and Confirm Password are not same, then the warning message should appear
    And type a valid password in Password inputbox and a different password in Confirm Password inputbox
    Then verify the warning message for same value under the Confirm Password inputbox
    And close driver

  Scenario:TC_016 Password should be medium When there are two different numbers, lower case letters, upper case letters and special characters
    And type the password "ABha13?=" for medium strength in Password inputbox
    Then verify that the password strength is medium
    And close driver

  Scenario:TC_017 When there are two numbers, 6 lower case letters, one upper case letters , Password should be strong
    And type the password "Abbbbbb44" for strong strength in Password inputbox
    Then verify that the password strength is strong
    And close driver

  Scenario:TC_018 When there are three numbers,  lower case letters,  upper case letters and special characters, Password should be very strong
    And type the password "AAAbbb222???" for very strong strength in Password inputbox
    Then verify that the password strength is very strong
    And close driver


Scenario Outline: Password strength
  And type the "<password>" in Password inputbox
  Then verify that the password strength is "<strength>"
  Examples:
    | password     | strength                         |
    | ABha13?=     | Password Strength: Medium        |
    | ABha13?=     | Password Strength: Medium        |
    | Abbbbbb44    | Password Strength: Strong        |
    | AAAbbb222??? | Password Strength: Very Strong   |


