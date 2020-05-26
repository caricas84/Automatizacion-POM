@Regression
  Feature: Calculadora de calorías
    El usuario podra calcular las calorías que debe consumir diariamente

  @CasoExitoso
  Scenario: Calculo exitoso de formulario calculadora de calorias
    Given que carolina necesita saber las calorías que debe consumir
    When ella ingrese los valores necesarios
    |Peso|Nivel de actividad|
    |75  |Intesa            |
    Then ella obtendra resultado esperado
