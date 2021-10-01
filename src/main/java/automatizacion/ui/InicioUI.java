package automatizacion.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:home_page")
public class InicioUI extends PageObject {
    public static final Target BTN_SIGN_IN =
            Target.the("Boton iniciar sesion")
                    .located(By.xpath("/html/body/div/div/header/div/div/div/nav/div[1]/a"));

    public static final Target TXT_USUARIO_LOGEADO =
            Target.the("Usuario Logueado")
                    .located(By.xpath("/html/body/div/div/header/div/div/div/nav/div/a/span"));
}
