#Comentarios

Feature: Como usuario quiero realizar una búsqueda en google

  Scenario: Realizar búsqueda en google

    Given que el actor abra el navegador y quiera acceder a google
    When escriba youtube en la barra de búscqueda
    Then verificamos que el primer resultado sea youtube