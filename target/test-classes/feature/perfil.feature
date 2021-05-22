# language: en
@PERFIL @ANDROID

  Caracteristica: Ver perfil
  como usuario
  quiero ver mis datos de perfil

Scenario Outline:Ingreso a mi Perfil usuario
      Given  El usuario Avanza en los sliders de beneficiones informativos
      When El usuario ingresa con <usuario> y <password>
  Examples
  |user|password|
  |123|1223|



