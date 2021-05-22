# language: es
@PERFIL @ANDROID @IOS

  Caracteristica: Ver perfil
  como usuario
  quiero ver mis datos de perfil

  Background:
    Dado que somos un usuario
    Y entramos a la aplicación


Escenario:Ingreso a mi Perfil usuario
      Dado  ingreso a la app con el "<user>" y "<pass>"
      Y hago click en la imagen de perfil
      Entonces ingreso al perfil exitoso

Escenario: Ver opciones de mi Perfil
      Dado  ingreso a la app con el "<user>" y "<pass>"
      Y hago click en la imagen de perfil
      Entonces visualiza las opciones de su perfil
      Entonces se valida la redireccion al perfil del usuario
      Entonces se valida la opcion: "NOMBRE APELLIDO"
      Entonces se valida la opcion: "PERFIL AL X%"
      Entonces se valida la opcion: "MIS DATOS"
      Entonces se valida la opcion: "CAPACIDAD DE BILLETERA"
      Entonces se valida la opcion: "BALANCE DEL MES ACTUAL"
      Entonces se valida la opcion: "SALDO"
      Entonces se valida la opcion: "INGRESO ACTUALES"
      Entonces se valida la opcion: "MEDIOS DE RECARGA"
      Entonces se valida la opcion: "TERMINOS Y CONDICIONES"
      Entonces se valida la opcion: "INVITAR A UN AMIGO"
      Entonces se valida la opcion: "VERSION"
      Entonces se valida la opcion: "CERRAR SESION"

Examples:
|user                     |pass|
|biiptest01@mailinator.com|Abc1234!|