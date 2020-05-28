Feature: Calcular IMC

  @ImcExitoso

Scenario Outline: Calcular imc
Given carolina se encuentra en la pagina para calcular IMC
    When se ingresa la <altura>, un <peso> y sexo
    Then se obtiene <resultado> y se guarda la <evidencia>

    Examples:

      |altura|peso|sexo|resultado|evidencia|
      | 172  | 73 | "mujer" | "Peso normal" | "Imc1"|


