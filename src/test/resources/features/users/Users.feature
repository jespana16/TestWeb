#language: es
Característica: Ingreso de nuevos usuarios

  Esquema del escenario: Como usuario desconocido se desea registrar en el portal de new experience
    Dado que "un usuario desconocido" se encuentra en el portal new experience
    Cuando se valida que el correo <correo> no se encuentra registrado
    Y se ingresan los  datos personales para el registro
      |titulo|nombre|apellido|correo|contrasena|diaNacimiento|mesNacimiento|annoNacimiento|direccion|ciudad|estado|codigoPostal|pais|telefono|
      |<titulo>|<nombre>|<apellido>|<correo>|<contrasena>|<diaNacimiento>|<mesNacimiento>|<annoNacimiento>|<direccion>|<ciudad>|<estado>|<codigoPostal>|<pais>|<telefono>|
    Entonces el usuario puede observar su cuenta creada con su nombre <nombre> y apellido <apellido>
    Ejemplos:
      |titulo |nombre |apellido |correo               |contrasena |diaNacimiento|mesNacimiento|annoNacimiento |direccion  |ciudad |estado |codigoPostal |pais         |telefono |
      |Mr     |Hola   |Mundo    |HolaMundo13@gmail.com|12345      |12           |12           |2009           |Kr 69# 69-69|Cali   |Alaska |12345        |United States|12345    |