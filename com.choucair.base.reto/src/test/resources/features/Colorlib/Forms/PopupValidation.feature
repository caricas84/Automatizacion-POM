#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Verificar el diligenciamiento del formato de la pantalla “Block Validation”.
  Como usuario debo autenticarme y registrar un usuario a la plataforma Colorlib.

  @CasoExitoso
  Scenario: Autenticar usuario
    Given que carolina requiere autenticarse
    When ella ingresa usuario y contraseña en la plataforma
    Then ella verifica respuesta exitosa TOC
    Given que carolina necesita validar un usuario
    Then cuando lo ingresar a la plataforma "001"


