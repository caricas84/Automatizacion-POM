#Autor: Carolina Castaño González

@Regression
Feature: Purchase a Samsung TV at exito

@CaseSuccessful
Scenario: Purchase a TV
  Given That Carolina wants to buy a television
  When she enters the website of the success and selects the desired TV
  Then she makes the purchase and the TV is delivered at home