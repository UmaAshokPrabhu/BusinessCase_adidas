
Feature: To verify whether user is able to complete  delivery process sucessfully

  Background: User is in running Product item page
    Given Open  "https://www.adidas.co.uk" url in the browser
    And user click UK Location button
    And user click Accept Tracking button
    When Enter "running" in the search textbox
    And click First product item
    And User click close button
    When User select any size
    And User click "Add to Bag" button
    And Click "View Bag" button
    And Click on checkout button
    
    
    Scenario:Verify correct collection point is selected
    When user click From a collection point
    And user type "London" in the location textbox
    And user click "Search for Collection Points" button
    And From list user pick any collection point
    Then correct collection point is selected