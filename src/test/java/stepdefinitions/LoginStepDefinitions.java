package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import pages.ProductsPage;
import utils.ConfigReader;
import utils.DriverManager;

public class LoginStepDefinitions {

    private LoginPage loginPage;
    private ProductsPage productsPage;

    @Given("user is on the SauceDemo login page")
    public void user_is_on_the_saucedemo_login_page() {
        DriverManager.getDriver().get(ConfigReader.getProperty("base.url"));
        loginPage = new LoginPage(DriverManager.getDriver());
    }

    @When("user enters username {string}")
    public void user_enters_username(String userName) {
        loginPage.enterUserName(userName);
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.clockLoginButton();
    }

    @Then("user should be redirected to products page")
    public void user_should_be_redirected_to_products_page() {
        productsPage = new ProductsPage(DriverManager.getDriver());
        Assert.assertTrue(productsPage.isProductsPageDisplayed(),
                "User was not redirected to products page");
    }

    @Then("user should see the products page title")
    public void user_should_see_the_products_page_title() {
        productsPage = new ProductsPage(DriverManager.getDriver());
        Assert.assertEquals(productsPage.getPageTitle(), "Products",
                "Products page title is incorrect");
    }
}
