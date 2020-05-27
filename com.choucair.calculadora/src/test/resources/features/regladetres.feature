@Regression
Feature: Calculadora de calorías
  El usuario podra calcular las calorías que debe consumir diariamente

  @CasoExitosoRdt
  Scenario: Calculo exitoso de regla de tres
    Given que carolina necesita saber el resultado de una regla de tres
    When ella ingrese los números necesarios
    |Dividendo|Divisor|
    |40     |4     |
    Then ella tendra resultado