Feature: Contact Us Functionality

  Background: Start Login
    Given Navigate to FidenSolution

  Scenario: Contact Us error test_1
    And Click on the button elements
      | contactUsButton |
    And Find the boxes and send the string
      | inputName    | Gandalf1        |
      | inputEmail   | Durin@gmail.com |
      | inputSubject | Gollum test     |
    And Click on the button elements
      | SendButton |
    Then Successful result check

  Scenario: Contact Us error test_2

    And Click on the button elements
      | contactUsButton |
    And Find the boxes and send the string
      | inputEmail   | Aurora@gmail.com |
      | inputSubject | Apollo test      |
      | inputMessage | This is the test |
    And Click on the button elements
      | SendButton |
    Then Successful result check

  Scenario: Contact Us error test_3
    And Click on the button elements
      | contactUsButton |
    And Find the boxes and send the string
      | inputName    | Gandalf1         |
      | inputEmail   | Durin@gmail.com  |
      | inputMessage | This is the test |
    And Click on the button elements
      | SendButton |
    Then Successful result check
