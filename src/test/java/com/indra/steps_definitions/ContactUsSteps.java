package com.indra.steps_definitions;


import com.indra.actions.ContactUsActions;
import com.indra.models.FormularioContacto;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class ContactUsSteps {

    @Managed
    WebDriver driver;
    ContactUsActions contactUsActions = new ContactUsActions(driver);

    @Given("^que el usuario esta en la opcion (.*)$")
    public void queElUsuarioEstaEnLaOpcion(String opcionDelMenu) throws Throwable {
        contactUsActions.open();
    }

    @When("el usuario completa el formulario con los campos requeridos")
    public void elUsuarioCompletaElFormularioConLosCamposRequeridos(List<FormularioContacto> formularioContactos) {
        contactUsActions.enviarMensajeDeContacto(formularioContactos.get(0));
    }

    @Then("^el usuario deberia poder ver el mensaje (.*)$")
    public void elUsuarioDeberiaPoderVerElMensaje(String mensaje) {
        MatcherAssert.assertThat("El mensaje debe coincidir",
                contactUsActions.obtenerElTextoDelMensajeConfirmacion(),
                Matchers.equalTo(mensaje)
        );
    }
}
