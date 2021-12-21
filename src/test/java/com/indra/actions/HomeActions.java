package com.indra.actions;

import com.indra.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class HomeActions extends HomePage {
    public HomeActions(WebDriver driver) {
        super(driver);
    }

    public void irALaOpcion() {
        getOpcionContactUs().click();
    }
}
