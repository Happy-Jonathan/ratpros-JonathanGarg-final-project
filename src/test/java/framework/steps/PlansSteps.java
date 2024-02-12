package framework.steps;

import framework.pages.Plans;
import framework.utilities.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class PlansSteps extends SeleniumUtilities {

    @When("Click plans button")
    public void clickPlansButton(){

        clickOnElement(Plans.PLANS_BUTTON);

    }

    @Then("Validate {int} rows of data are present")
    public void checkRows(int tableRows){

        List<WebElement> rows = getRows(Plans.PLANS_TABLE);
        Assert.assertEquals(tableRows,rows.size());

    }

    @Then("Validate Date Created is current date and Date Expired is the day after")
    public void checkDates(){

        String todaysDate = getText(Plans.DATE_CREATED);
        String dateNoComma = todaysDate.replace(",", "");

        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yyyy");
        String time = today.format(formatter);

        Assert.assertEquals(time, dateNoComma);



        String tomorrowsDate = getText(Plans.DATE_EXPIRED);
        String tomorrowDateNoComma = tomorrowsDate.replace(",", "");

        LocalDate tomorrow = today.plusDays(1);
        String tomorrowTime = tomorrow.format(formatter);

        Assert.assertEquals(tomorrowTime, tomorrowDateNoComma);


    }



}
