Feature: Login to the application

  Scenario: Verify that user can login jira with valid email and correct password
    Given the user is on the login page
    When the user enters valid username and password
    Then the "Atlassian Homepage" page is displayed