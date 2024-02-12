package framework.pages;

import org.openqa.selenium.By;

public class Login {

    public static final By LOGIN_BUTTON = By.xpath("//*[@id=\"root\"]/div/div[1]/div/a[2]");

    public static final By CSP_PAGE = By.xpath("/html/body/div[1]/div/div[1]/div/h2");

    public static final By LOGIN_SIGN_IN_BUTTON = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]");

    public static final By LOGIN_ERROR = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div");

}
