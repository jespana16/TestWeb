package automatizacion.steps;

import automatizacion.constants.CommonsConstants;
import automatizacion.questions.CantidadSubCategoriasQuestion;
import automatizacion.tasks.SeleccionarCategoriaTask;
import automatizacion.tasks.SeleccionarProductoTask;
import automatizacion.ui.InicioUI;
import automatizacion.ui.ProductoUI;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ProductsStep {
    private InicioUI inicioUI;
    private String actor;

    @Entonces("^se observan los detalle del producto (.+) de la categoria (.+)$")
    public void se_observan_los_detalle_del_producto(String producto, String categoria) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarCategoriaTask.SeleccionarCategoria(categoria)
                , SeleccionarProductoTask.SeleccionarProducto(producto)
        );
    }

    @Entonces("se puede observar su descripcion, precio, color, disponibilidad, imagen de referencia")
    public void se_puede_observar_su_descripcion_precio_color_disponibilidad_imagen_de_referencia() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(the(ProductoUI.LBL_NOMBRE_PRODUCTO), isPresent())
                , seeThat(the(ProductoUI.LBL_NOMBRE_PRODUCTO), isNotEmpty())

                , seeThat(the(ProductoUI.LBL_DETALLE_PRODUCTO), isPresent())
                , seeThat(the(ProductoUI.LBL_DETALLE_PRODUCTO), isNotEmpty())

                , seeThat(the(ProductoUI.LBL_PRECIO_PRODUCTO), isPresent())
                , seeThat(the(ProductoUI.LBL_PRECIO_PRODUCTO), isNotEmpty())

                , seeThat(the(ProductoUI.LBL_DISPONIBILIDAD_PRODUCTO), isPresent())
                );
    }

    @Entonces("^otros productos disponibles para la categoria (.+)$")
    public void otros_productos_disponibles_para_la_categoria(String categoria) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarCategoriaTask.SeleccionarCategoria(categoria)
        );
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.thatTheAnswerTo(
                        "Cantidad de productos de la categoria " + categoria,
                        CantidadSubCategoriasQuestion.validarCantidadSubCategorias())
                        .isGreaterThan(0)
        );
    }
}
