package automatizacion.steps;

import automatizacion.constants.CommonsConstants;
import automatizacion.questions.TituloPaginaQuestion;
import automatizacion.ui.InicioUI;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class InicioStep {
    private InicioUI inicioUI;
    private String actor;

    @Dado("^que (.*) desea ver el portal de new experience$")
    public void que_un_usuario_desea_ver_el_portal_de_new_experience(String actorName) {
        this.actor = actorName;
        theActorCalled(actorName).wasAbleTo(Open.browserOn(inicioUI));
    }

    @Entonces("se puede visualizar la pantalla inicial")
    public void se_puede_visualizar_la_pantalla_inicial() {
        String tituloPaginaInicialPortal = theActorCalled(actor).recall(CommonsConstants.NOMBRE_PAGINA);
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        Ensure.thatTheAnswerTo(
                                "El titulo de la pagina al ingresar el portal",
                                TituloPaginaQuestion.validarNombrePagina())
                                .isEqualTo(tituloPaginaInicialPortal));
    }


    /*
    @Dado("se ingresa con credenciales")
    @Cuando("ingresa con credenciales")
    public void ingresa_con_credenciales(SesionModel sesionModel) {
        String tituloAntes = theActorCalled(actor).recall(CommonsSerivaConstants.NOMBRE_PAGINA_ANTES);
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        Ensure.thatTheAnswerTo(
                                "El titulo de la pagina antes de iniciar sesion",
                                TituloPaginaQuestion.validarNombrePagina())
                                .isEqualTo(tituloAntes));

        OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesionTask.ingresoSeriva(sesionModel));
    }
     */

    /*
    @Entonces("puede visualizar la pagina principal de Seriva")
    public void puedo_visualizar_la_pagina_principal_de_Seriva() {
        String tituloAntes = theActorCalled(actor).recall(CommonsSerivaConstants.NOMBRE_PAGINA_ANTES);
        String tituloDespues =
                theActorCalled(actor).recall(CommonsSerivaConstants.NOMBRE_PAGINA_DESPUES);
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        Ensure.thatTheAnswerTo(
                                "El titulo de la pagina despues de iniciar sesion",
                                TituloPaginaQuestion.validarNombrePagina())
                                .isEqualTo(tituloDespues));
        OnStage.theActorInTheSpotlight().attemptsTo(CerrarSesionTask.cerrarSesion());
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        Ensure.thatTheAnswerTo(
                                "El titulo de la pagina antes de iniciar sesion",
                                TituloPaginaQuestion.validarNombrePagina())
                                .isEqualTo(tituloAntes));
    }
    */
}
