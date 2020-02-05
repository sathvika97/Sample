Feature: TestMeApp

  #Background:
  #Given TestMeApp logged into machine
  @Datadriven
  Scenario: Admin  login
    When admin provides "username" and "password"
    Then login is success
      | username | password    |
      | admin    | Password456 |

  Scenario: adding another catgeroy
    When admin adding new category as sports
