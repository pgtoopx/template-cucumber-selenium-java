Feature: Login MiPago

  Scenario Outline: Ingresar a APP MiPago
    Given Soy Usuario de la aplicacion MiPago
    When Salto el proceso de bienvenida
    And Ingreso mi rut <rut> y clave <clave>
    Then Hago Login en la aplicacion MiPago
    And  Hago Logout de la aplicacion

    Examples:
      | rut     | clave       |
      | "92131092"  | "Banco001"  |
