Feature: user posted comments validation
  This feature includes tests that test the store order RESTFul services

  @Functional
Scenario: Correct error message is provided when searching for an order that does not exist
    Given the posted comments API is available
    When I search for an user id with '1' comments details  
    Then the requests response comments has all email in correct format
    
@smokeTest  
Scenario: Correct error message is provided when searching for an order that does not exist
    Given the posted comments API is available
    When I search for an user id with '1' comments details    