#language: es
Característica: Navegacion de los usuarios en las categorias del portal new experience

  Esquema del escenario: Como usuario desconocido se desea navegar en las categorias del portal new experience
    Dado que "un usuario desconocido" se encuentra en el portal new experience
    Cuando se ingresa a la categoria <categoria>
    Entonces se puede visualizar las subcategorias de la categoria <categoria>
    Y los productos de la categoria <categoria>
    Ejemplos:
      |categoria|
      |Women    |
      |Dresses  |
      |T-shirts |
