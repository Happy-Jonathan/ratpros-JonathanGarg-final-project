package framework.steps;

import framework.utilities.SeleniumUtilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends SeleniumUtilities {

    @Before
    public void beforeScenario() {

        setupBrowser();

    }

    @After
    public void afterScenario(){

        getDriver().quit();

    }

}
