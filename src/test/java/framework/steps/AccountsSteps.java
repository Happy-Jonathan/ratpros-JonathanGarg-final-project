package framework.steps;

import framework.pages.Accounts;
import framework.pages.Plans;
import framework.utilities.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountsSteps extends SeleniumUtilities {

    @When("Click accounts button")
    public void clickAccountsButton(){

        clickOnElement(Accounts.ACCOUNTS_BUTTON);

    }

    @Then("Validate {int} rows of accounts data are present")
    public void checkAccountsRows(int accountsTableRows){

        List<WebElement> accountRows = getRows(Accounts.ACCOUNTS_TABLE);
        Assert.assertEquals(accountsTableRows,accountRows.size());

    }

    @When("Click show {string}")
    public void selectNumberOfRows(String numberOfRows){



        Select rowSelect = new Select(getDriver().findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select")));
        rowSelect.selectByValue(numberOfRows);

    }



}
