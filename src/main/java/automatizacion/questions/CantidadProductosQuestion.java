package automatizacion.questions;

import automatizacion.ui.CommonsUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

public class CantidadProductosQuestion implements Question {

    public static Question<Integer> validarCantidadProductos() {
        return new CantidadProductosQuestion();
    }

    @Override
    @Step("{0} cantidad de productos")
    public Integer answeredBy(Actor actor) {
        return CommonsUI.LIST_BTN_PRODUCTOS.resolveAllFor(actor).size();
    }
}