package automatizacion.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/*
 * Cucumber Options Specifications
 * Plugin		= (Pretty) Ver en ejecución los escenarios ejecutados y archivos al que apunta
 * Feature		= Ruta donde estan los features, se puede especificar uno en especifico
 * Glue			= Ruta donde estan los stepdefinitions, se puede especificar uno en especifico
 * Tag			= Nombre tag (escenarios) para la ejecucion (comentado ejecuta todo)
 * monochrome	= Muestra resultados legibles
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/features/start/Users.feature"},
        glue = {"automatizacion.steps"},
        monochrome = true)
public class RunnerUsers {}
