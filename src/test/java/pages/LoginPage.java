package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement userNameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterUserName(String userName) {
        sendKeys(userNameField, userName);
    }

    public void enterPassword(String password) {
        sendKeys(passwordField, password);
    }

    public void clockLoginButton() {
        click(loginButton);
    }
}
