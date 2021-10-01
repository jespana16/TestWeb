#language: es
Característica: Ingreso de nuevos usuarios

  Escenario: Como usuario desconocido se desea registrar en el portal de new experience
    Dado que "un usuario desconocido" se encuentra en el portal new experience
    Cuando se valida que el correo <correo> no se encuentra registrado
    Y se ingresan los  datos personales para el registro
      |titulo|nombre|apellido|alias|correo|contrasena|diaNacimiento|mesNacimiento|annoNacimiento|Empresa|Ciudad|Estado|CodigoPostal|Pais|telefono|
      |<titulo>|<nombre>|<apellido>|<alias>|<correo>|<contrasena>|<diaNacimiento>|<mesNacimiento>|<annoNacimiento>|<Empresa>|<Ciudad>|<Estado>|<CodigoPostal>|<Pais>|<telefono>|
    Entonces el usuario puede observar su cuenta creada con su nombre <nombre> y apellido <apellido>
    Ejemplo:
      |titulo |nombre |apellido |alias      |correo               |contrasena |diaNacimiento|mesNacimiento|annoNacimiento |Empresa  |Ciudad |Estado |CodigoPostal |Pais         |telefono |
      |Mr     |Hola   |Mundo    |HolaMundo11|HolaMundo11@gmail.com|12345      |12           |12           |2009           |HolaMundo|Cali   |Alaska |12345        |United States|12345    |