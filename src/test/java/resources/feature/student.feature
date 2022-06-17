Feature: Testing different request on the virgingames application

  @SMOKE
  Scenario: Check if the virgingames application can be accessed by users
    When User sends a GET request to list endpoint
    Then User must get back a valid status code 200



