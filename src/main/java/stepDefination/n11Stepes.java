package stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjetModel.BasketPage;
import pageObjetModel.HomePage;
import pageObjetModel.ProductPage;
import pageObjetModel.ProductsPage;
import utilites.Driver;

import java.util.concurrent.TimeUnit;

public class n11Stepes {

    private WebDriver driver;
    HomePage homepage;
    ProductsPage productspage;
    ProductPage productpage;
    BasketPage basketpage;

    @Given("^go to website$")
    public void go_to_website() throws Throwable {

        this.driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.n11.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @And("^search product$")
    public void searchProduct() throws Throwable {

        homepage = new HomePage(driver);
        homepage.isHomePage();
        homepage.searchArea();

    }

    @And("^select product$")
    public void selectProduct() {

        productspage = new ProductsPage(driver);
        productspage.isProductsPage();
        productspage.selectAProduct();

    }

    @And("^add basket$")
    public void addBasket() {

        productpage = new ProductPage(driver);
        productpage.isProductPage();
        productpage.addAProduct();
        productpage.isIncreasedBasket();
        productpage.clickBasketButton();

    }

    @When("^go to basket$")
    public void goToBasket() {

        basketpage = new BasketPage(driver);
        basketpage.isBasketPage();

    }

    @Then("^delete product$")
    public void deleteProduct() {

        basketpage.deleteAProduct();
        basketpage.isEmptyBasket();

    }
}
