package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

    @FindBy(className = "title")
    private WebElement pageTitle;

    public ProductsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getPageTitle() {
        return getText(pageTitle);
    }

    public boolean isProductsPageDisplayed() {
        return isElementDisplayed(pageTitle) && getPageTitle().equals("Products");
    }
}
