package co.com.choucair.certification.primeraAutomatizacionPOM.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/prueba.feature",
        tags = {"@HistoriaDeUsuario"},
        glue = "co.com.choucair.certification.primeraAutomatizacionPOM.definitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerCaseTags {
//
//    @Before
//    public void test(){
//        switch (SystemEnvironmentVariables.createEnvironmentVariables().getProperty("webdriver.driver")){
//            case "chrome":
//                WebDriverManager.chromedriver().setup();
//                break;
//            case "ie":case "iexplorer":
//                WebDriverManager.iedriver().setup();
//                break;
//            case "firefox":
//                WebDriverManager.firefoxdriver().setup();
//                break;
//            default:
//                WebDriverManager.chromedriver().setup();
//                break;
//        }
//    }
//    @Test
//    public void testRunner(){
//        JUnitCore.runClasses(RunnerCaseTags.class);
//    }
//    @RunWith(CucumberWithSerenity.class)
//    @CucumberOptions(features = "src/test/resources/features/prueba.feature",
//        tags = {"@HistoriaDeUsuario"},
//        glue = "co.com.choucair.certification.primeraAutomatizacionPOM.definitions",
//        snippets = SnippetType.CAMELCASE)
//    public class runner{
//    }
}
