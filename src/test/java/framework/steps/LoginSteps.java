package framework.steps;

import framework.pages.Login;
import framework.utilities.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps extends SeleniumUtilities {

    @When("Click login button")
    public void clickOnLoginButton(){

        clickOnElement(Login.LOGIN_BUTTON);

    }

    @When("Click login sign in button")
    public void clickOnLoginSignInButton(){

        clickOnElement(Login.LOGIN_SIGN_IN_BUTTON);

    }

    @Then("Validate page is Customer Service Portal")
    public void validateCSP(){

        String page = getText(Login.CSP_PAGE);
        Assert.assertEquals("Customer Service Portal" , page);

    }

    @Then("Validate login error message")
    public void validateLoginError(){

        String loginError = getText(Login.LOGIN_ERROR);
        Assert.assertEquals("ERROR" , loginError);

    }



}
