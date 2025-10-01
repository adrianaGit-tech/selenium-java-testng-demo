package com.example.tests;

import com.example.core.BaseTest;
import com.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginValido() {
        LoginPage page = new LoginPage(driver);
        page.open();
        page.login("tomsmith", "SuperSecretPassword!");
        Assert.assertTrue(page.getFlashMessage().contains("You logged into a secure area!"));
    }

    @Test
    public void loginInvalido() {
        LoginPage page = new LoginPage(driver);
        page.open();
        page.login("tomsmith", "claveIncorrecta");
        Assert.assertTrue(page.getFlashMessage().contains("Your password is invalid!"));
    }
}

