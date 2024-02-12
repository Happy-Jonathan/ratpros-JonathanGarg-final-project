package framework.pages;

import org.openqa.selenium.By;

public class Account {

    public static final By CREATE_PRIMARY_ACCOUNT_BUTTON = By.linkText("Create Primary Account");

    public static final By CREATE_ACCOUNT_TITLE = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/h2");

    public static final By ENTER_EMAIL = By.name("email");

    public static final By ENTER_FIRST_NAME = By.name("firstName");

    public static final By ENTER_GENDER = By.name("gender");

    public static final By ENTER_EMPLOYMENT_STATUS = By.name("employmentStatus");

    public static final By ENTER_TITLE = By.name("title");

    public static final By ENTER_LAST_NAME = By.name("lastName");

    public static final By ENTER_MARITAL_STATUS = By.name("maritalStatus");

    public static final By ENTER_DATE_OF_BIRTH = By.name("dateOfBirth");

    public static final By CREATE_ACCOUNT_BUTTON = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/form/div/div[2]/button[1]");

    public static final By ENTER_USERNAME = By.name("username");

    public static final By ENTER_PASSWORD = By.name("password");

    public static final By CONFIRM_PASSWORD = By.name("confirm");

    public static final By SUBMIT_BUTTON = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/form/div/div[4]/button[1]");

    public static final By LOGIN_PAGE_BUTTON = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/a");

    public static final By SIGN_IN_BUTTON = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]");

    public static final By SETTINGS_BUTTON = By.linkText("Settings");

    public static final By CONFIRM_EMAIL = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[1]/div[2]/div[1]/p[2]");

    public static final By CONFIRM_ERROR = By.cssSelector("#root > div > div.css-n7iznt > div > div > div > form > div.chakra-alert.banner-error.css-1ykemat > div");





}
