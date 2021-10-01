package automatizacion.steps;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;

public class TestEnvironment {
    private final EnvironmentVariables environmentVariables;

    public TestEnvironment(EnvironmentVariables environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public int getIntegerProperty(String propiedad) {
        return Integer.parseInt(
                EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(propiedad));
    }

    public String getStingProperty(String propiedad) {
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(propiedad);
    }
}
