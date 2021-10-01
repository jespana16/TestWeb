package automatizacion.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:home_page")
public class ProductoUI extends PageObject {
    public static final Target LBL_NOMBRE_PRODUCTO =
            Target.the("Nombre del producto")
                    .locatedBy("/html/body/div/div/div/div/div/div/div/div/h1");

    public static final Target LBL_DETALLE_PRODUCTO =
            Target.the("Detalle del producto")
                    .locatedBy("/html/body/div/div/div/div/div/div/div/div/div/div/p");

    public static final Target LBL_PRECIO_PRODUCTO =
            Target.the("Precio del producto")
                    .located(By.id("our_price_display"));

    public static final Target LBL_COLOR_PRODUCTO =
            Target.the("Color del producto")
                    .located(By.id("color_to_pick_list"));

    public static final Target LBL_DISPONIBILIDAD_PRODUCTO =
            Target.the("Disponibilidad del producto")
                    .located(By.id("quantity_wanted"));

    public static final Target IMG_PRODUCTO =
            Target.the("Imagen del producto")
                    .located(By.id("bigpic"));
}