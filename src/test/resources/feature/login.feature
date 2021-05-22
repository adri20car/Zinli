# language: es

    @ANDROID @IOS
    Característica: Login de usuarios a la app Zinli
    Como usuario
    Quiero iniciar sesión en la aplicación móvil.

    Background:
    Dado que somos un usuario
    Y entramos a la aplicación

    Escenario: inicio sesión exitoso
        Cuando ingreso a la app con el "<user>" y "<pass>"
        Entonces el inicio de sesión es exitoso

    Examples:
    |user                     |pass|
    |biiptest01@mailinator.com|Abc1234!|

        Escenario: inicie sesión fallido
            Cuando ingreso a la app con el "<user>" y "<pass>" incorrectos
            Entonces el inicio de sesión no es exitoso
        Examples:
        |user                  |pass|
        |adriana@mailinator.com|Abc1234!|
