package com.indra.actions;

import com.indra.models.FormularioSignIn;
import com.indra.pages.SignInPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("/index.php?controller=authentication&back=my-account#account-creation")

public class SignInActions extends SignInPage {
    public SignInActions(WebDriver driver) {
        super(driver);
    }


    public void llenarCorreo(){
        System.out.println(generarCorreoAletario());
        enter(generarCorreoAletario()).into(getEmail());
    }

    public void hacerClickCrearUsuario(){
        llenarCorreo();
        getBtnCreatedAccount().click();
    }

    public void llenarElFormularioDeRegistro(FormularioSignIn sign_in)  {
        enter(sign_in.getNombre()).into(getFirtsname());
        enter(sign_in.getApellido()).into(getLastname());
        enter(sign_in.getContrasena()).into(getPassword());
        enter(sign_in.getDireccion1()).into(getAddress1());
        enter(sign_in.getCiudad()).into(getCity());
        selectOptionFromDropDown(By.id("id_state"),sign_in.getEstado());
        enter(sign_in.getCodigoPostal()).into(getPostcode());
        enter(sign_in.getTelefono()).into(getPhonenumber());
    }

    public void hacerclickCrearRegistro(FormularioSignIn sign_in){
        llenarElFormularioDeRegistro(sign_in);
        getBtnCrearRegistro().click();
    }

    public String obtenerNombreTituloPagina(){
        return getTituloPagina().getText();
    }
    public String generarCorreoAletario(){
        int numero = (int)(Math.random()*10000+1);
        String correoAleatorio=String.valueOf("abcd"+numero+"@micorreo.com");
        return correoAleatorio;
    }
}
