package framework.steps;

import framework.pages.HomePage;
import framework.utilities.SeleniumUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePageSteps extends SeleniumUtilities {

    @Given("Browser opens to insurance app")
    public void openBrowserAndNavigate(){

        setupBrowser();

    }

    @Then("Validate home page title is TEK Insurance UI")
    public void validateTitle(){

        String title = getDriver().getTitle();
        Assert.assertEquals("TEK Insurance UI" , title);

    }

    @Then("Validate Create Primary Account button exists")
    public void validateButton(){

        boolean buttonEnabled = isButton(HomePage.CREATE_ACCOUNT_ENABLED);
        Assert.assertTrue(buttonEnabled);

    }

    @Then("Quit browser")
    public void quitBrowser(){

        getDriver().quit();

    }
}
