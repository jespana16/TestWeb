package automatizacion.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:home_page")
public class InicioUI extends PageObject {
    public static final Target BTN_WOMEN =
            Target.the("Boton women")
                    .located(By.xpath("/html/body/div/div/header/div/div/div/div/ul/li/a[@title='Women']"));

    public static final Target BTN_DRESSES =
            Target.the("Boton dresses")
                    .located(By.xpath("/html/body/div/div/header/div/div/div/div/ul/li/a[@title='Dresses']"));

    public static final Target BTN_TSHIRTS =
            Target.the("Boton T-Shirts")
                    .located(By.xpath("/html/body/div/div/header/div/div/div/div/ul/li/a[@title='T-shirts']"));
}
