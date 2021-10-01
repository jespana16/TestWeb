package automatizacion.tasks;

import automatizacion.constants.CommonsConstants;
import automatizacion.models.UserModel;
import automatizacion.ui.CommonsUI;
import automatizacion.ui.CreacionUsuarioUI;
import automatizacion.ui.InicioUI;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.ValueOf;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.assertj.core.internal.bytebuddy.implementation.bytecode.Throw;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistroUsuarioTask implements Task {
    UserModel userModel;

    public RegistroUsuarioTask(UserModel userModel){
        this.userModel = userModel;
    }

    public static Performable RegistroUsuario(UserModel userModel) {
        return instrumented(RegistroUsuarioTask.class, userModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int tiempoEsperaMax = actor.recall(CommonsConstants.TIEMPO_ESPERA_MAX);
        int tiempoEspera = actor.recall(CommonsConstants.TIEMPO_ESPERA);

        actor.attemptsTo(
                WaitUntil.the(CreacionUsuarioUI.TXT_NOMBRE_USUARIO, isVisible())
                        .forNoMoreThan(tiempoEsperaMax)
                        .seconds()
        );

        if(userModel.getTitulo().toUpperCase().contains("MR")){
            actor.attemptsTo(Click.on(CreacionUsuarioUI.CHK_GENERO_MR_USUARIO));
        }else if(userModel.getTitulo().toUpperCase().contains("MRS")){
            actor.attemptsTo(Click.on(CreacionUsuarioUI.CHK_GENERO_MRS_USUARIO));
        }else{
            new AssertionError("Titulo de usuario (" + userModel.getTitulo().toUpperCase() + ") no valido.");
        }

        actor.attemptsTo(
                Enter.theValue(userModel.getNombre()).into(CreacionUsuarioUI.TXT_NOMBRE_USUARIO)
                , Enter.theValue(userModel.getApellido()).into(CreacionUsuarioUI.TXT_APELLIDO_USUARIO)
                , Enter.theValue(userModel.getContrasena()).into(CreacionUsuarioUI.TXT_CONTRASENA_USUARIO)
                , Click.on(CreacionUsuarioUI.CMB_DIAS_CUMPLEANNOS_USUARIO)
                , SelectFromOptions.byValue(String.valueOf(userModel.getDiaNacimiento())).from(CreacionUsuarioUI.CMB_DIAS_CUMPLEANNOS_USUARIO)
                , Click.on(CreacionUsuarioUI.CMB_MES_CUMPLEANNOS_USUARIO)
                , SelectFromOptions.byValue(String.valueOf(userModel.getMesNacimiento())).from(CreacionUsuarioUI.CMB_MES_CUMPLEANNOS_USUARIO)
                , Click.on(CreacionUsuarioUI.CMB_ANNO_CUMPLEANNOS_USUARIO)
                , SelectFromOptions.byValue(String.valueOf(userModel.getAnnoNacimiento())).from(CreacionUsuarioUI.CMB_ANNO_CUMPLEANNOS_USUARIO)
                , Enter.theValue(userModel.getDireccion()).into(CreacionUsuarioUI.TXT_DIRECCION_USUARIO)
                , Enter.theValue(userModel.getCiudad()).into(CreacionUsuarioUI.TXT_CIUDAD_USUARIO)
                , Click.on(CreacionUsuarioUI.CMB_ESTADO_USUARIO)
                , SelectFromOptions.byVisibleText(userModel.getEstado()).from(CreacionUsuarioUI.CMB_ESTADO_USUARIO)
                , Enter.theValue(String.valueOf(userModel.getCodigoPostal())).into(CreacionUsuarioUI.TXT_CODIGO_POSTAL_USUARIO)
                , Click.on(CreacionUsuarioUI.CMB_PAIS_USUARIO)
                , SelectFromOptions.byVisibleText(userModel.getPais()).from(CreacionUsuarioUI.CMB_PAIS_USUARIO)
                , Enter.theValue(String.valueOf(userModel.getTelefono())).into(CreacionUsuarioUI.TXT_TELEFONO_POSTAL_USUARIO)
        );
        Serenity.takeScreenshot();
        actor.attemptsTo(
                Click.on(CreacionUsuarioUI.BTN_REGISTRAR_USUARIO)
        );

        BrowseTheWeb.as(actor).waitFor(tiempoEspera).second();
        actor.attemptsTo(
                WaitUntil.the(InicioUI.TXT_USUARIO_LOGEADO, isVisible())
                        .forNoMoreThan(tiempoEsperaMax)
                        .seconds()
        );
    }
}