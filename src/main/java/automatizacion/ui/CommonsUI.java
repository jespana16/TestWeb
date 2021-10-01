package automatizacion.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:home_page")
public class CommonsUI extends PageObject {
    public static final Target BTN_CATEGORIA =
            Target.the("Boton Categoria")
                    .locatedBy("/html/body/div/div/header/div/div/div/div/ul/li/a[@title='$']");

    public static final Target LIST_BTN_SUBCATEGORIAS =
            Target.the("Botones Subcategorias")
                    .locatedBy("/html/body/div/div/div/div/div/div/ul/li");

    public static final Target BTN_PRODUCTO =
            Target.the("Boton producto")
                    .locatedBy("/html/body/div/div/div/div/div/ul/li/div/div[2]/h5/a[contains(text(),'$')]");

    public static final Target LIST_BTN_PRODUCTOS =
            Target.the("Botones productos")
                    .locatedBy("/html/body/div/div/div/div/div/ul/li");
}
