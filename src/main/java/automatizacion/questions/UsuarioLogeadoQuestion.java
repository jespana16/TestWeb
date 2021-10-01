package automatizacion.questions;

import automatizacion.ui.InicioUI;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;
import net.thucydides.core.annotations.Step;

public class UsuarioLogeadoQuestion implements Question {

    public static Question<String> UsuarioLogeado() {
        return new UsuarioLogeadoQuestion();
    }

    @Override
    @Step("{0} usuario logueado")
    public String answeredBy(Actor actor) {
        return Text.of(InicioUI.TXT_USUARIO_LOGEADO).viewedBy(actor).asString();
    }
}