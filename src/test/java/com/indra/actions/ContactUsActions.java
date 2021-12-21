package com.indra.actions;

import com.indra.models.FormularioContacto;
import com.indra.pages.ContactUsPage;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("/index.php?controller=contact")
public class ContactUsActions extends ContactUsPage {
    public ContactUsActions(WebDriver driver) {
        super(driver);
    }

    public void llenarFormularioContacto(FormularioContacto contacto){
        selectOptionFromDropDown(By.xpath("//select[@id='id_contact']"),contacto.getTituloAsunto());
        enter(contacto.getEmail()).into(getCampoEmail());
        enter(contacto.getOrdenReferencia()).into(getCampoOderReferencia());
        enter(contacto.getMensaje()).into(getCampoMensaje());
    }

    public void enviarMensajeDeContacto (FormularioContacto contacto){
        llenarFormularioContacto(contacto);
        getBotonEnviar().click();
    }


    public boolean elMensajeEsVisible(){
        getConfirmacionEnvio().waitUntilVisible();
        return getConfirmacionEnvio().isVisible();
    }

    public String obtenerElTextoDelMensajeConfirmacion(){
        getConfirmacionEnvio().waitUntilVisible();
        return getConfirmacionEnvio().getText();
    }


}
