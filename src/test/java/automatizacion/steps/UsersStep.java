package automatizacion.steps;

import automatizacion.models.UserModel;
import automatizacion.questions.CantidadSubCategoriasQuestion;
import automatizacion.tasks.SeleccionarCategoriaTask;
import automatizacion.tasks.SeleccionarProductoTask;
import automatizacion.ui.InicioUI;
import automatizacion.ui.ProductoUI;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotEmpty;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class UsersStep {
    private InicioUI inicioUI;
    private String actor;

    @Cuando("^se valida que el correo (.*) no se encuentra registrado$")
    public void se_valida_que_el_correo_no_se_encuentra_registrado(String correo) {
        
    }

    @Cuando("se ingresan los  datos personales para el registro")
    public void se_ingresan_los__datos_personales_para_el_registro(UserModel userModel) {

    }

    @Entonces("^el usuario puede observar su cuenta creada con su nombre (.+) y apellido (.+)$")
    public void se_observan_los_detalle_del_producto(String nombre, String apellido) {

    }
}
