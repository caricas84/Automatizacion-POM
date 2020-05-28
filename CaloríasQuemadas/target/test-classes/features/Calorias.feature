Feature: Calcular calorias diarias quemadas

  @Calorias

Scenario Outline: Calcular calorias quemadas
Given se encuentra en la pagina de calcular calorias
    When se ingresa un <peso>, se escoge un nivel de actividad
    Then se obtienen las calorias <resultado>, se guarda la <evidencia>

    Examples:

      | peso | nivel | resultado | evidencia|
      | 75   | "Intensa"  | "2728 calorías"  | "Calorias1" |


