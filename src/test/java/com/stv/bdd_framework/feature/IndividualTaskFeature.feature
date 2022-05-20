Feature: Individual Task

  Scenario Outline: Individual Task
    Given User is on Wishlist page
    When Push Start shopping button
    And Push Your account link
    And Type "<email>" address for customer
    And Click Continue button
    Then Check New customer page is opened
    Examples:
      | email                    |
      | tihanovich2.20@gmail.com |
      | newEmail@yandex.ru       |
