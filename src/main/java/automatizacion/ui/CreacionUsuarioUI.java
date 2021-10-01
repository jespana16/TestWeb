package automatizacion.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:home_page")
public class CreacionUsuarioUI extends PageObject {
    public static final Target TXT_CORREO_USUARIO =
            Target.the("Correo electronico")
                    .located(By.id("email_create"));

    public static final Target BTN_CREAR_CUENTA_USUARIO =
            Target.the("Botones crear cuenta")
                    .located(By.id("SubmitCreate"));

    public static final Target TXT_VALIDACION_CORREO_USUARIO =
            Target.the("Validacion correo")
                    .located(By.xpath("/html/body/div/div/div/div/div/div/div[1]/form/div/div[2]"));

    public static final Target CHK_GENERO_MR_USUARIO =
            Target.the("Genero MR")
                    .located(By.id("id_gender1"));

    public static final Target CHK_GENERO_MRS_USUARIO =
            Target.the("Genero MRS")
                    .located(By.id("id_gender2"));

    public static final Target TXT_NOMBRE_USUARIO =
            Target.the("Nombre del usuario")
                    .located(By.id("customer_firstname"));

    public static final Target TXT_APELLIDO_USUARIO =
            Target.the("Apellido del usuario")
                    .located(By.id("customer_lastname"));

    public static final Target TXT_CONTRASENA_USUARIO =
            Target.the("Contrasena del usuario")
                    .located(By.id("passwd"));

    public static final Target CMB_DIAS_CUMPLEANNOS_USUARIO =
            Target.the("Dias cumpleaños del usuario")
                    .located(By.id("days"));

    public static final Target CMB_MES_CUMPLEANNOS_USUARIO =
            Target.the("Mes cumpleaños del usuario")
                    .located(By.id("months"));

    public static final Target CMB_ANNO_CUMPLEANNOS_USUARIO =
            Target.the("Año cumpleaños del usuario")
                    .located(By.id("years"));

    public static final Target TXT_DIRECCION_USUARIO =
            Target.the("Direccion del usuario")
                    .located(By.id("address1"));

    public static final Target TXT_CIUDAD_USUARIO =
            Target.the("Ciudad del usuario")
                    .located(By.id("city"));

    public static final Target CMB_ESTADO_USUARIO =
            Target.the("Estado del usuario")
                    .located(By.id("id_state"));

    public static final Target TXT_CODIGO_POSTAL_USUARIO =
            Target.the("Codigo Postal del usuario")
                    .located(By.id("postcode"));

    public static final Target CMB_PAIS_USUARIO =
            Target.the("Pais del usuario")
                    .located(By.id("id_country"));

    public static final Target TXT_TELEFONO_POSTAL_USUARIO =
            Target.the("Telefono del usuario")
                    .located(By.id("phone_mobile"));

    public static final Target BTN_REGISTRAR_USUARIO =
            Target.the("Boton Registrar Usuario del usuario")
                    .located(By.id("submitAccount"));
}
