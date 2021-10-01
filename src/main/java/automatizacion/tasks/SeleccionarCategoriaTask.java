package automatizacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import automatizacion.constants.CommonsConstants;
import automatizacion.ui.CommonsUI;
import automatizacion.ui.InicioUI;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SeleccionarCategoriaTask implements Task {
    String categoria;

    public SeleccionarCategoriaTask(String categoria){
        this.categoria = categoria;
    }

    public static Performable SeleccionarCategoria(String categoria) {
        return instrumented(SeleccionarCategoriaTask.class, categoria);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int tiempoEsperaMax = actor.recall(CommonsConstants.TIEMPO_ESPERA_MAX);

        actor.attemptsTo(
                WaitUntil.the(CommonsUI.BTN_CATEGORIA.getCssOrXPathSelector().replace("$",categoria), isVisible())
                        .forNoMoreThan(tiempoEsperaMax)
                        .seconds()
                , Click.on(CommonsUI.BTN_CATEGORIA.getCssOrXPathSelector().replace("$",categoria))
        );
        Serenity.takeScreenshot();
    }
}