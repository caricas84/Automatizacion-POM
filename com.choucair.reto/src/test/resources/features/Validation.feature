# language: es
@Regression
Característica: Verificar el diligenciamiento del formato de la pantalla “Block Validation”.
  Como usuario debo autenticarme y registrar un usuario a la plataforma Colorlib.

  @Autenticar
  Escenario: Autenticar usuario
    Dado que carolina requiere autenticarse
    Cuando ella ingresa usuario y contraseña en la plataforma
    Entonces ella verifica respuesta exitosa TOC

  @Registrar
  Escenario: Validar usuarioe
    Dado que carolina necesita validar un usuario
    Cuando  cuando lo ingresar a la plataforma "001"
    Entonces carolina verifica validacion exitosa o fallida