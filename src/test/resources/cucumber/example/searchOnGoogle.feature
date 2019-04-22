Feature: Search on Google

  Scenario Outline: Search on google something
    Given i am on google search page
    When i search for "<word>"
    Then the tittle have to contain "<word>"

    Examples:
    |word|
    |apple|
    |orange|
    |pineapple|
