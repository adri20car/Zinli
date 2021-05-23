    # language: en
    @PROFILE @ANDROID

      Feature: Ver perfil como usuario quiero ver mis datos de perfil

    Scenario Outline:Ingreso a mi Perfil usuario
      Given  El usuario Avanza en los sliders de beneficiones informativos
      When El usuario ingresa con "<user>" y "<password>"
      And El usuario hace click en perfil
      Then Validar Nombre y apellido "<nombreYapellido>"
      Then Validar Porcentaje de perfil "<porcentaje>"
      Then Validar Boton MIS DATOS "<datos>"
      Then Validar Capacidad "<capacidad>"
      Then Validar Balance del mes "<mes>"
      Then Validar Saldo Actual "<saldo>"
      Then Validar Ingresos del mes "<ingreso>"
      Then Validar Medios de Recarga "<recarga>"
      Then Validar Seguridad "<seg>"
      Then Validar Terminos y condiciones "<TyC>"
      Then Validar Invitar a un amigo "<invitar>"
      Then Validar Versión "<version>"
      Then Validar CERRAR SESIÓN "<cerrar>"



      Examples:
        |user|password|nombreYapellido|porcentaje|datos|capacidad|mes|saldo|ingreso|recarga|seg|TyC|invitar|version|cerrar
        |biiptest01@mailinator.com|Abc1234!|Denisse de los Rios|Porcentaje de perfil|MIS DATOS|La capacidad de tu billetera es de $1,000.0|Balance en Mayo|Saldo Actual|1,000.00|Medios de Recarga|Seguridad|Terminos y condicione|Invitar a un amigo|1.00 - Compilación 108|CERRAR SESIÓN|



