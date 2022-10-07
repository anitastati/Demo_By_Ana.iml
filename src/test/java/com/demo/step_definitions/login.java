package com.demo.step_definitions;

import com.demo.pages.SignInPage;
import com.demo.utilities.BrowserUtils;
import com.demo.utilities.ConfigurationReader;
import com.demo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class login {

    @Given("user is on vytrack login page")
    public void i_am_on_vytrack_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(Driver.get(), 4);

    }

    @Then("I login as a store manager {string} and {string}")
    public void i_login_as_a_store_manager(String username,String password) {
        SignInPage signInPage = new SignInPage();
        signInPage.usernameBox.sendKeys(username);
        signInPage.passwordBox.sendKeys(password);
        signInPage.submit.click();

    }

}








