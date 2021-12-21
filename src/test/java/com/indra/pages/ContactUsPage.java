package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://automationpractice.com/index.php?controller=contact")
public class ContactUsPage extends BasePage {
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#id_contact")
    private WebElementFacade comboTituloAsunto;

    @FindBy(id = "email")
    private WebElementFacade campoEmail;

    @FindBy(id = "id_order")
    private WebElementFacade campoOderReferencia;

    @FindBy(id = "message")
    private WebElementFacade campoMensaje;

    @FindBy(id = "submitMessage")
    private WebElementFacade botonEnviar;

    @FindBy(xpath = "//p[contains(.,'Your message has been successfully sent to our team.')]")
    private WebElementFacade confirmacionEnvio;

    public WebElementFacade getComboTituloAsunto() {
        return comboTituloAsunto;
    }

    public WebElementFacade getCampoEmail() {
        return campoEmail;
    }

    public WebElementFacade getCampoOderReferencia() {
        return campoOderReferencia;
    }

    public WebElementFacade getCampoMensaje() {
        return campoMensaje;
    }

    public WebElementFacade getBotonEnviar() {
        return botonEnviar;
    }

    public WebElementFacade getConfirmacionEnvio() {
        return confirmacionEnvio;
    }


}
