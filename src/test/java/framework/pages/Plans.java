package framework.pages;

import org.openqa.selenium.By;

public class Plans {

    public static final By PLANS_BUTTON = By.linkText("Plans");

    public static final By PLANS_TABLE = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div/table/tbody/tr");

    public static final By DATE_CREATED = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[4]");

    public static final By DATE_EXPIRED = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[5]");



}
