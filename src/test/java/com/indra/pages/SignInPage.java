package com.indra.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation")
public class SignInPage extends BasePage {
    public SignInPage(WebDriver driver) {
        super(driver);
    }
    /** pagina donde se coloca el correo para el registro */

    @FindBy(id = "email_create")
    private WebElementFacade email;

    @FindBy(id = "SubmitCreate")
    private WebElementFacade btnCreatedAccount;

    /** Formulario para el registro en la pagina*/

    @FindBy(id = "customer_firstname")
    private WebElementFacade firtsname;

    @FindBy(id = "customer_lastname")
    private  WebElementFacade lastname;

    @FindBy(id = "passwd")
    private WebElementFacade password;

    @FindBy(id = "address1")
    private WebElementFacade address1;

    @FindBy(id = "city")
    private WebElementFacade city;

    @FindBy(id = "id_state")
    private WebElementFacade state;

    @FindBy(id = "postcode")
    private WebElementFacade postcode;

    @FindBy(id = "id_country")
    private WebElementFacade country;

    @FindBy(id = "phone")
    private  WebElementFacade phonenumber;

    @FindBy(id = "submitAccount")
    private WebElementFacade btnCrearRegistro;

    @FindBy(css = "h1")
    private WebElementFacade tituloPagina;

    public WebElementFacade getTituloPagina() {
        return tituloPagina;
    }

    public WebElementFacade getEmail() {
        return email;
    }

    public WebElementFacade getBtnCreatedAccount() {
        return btnCreatedAccount;
    }

    public WebElementFacade getFirtsname() {
        return firtsname;
    }

    public WebElementFacade getLastname() {
        return lastname;
    }

    public WebElementFacade getPassword() {
        return password;
    }

    public WebElementFacade getAddress1() {
        return address1;
    }

    public WebElementFacade getCity() {
        return city;
    }

    public WebElementFacade getState() {
        return state;
    }

    public WebElementFacade getPostcode() {
        return postcode;
    }

    public WebElementFacade getCountry() {
        return country;
    }

    public WebElementFacade getPhonenumber() {
        return phonenumber;
    }

    public WebElementFacade getBtnCrearRegistro() {
        return btnCrearRegistro;
    }
}
