package automatizacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;

public class TituloPaginaQuestion implements Question {

    public static Question<String> validarNombrePagina() {
        return new TituloPaginaQuestion();
    }

    @Override
    @Step("{0} consulta el titulo de la pagina")
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).getTitle();
    }
}
