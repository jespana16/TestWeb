package automatizacion.steps;

import automatizacion.actors.CastActor;
import automatizacion.constants.CommonsConstants;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.*;
import java.lang.reflect.Type;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.steps.StepEventBus;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;

public class Hooks {
    private EnvironmentVariables environmentVariables;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @DefaultParameterTransformer
    @DefaultDataTableEntryTransformer
    @DefaultDataTableCellTransformer
    public Object defaultTransformer(Object fromValue, Type toValueType) {
        JavaType javaType = objectMapper.constructType(toValueType);
        return objectMapper.convertValue(fromValue, javaType);
    }

    @Before
    public void setTheWebStage() {
        OnStage.setTheStage(new CastActor(new TestEnvironment(environmentVariables)));
    }

    @After
    public void tearDown() {
        int tiempoEspera =
                OnStage.theActorInTheSpotlight().recall(CommonsConstants.TIEMPO_ESPERA);

        BrowseTheWeb.as(OnStage.theActorInTheSpotlight()).waitFor(tiempoEspera).second();
        ThucydidesWebDriverSupport.getDriver().quit();
    }
}
