@Regression
Feature: Verificar el diligenciamiento del formato de la pantalla “Inline Validation”.
Como usuario debo autenticarme y registrar un usuario a la plataforma Colorlib.

  @CasoExitoso
  Scenario: Autenticar usuario
    Given Autentico en colorlib con usuario "demo" y clave "demo"
    And  Ingreso a la funcionalidad Forms Validation
    When Diligencio formulario Inline Validation
    |Required|E-mail|Password|Confirm Password|Date|Url|Minimum|Maximum|Min|Max|
    |Carolina|ccg@hotmail.com|123456|123456|02/09/2019|https://www.valor1.com|2468|135790|1020|1|
    Then verifico ingreso exitoso