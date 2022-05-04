#Autor: Elkin Salcedo

@Historia
Feature:Verificar el optimo funcionamiento del modulo Ventas de OpenCart

  @FiltroPorIdPedidos
  Scenario Outline: Verificar exitosamente la busqueda por id de pedidos
    Given dado que Elkin ingresa a la plataforma opencart
    And digita las credenciales de acceso e ingresa
      | usuario   | clave   |
      | <usuario> | <clave> |
    When busca la seccion de pedidos en el modulo de ventas

    And verifica que aparece la lista de pedidos
    And realiza el filtro por id para buscar una orden
      | idpedidos   |
      | <idpedidos> |
    And visualiza a detalle el pedido seleccionado
    Then verifica que la informacion del pedido esta almacenada correctamente
      | info   |
      | <info> |

    Examples:
      | usuario | clave | idpedidos | info          |
      | DEMO    | demo  | 16643     | Order Details |


  @FiltroPorIdDevoluciones
  Scenario Outline: Verificar exitosamente la busqueda por id de las devoluciones
    Given dado que Elkin ingresa a la plataforma opencart
    And digita las credenciales de acceso e ingresa
      | usuario   | clave   |
      | <usuario> | <clave> |
    When busca la seccion de devoluciones en el modulo de ventas
      | salesOption   |
      | <salesOption> |
    And verifica que aparece la lista de devoluciones
    And realiza el filtro por id para buscar una devolucion
      | idDevolucion   |
      | <idDevolucion> |
    And visualiza a detalle la devolucion seleccionada
    Then verifica que la informacion de la devolucion esta almacenada correctamente
    Examples:
      | usuario | clave | idDevolucion | salesOption |
      | DEMO    | demo  | 38497        | Returns     |

  @AgregarValeDeRegaloFallido
  Scenario Outline: Verificar la opcion de agregar vale de regalo no exitoso
    Given dado que Elkin ingresa a la plataforma opencart
    And digita las credenciales de acceso e ingresa
      | usuario   | clave   |
      | <usuario> | <clave> |
    When busca la seccion de vales de regalo en el modulo de ventas
    And verifica que esta en la seccion de vales de regalo
    And selecciona la opcion agregar nuevo
    And resgistra los datos del formulario vales de regalo
      | fromCode   | fromName   | fromEmail   | toName   | toEmail   | monto   |
      | <fromCode> | <fromName> | <fromEmail> | <toName> | <toEmail> | <monto> |
    Then Entonces valida creacion de vale fallido
    Examples:
      | usuario | clave | fromCode | fromName | fromEmail   | toName | toEmail      | monto |
      | DEMO    | demo  | 1234     | Elkin    | ekn@hot.com | Sara   | sary@hot.com | 100   |
