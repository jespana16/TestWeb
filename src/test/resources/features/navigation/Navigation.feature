#language: es
Característica: Navegacion de los usuarios en las categorias del portal new experience

  Esquema del escenario: Como usuario desconocido se desea navegar en las categorias del portal new experience
    Dado que "un usuario desconocido" se encuentra en el portal new experience
    Cuando ingresa a la categoria <categoria>
    Entonces puede visualizar los productos de dicha categoria
    Ejemplos:
      |categoria|
      |women    |
      |dresses  |
      |T-Shirts |
