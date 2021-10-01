package automatizacion.tasks;

import automatizacion.constants.CommonsConstants;
import automatizacion.ui.CommonsUI;
import automatizacion.ui.InicioUI;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarProductoTask implements Task {
    String producto;

    public SeleccionarProductoTask(String producto){
        this.producto = producto;
    }

    public static Performable SeleccionarProducto(String producto) {
        return instrumented(SeleccionarProductoTask.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int tiempoEsperaMax = actor.recall(CommonsConstants.TIEMPO_ESPERA_MAX);

        actor.attemptsTo(
                WaitUntil.the(CommonsUI.BTN_PRODUCTO.getCssOrXPathSelector().replace("$",producto), isVisible())
                        .forNoMoreThan(tiempoEsperaMax)
                        .seconds()
                , Click.on(CommonsUI.BTN_PRODUCTO.getCssOrXPathSelector().replace("$",producto))
        );
        Serenity.takeScreenshot();
    }
}