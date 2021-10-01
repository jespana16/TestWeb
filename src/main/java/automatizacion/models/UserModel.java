package automatizacion.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    String titulo;
    String nombre;
    String apellido;
    String alias;
    String correo;
    String contrasena;
    int diaNacimiento;
    int mesNacimiento;
    int annoNacimiento;
    String Empresa;
    String Ciudad;
    String Estado;
    int CodigoPostal;
    String Pais;
    String telefono;
}
