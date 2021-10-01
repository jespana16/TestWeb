#language: es
Característica: Verificacion de los detalles de un producto en el portal new experience

  Esquema del escenario: Como usuario desconocido se desea validar los detalles de un producto al portal de new experience
    Dado que "un usuario desconocido" se encuentra en el portal new experience
    Cuando se observan los detalle del producto <producto> de la categoria <categoria>
    Entonces se puede observar su descripcion, precio, color, disponibilidad, imagen de referencia
    Y otros productos disponibles para la categoria <categoria>
    Ejemplos:
      | categoria | producto                    |
      | Women     | Faded Short Sleeve T-shirts |