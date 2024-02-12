package framework.utilities;

import framework.base.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SeleniumUtilities extends BaseSetup {

    private WebDriverWait getWait() {

        return new WebDriverWait(getDriver(), Duration.ofSeconds(5));

    }

    private WebElement waitForVisibility(By locator) {

        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public String getText(By locator){

        return waitForVisibility(locator).getText();

    }

    public boolean isButton(By locator){

        return waitForVisibility(locator).isEnabled();

    }

    public void clickOnElement (By locator){

        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();

    }

    public void sendText (By locator, String text){

        waitForVisibility(locator).sendKeys(text);

    }

    public List<WebElement> getRows (By locator){

        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

    }




}
