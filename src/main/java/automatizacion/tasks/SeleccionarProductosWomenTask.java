package automatizacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SeleccionarProductosWomenTask implements Task {

    public static Performable SeleccionarProductosWomen() {
        return instrumented(SeleccionarProductosWomenTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        /*
        int tiempoEsperaMax = actor.recall(CommonsSerivaConstants.TIEMPO_ESPERA_MAX);

        actor.attemptsTo(
                //Switch.toFrame(frame),
                WaitUntil.the(NegociacionSwapUI.BTN_SIMULADOR, isVisible())
                        .forNoMoreThan(tiempoEsperaMax)
                        .seconds(),
                Click.on(Ini),
                WaitUntil.the(NegociacionSwapUI.TXT_EC_SIMULADA, isVisible())
                        .forNoMoreThan(tiempoEsperaMax)
                        .seconds());
        Serenity.takeScreenshot();
        actor.attemptsTo(
                WaitUntil.the(NegociacionSwapUI.BTN_CERRAR_VENTANA, isVisible())
                        .forNoMoreThan(tiempoEsperaMax)
                        .seconds(),
                Click.on(NegociacionSwapUI.BTN_CERRAR_VENTANA),
                Switch.toParentFrame());
         */
    }
}