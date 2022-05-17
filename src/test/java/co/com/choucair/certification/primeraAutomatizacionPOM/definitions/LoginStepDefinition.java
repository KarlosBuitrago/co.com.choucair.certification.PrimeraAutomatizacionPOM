package co.com.choucair.certification.primeraAutomatizacionPOM.definitions;

import co.com.choucair.certification.primeraAutomatizacionPOM.step.OpenApp;
import co.com.choucair.certification.primeraAutomatizacionPOM.step.TaskAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {

    @Steps
    OpenApp openApp;
    TaskAction taskAction;


    @Given("^I enter with may credentials$")
    public void iEnterWithMyCredentials() {
        openApp.AppUrl();
    }
    @When("^I proceed with the authentication$")
    public void iProceedWithTheAuthentication(){
        taskAction.signIn();
    }
    @Then("^go to the main view of the page$")
    public void goToTheMainViewOfThePage(){
        taskAction.verificar();
    }
}
