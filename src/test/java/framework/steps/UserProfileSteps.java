package framework.steps;

import framework.pages.UserProfile;
import framework.utilities.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserProfileSteps extends SeleniumUtilities {

    @When("Click profile button")
    public void clickProfileButton(){

        clickOnElement(UserProfile.PROFILE_BUTTON);

    }

    @Then("Validate profile information")
    public void checkInformation(){

        String userType = getText(UserProfile.USER_TYPE);
        Assert.assertEquals("CUSTOMER", userType);

        String fullName = getText(UserProfile.FULL_NAME);
        Assert.assertEquals("Happy Halloween", fullName);

        String username = getText(UserProfile.USERNAME);
        Assert.assertEquals("happyusername8", username);

    }

    @Then("Click logout button")
    public void clickLogoutButton(){

        clickOnElement(UserProfile.LOGOUT_BUTTON);

    }

}
