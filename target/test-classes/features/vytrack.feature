@wip
Feature:Login feature
  As I user, I should be able to login


  Scenario Outline:login with correct credentials
    Given user is on vytrack login page
    Then I login as a store manager "<username>" and "<password>"


Examples:
    |username      |password|
    |storemanager67|UserUser123|
    |storemanager87|UserUser123|
