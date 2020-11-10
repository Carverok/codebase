package co.com.certification.nayus.codebase.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testStep {
    @Given("^que el actor abra el navegador y quiera acceder a google$")
    public void queElActorAbraElNavegadorYQuieraAccederAGoogle() {
        System.out.println("Given");
    }


    @When("^escriba youtube en la barra de búscqueda$")
    public void escribaYoutubeEnLaBarraDeBúscqueda() {
        System.out.println("When");
    }

    @Then("^verificamos que el primer resultado sea youtube$")
    public void verificamosQueElPrimerResultadoSeaYoutube() {
        System.out.println("Then");
    }
}
