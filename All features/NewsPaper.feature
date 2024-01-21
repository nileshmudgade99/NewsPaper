Feature: Test Facebook Application

  Scenario Outline: Test Register page Functionality
    Given user is on register page and user open a "chrome" browser
    
    When user enter "<firstname>", "<lastname>", "<username>" and "<password">

    Examples: 
      | firstname | lastname | username         | password   |
      | nilesh    | mudgade  | nilesh@gmail.com | nilesh@123 |
      | Smita     | patil    | smita@gmail.com  | smita@123  |
      | Amruta    | Thakre   | amruta@gmail.com | amruta@123 |
