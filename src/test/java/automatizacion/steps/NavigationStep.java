package automatizacion.steps;

import automatizacion.questions.CantidadSubCategoriasQuestion;
import automatizacion.tasks.SeleccionarCategoriaTask;
import automatizacion.ui.InicioUI;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class NavigationStep {
    private InicioUI inicioUI;
    private String actor;

    @Cuando("^se ingresa a la categoria (.+)$")
    public void a_la_categoria(String categoria) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarCategoriaTask.SeleccionarCategoria(categoria)
        );
    }

    @Entonces("^se puede visualizar las subcategorias de la categoria (.+)$")
    public void visualizar_los_productos_de_dicha_categoria(String categoria) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.thatTheAnswerTo(
                        "Cantidad de subcategorias de la categoria " + categoria,
                        CantidadSubCategoriasQuestion.validarCantidadSubCategorias())
                        .isGreaterThan(0)
        );
    }

    @Entonces("^los productos de la categoria (.+)$")
    public void los_productos_de_la_categoria(String categoria) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.thatTheAnswerTo(
                        "Cantidad de productos de la categoria " + categoria,
                        CantidadSubCategoriasQuestion.validarCantidadSubCategorias())
                        .isGreaterThan(0)
        );
    }
}
