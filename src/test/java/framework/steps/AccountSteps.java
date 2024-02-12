package framework.steps;

import framework.pages.Account;
import framework.utilities.SeleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountSteps extends SeleniumUtilities {

    @When("Navigate to Create Primary Account form")
    public void clickOnCreateAccountButton(){

        clickOnElement(Account.CREATE_PRIMARY_ACCOUNT_BUTTON);

    }

    @Then("Validate Create Account title is Create Primary Account Holder")
    public void validateTitle(){

        String title = getText(Account.CREATE_ACCOUNT_TITLE);
        Assert.assertEquals("Create Primary Account Holder" , title);

    }

    @When("Enter email address {string}")
    public void enterEmail(String email){

        sendText(Account.ENTER_EMAIL, email);

    }

    @And("Enter first name {string}")
    public void enterFirstName(String firstName){

        sendText(Account.ENTER_FIRST_NAME, firstName);

    }

    @And("Enter gender")
    public void enterGender(){

        Select genderSelect = new Select(getDriver().findElement(By.name("gender")));
        genderSelect.selectByVisibleText("Male");

    }

    @And("Enter employment status {string}")
    public void enterEmploymentStatus(String job){

        sendText(Account.ENTER_EMPLOYMENT_STATUS, job);

    }

    @And("Enter title")
    public void enterTitle(){

        Select titleSelect = new Select(getDriver().findElement(By.name("title")));
        titleSelect.selectByVisibleText("Mr.");

    }

    @And("Enter last name {string}")
    public void enterLastName(String lastName){

        sendText(Account.ENTER_LAST_NAME, lastName);

    }

    @And("Enter marital status")
    public void enterMaritalStatus(){

        Select maritalSelect = new Select(getDriver().findElement(By.name("maritalStatus")));
        maritalSelect.selectByVisibleText("Single");

    }

    @And("Enter date of birth {string}")
    public void enterDateOfBirth(String birthday){

        sendText(Account.ENTER_DATE_OF_BIRTH, birthday);

    }

    @And("Click new account button")
    public void createAccount(){

        clickOnElement(Account.CREATE_ACCOUNT_BUTTON);

    }

    @And("Enter username {string} and password {string} and confirm password {string}")
    public void enterLogin(String username, String password, String confirmPassword){

        sendText(Account.ENTER_USERNAME, username);
        sendText(Account.ENTER_PASSWORD, password);
        sendText(Account.CONFIRM_PASSWORD, confirmPassword);

    }

    @And("Click submit button")
    public void submitLogin(){

        clickOnElement(Account.SUBMIT_BUTTON);
    }

    @And("Click login page button")
    public void loginPageButton(){

        clickOnElement(Account.LOGIN_PAGE_BUTTON);
    }

    @And("Enter username {string} and password {string}")
    public void enterCredentials(String username, String password) {

        sendText(Account.ENTER_USERNAME, username);
        sendText(Account.ENTER_PASSWORD, password);

    }

    @And("Click sign in button")
    public void signIn(){

        clickOnElement(Account.SIGN_IN_BUTTON);

    }

    @And("Click settings button")
    public void clickSettings(){

        clickOnElement(Account.SETTINGS_BUTTON);

    }

    @Then("Validate email address")
    public void confirmEmail(){

        String email = getText(Account.CONFIRM_EMAIL);
        Assert.assertEquals("ShibaInuLOL11@aol.com" , email);

    }

    @Then("Validate error message")
    public void confirmError(){

        String error = getText(Account.CONFIRM_ERROR);
        Assert.assertEquals("ERROR" , error);

    }

}


