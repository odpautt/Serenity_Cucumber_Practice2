@test
Feature: Formulario de Registro

  Yo como PO
  Quiero un formulario de registro
  Para que los cliente puedan registrarse para loguearse al portal

  @Scenario
  Scenario: como usuario nuevo quiero registrarme en el portal de compras
    Given el usuario se encuentra en la opcion Sign In
    When  el usuario ingresa un correo valido
    And   el usuario diligencia el formulario con los datos requeridos
      | nombre    | apellido     | contrasena          | direccion1     | ciudad     |estado         | codigoPostal   | telefono|
      | freddy    | guzman       | micontrasena12345   | Cra 1 1 11     | New York   | Washington    |   10001        | 3012121212|
    Then el sisteme deberia realizar el registro, dirigiendo al usuario a la pagina My Account
  @Otro
  Scenario: Otro usuario nuevo quiero registrarme en el portal de compras
    Given el usuario se encuentra en la opcion Sign In
    When  el usuario ingresa un correo valido
    And   el usuario diligencia el formulario con los datos requeridos
      | nombre    | apellido     | contrasena          | direccion1     | ciudad     |estado         | codigoPostal   | telefono|
      | freddy    | guzman       | micontrasena12345   | Cra 1 1 11     | New York   | Washington    |   10001        | 3012121212|
    Then el sisteme deberia realizar el registro, dirigiendo al usuario a la pagina My Account