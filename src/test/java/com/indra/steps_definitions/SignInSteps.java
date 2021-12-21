package com.indra.steps_definitions;

import com.indra.actions.ContactUsActions;
import com.indra.actions.SignInActions;
import com.indra.models.FormularioSignIn;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;
import java.util.List;
import java.util.regex.Matcher;

public class SignInSteps {
    @Managed
    WebDriver driver;
    SignInActions signInActions = new SignInActions(driver);

    @Given("^el usuario se encuentra en la opcion Sign In$")
    public void elUsuarioSeEncuentraEnLaOpcionSignIn() {
        signInActions.open();
    }

    @When("^el usuario ingresa un correo valido$")
    public void elUsuarioIngresaUnCorreoValido() {
        signInActions.hacerClickCrearUsuario();

    }

    @When("^el usuario diligencia el formulario con los datos requeridos$")
    public void elUsuarioDiligenciaElFormularioConLosDatosRequeridos(List<FormularioSignIn> formularioSignIns) {
        signInActions.hacerclickCrearRegistro(formularioSignIns.get(0));
    }

    @Then("^el sisteme deberia realizar el registro, dirigiendo al usuario a la pagina My Account$")
    public void elSistemeDeberiaRealizarElRegistroDirigiendoAlUsuarioALaPaginaMyAccount() {
        MatcherAssert.assertThat("El usuario esta en la paguina MY ACCOUNT",
                signInActions.obtenerNombreTituloPagina(),
                Matchers.equalTo("MY ACCOUNT"));
    }
}
