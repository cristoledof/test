Feature: Categoria Comics
  como usuario quiero leer chistes de tester para reirme y pasar un buen rato

  Scenario: Ingrese a la categoria Comics desde la pantalla home
    Given el usuario se encuentra en home
    When hace clico sobre boton comic
    Then  se debe redirigir a la pantalla comics


