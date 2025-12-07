package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        PageFactory.initElements(webDriver, this);
    }

    protected void click(WebElement webElement) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
    }

    protected void sendKeys(WebElement webElement, String text) {
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement)).clear();
        webElement.sendKeys(text);
    }

    protected String getText(WebElement webElement) {
        return webDriverWait.until(ExpectedConditions.visibilityOf(webElement)).getText();
    }

    protected boolean isElementDisplayed(WebElement webElement) {
        try {
            return webDriverWait.until(ExpectedConditions.visibilityOf(webElement)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
