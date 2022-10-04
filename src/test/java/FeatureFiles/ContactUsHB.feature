Feature: Contact Us2 Functionality

  Background: Start Login
    Given Navigate to FidenSolution

  Scenario: Contact Us test_1
    And Click on the button elements
      | contactUsButton |
    And Find the boxes and send the string
      | inputName    | hbdeneme1          |
      | inputEmail   | deneme1@gmail.com  |
      | inputSubject | first test         |
      | inputMessage | This is first test |
    And Click on the button elements
      | SendButton |
    Then Successful message
      | succesCheck | succes |

  Scenario: Contact Us test_2

    And Click on the button elements
      | contactUsButton |
    And Find the boxes and send the string
      | inputName    | hbdeneme2           |
      | inputEmail   | deneme2@gmail.com   |
      | inputSubject | second test         |
      | inputMessage | This is second test |

      | inputName    | hbdeneme3           |
      | inputEmail   | deneme3@gmail.com   |
      | inputSubject | third test         |
      | inputMessage | This is third test |
    And Click on the button elements
      | SendButton |
    Then Successful message
      | succesCheck | succes |