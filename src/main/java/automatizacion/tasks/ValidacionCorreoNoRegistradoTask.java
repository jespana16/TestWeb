package automatizacion.tasks;

import automatizacion.constants.CommonsConstants;
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
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacionCorreoNoRegistradoTask implements Task {
    String correo;

    public ValidacionCorreoNoRegistradoTask(String correo){
        this.correo = correo;
    }

    public static Performable ValidacionCorreoNoRegistrado(String correo) {
        return instrumented(ValidacionCorreoNoRegistradoTask.class, correo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int tiempoEsperaMax = actor.recall(CommonsConstants.TIEMPO_ESPERA_MAX);
        int tiempoEspera = actor.recall(CommonsConstants.TIEMPO_ESPERA);

        actor.attemptsTo(
                WaitUntil.the(InicioUI.BTN_SIGN_IN, isVisible())
                        .forNoMoreThan(tiempoEsperaMax)
                        .seconds()
                , Click.on(InicioUI.BTN_SIGN_IN)
                , WaitUntil.the(CreacionUsuarioUI.TXT_CORREO_USUARIO, isVisible())
                        .forNoMoreThan(tiempoEsperaMax)
                        .seconds()
                , Enter.theValue(correo).into(CreacionUsuarioUI.TXT_CORREO_USUARIO)
        );

        Serenity.takeScreenshot();

        actor.attemptsTo(
                Click.on(CreacionUsuarioUI.BTN_CREAR_CUENTA_USUARIO)
        );
    }
}