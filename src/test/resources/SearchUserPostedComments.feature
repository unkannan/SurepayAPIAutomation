Feature: user posted comments validation
  This feature includes tests that test the user posted comments RESTFul services

  @Functional
Scenario: Correct search results are shown for posted comments of the user id provided
    Given the posted comments API is available
    When I search for an user id with "1" comments details  
    Then the requests response comments has all email in correct format
    
    
  @negative
  Scenario: Correct Error message is shown searching posted comments of the invalid user provided
    Given the posted comments API is available
    When I search for an user id with "xyz" comments details
    Then the response status code should be "404"

  @smokeTest
  Scenario: Correct status code is shown while searching the psoted comments for valid user
    Given the posted comments API is available
    When I search for an user id with "1" comments details
    Then the response status code should be "200" 