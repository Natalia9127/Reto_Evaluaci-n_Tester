# Autor: Natalia
@stories
Feature: Shopping Choucair
  As a user, I want to automate in screenplay the process shopping with the automation shopping of products
  @scenario1
  Scenario: Customer process shopping
    Given that natalia want to do automation at the product shopping
    | strEmail           | strFirstName | strLastName | strPassword| strCompany | strAddress1    | strAddress2     | strCity | strPostalCode | strAddInfo             | strHomePhone   | strMovilePhone | strAlias |
    | FJpw23m@gmail.com  | Natalia      | Velasquez   | Natalia27  | AT&T Store | 4006 Conroy Rd | 6421 Releigh St | Orlando | 32801         | Withdrawals at the door| +1 407-264-2813| +1 321-800-6193| My Shop  |
    When she search for the produduct in the shop, add to cart and proceed to checkout.
    | strProduct | strComment                     |
    |  Blouse    | Please be punctual in delivery |
    Then she product shopping
    | strOrder        |
    | ORDER HISTORY |