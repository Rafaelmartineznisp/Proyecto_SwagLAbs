#language:es
#autor: Rafael Martinez N
@Historia
Característica: como usuario quiero ingresar a la plataforma web swaglab para realizar una compra

  Antecedentes:
    Dado que el usuario ingresa a la plataforma web swaglab

  @Login
  Esquema del escenario: Exitoso
    Cuando digita las credenciales de acceso
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Entonces verifica el ingreso
      | logueado   |
      | <logueado> |

    Ejemplos:
      | usuario       | contrasenna  | logueado |
      | standard_user | secret_sauce | PRODUCTS |

  @LoginBloqueado
  Esquema del escenario: Bloqueado
    Cuando digita las credenciales de acceso
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Entonces verifica el no ingreso
      | logueado   |
      | <logueado> |

    Ejemplos:
      | usuario         | contrasenna  | logueado                                            |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out. |

  @LoginProblema
  Esquema del escenario: Problema
    Cuando digita las credenciales de acceso
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Entonces verifica el ingreso con problemas
      | logueado   |
      | <logueado> |

    Ejemplos:
      | usuario      | contrasenna  | logueado |
      | problem_user | secret_sauce | PRODUCTS |

  @Loginsinproblema
  Esquema del escenario: satisfactorio
    Cuando digita las credenciales de acceso
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Entonces verifica el ingreso sin problemas
      | logueado   |
      | <logueado> |

    Ejemplos:
      | usuario                 | contrasenna  | logueado |
      | performance_glitch_user | secret_sauce | PRODUCTS |