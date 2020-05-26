@Regression
Feature: Calculadora de calorías
  El usuario podra calcular las calorías que debe consumir diariamente

  @CasoExitosoRdt
  Scenario: Calculo exitoso de regla de tres
    Given que carolina necesita saber el resultado de una regla de tres
    When ella ingrese los números necesarios
    |Valor1|Valor3|
    |3     |4     |
    Then ella tendra resultado