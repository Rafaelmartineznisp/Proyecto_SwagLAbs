#language:es
#autor: Rafael Martinez N
@Historia2
Característica: como usuario quiero comprar articulos  en la plataforma web swaglab

  @Login
  Esquema del escenario: Exitoso
    Dado que el usuario ingresa a la plataforma web swaglab
    Cuando digita las credenciales de acceso
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Y selecciona los productos a adquirir
    Y llena el formulario de compra
      |nombre|apellido|codigopostal|
      |<nombre>|<apellido>|<codigopostal>|
    Entonces verifica la comprar realizada
      | verificarcompra  |
      | <verificarcompra> |
      Y cerrar sesion
      Ejemplos:
      | usuario       | contrasenna  |nombre|apellido|codigopostal| verificarcompra |
      | standard_user | secret_sauce |Rafael |martinez|242424|THANK YOU FOR YOUR ORDER |