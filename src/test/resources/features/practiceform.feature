Feature: Practice Form
  I as a user of Tools QA app
  I want to fill the Practice Form
  To use the elements of the app

  Scenario: Fill the Practice Form
    Given the user is in the student registration form
    When the user ty to fill the form with her data
      | firstName | lastName | email   | gender | mobile     |dateOfBirth|
      | Andrea    | Arias    | a@a.com | Female | 3017731159 |01 May 1985|
    Then check the wellcome message

