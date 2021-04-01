

Feature: To verify whether user is able to complete the checkout  process sucessfully

  Background: User selected running Product item
    Given Open  "https://www.adidas.co.uk" url in the browser
    And user click UK Location button
    And user click Accept Tracking button
    When Enter "running" in the search textbox
    And click First product item
    And User click close button

  Scenario: Verify Search for first "running" product item page
    Then Verify the correct product url "https://www.adidas.co.uk/"

  Scenario: Verify "Add to Cart" Process for running product page
    When User select any size
    And User click "Add to Bag" button
    And check the product is added successfully to the bag message "SUCCESSFULLY ADDED TO BAG!"
    And verify "1" item added to the bag
    And Click "View Bag" button
    Then Verify the Cart page title "YOUR BAG" is displayed
    And Click on checkout button
    Then verify you're on the delivery page by page url "https://www.adidas.co.uk/delivery"
    
