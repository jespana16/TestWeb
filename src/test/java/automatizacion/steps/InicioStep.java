package automatizacion.steps;

import automatizacion.constants.CommonsConstants;
import automatizacion.questions.TituloPaginaQuestion;
import automatizacion.ui.InicioUI;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class InicioStep {
    private InicioUI inicioUI;
    private String actor;

    @Dado("^que (.*) se encuentra en el portal new experience$")
    @Dado("^que (.*) desea ver el portal de new experience$")
    public void que_un_usuario_desea_ver_el_portal_de_new_experience(String actorName) {
        this.actor = actorName;
        theActorCalled(actorName).wasAbleTo(Open.browserOn(inicioUI));
    }

    @Entonces("se puede visualizar la pantalla inicial")
    public void se_puede_visualizar_la_pantalla_inicial() {
        String tituloPaginaInicialPortal = theActorCalled(actor).recall(CommonsConstants.NOMBRE_PAGINA);
        OnStage.theActorInTheSpotlight().attemptsTo(
                        Ensure.thatTheAnswerTo(
                                "El titulo de la pagina al ingresar el portal",
                                TituloPaginaQuestion.validarNombrePagina())
                                .isEqualTo(tituloPaginaInicialPortal)
        );
    }
}
