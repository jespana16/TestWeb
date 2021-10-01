package automatizacion.questions;

import automatizacion.ui.CommonsUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

public class CantidadSubCategoriasQuestion implements Question {

    public static Question<Integer> validarCantidadSubCategorias() {
        return new CantidadSubCategoriasQuestion();
    }

    @Override
    @Step("{0} cantidad de sub categorias")
    public Integer answeredBy(Actor actor) {
        return CommonsUI.LIST_BTN_SUBCATEGORIAS.resolveAllFor(actor).size();
    }
}