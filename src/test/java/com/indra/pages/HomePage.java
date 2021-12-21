package com.indra.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://automationpractice.com/")
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@title='Contact Us']")
    private WebElementFacade opcionContactUs;

    public WebElementFacade getOpcionContactUs() {
        return opcionContactUs;
    }
}
