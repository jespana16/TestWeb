package automatizacion.actors;

import automatizacion.constants.CommonsConstants;
import automatizacion.steps.TestEnvironment;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebDriver;

public class CastActor extends Cast {
    private final TestEnvironment environment;

    public CastActor(TestEnvironment environment) {
        this.environment = environment;
    }

    @Override
    public Actor actorNamed(String actorName, Ability... abilities) {
        Actor newActor = super.actorNamed(actorName, abilities).describedAs("Un usuario de New experience");
        if (newActor.abilityTo(BrowseTheWeb.class) == null) {
            newActor.can(BrowseTheWeb.with(theDefaultBrowserFor(actorName)));
        }

        newActor.remember(
                CommonsConstants.NOMBRE_PAGINA,
                environment.getStingProperty(CommonsConstants.NOMBRE_PAGINA));

        newActor.remember(
                CommonsConstants.TIEMPO_ESPERA,
                environment.getIntegerProperty(CommonsConstants.TIEMPO_ESPERA));

        newActor.remember(
                CommonsConstants.TIEMPO_ESPERA_ALERTA,
                environment.getIntegerProperty(CommonsConstants.TIEMPO_ESPERA_ALERTA));

        newActor.remember(
                CommonsConstants.TIEMPO_ESPERA_MAX,
                environment.getIntegerProperty(CommonsConstants.TIEMPO_ESPERA_MAX));

        return newActor;
    }

    private WebDriver theDefaultBrowserFor(String actorName) {
        return ThucydidesWebDriverSupport.getWebdriverManager().getWebdriverByName(actorName);
    }
}
