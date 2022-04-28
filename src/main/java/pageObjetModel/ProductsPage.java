package pageObjetModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends PageObjetModel.BasePage {

    By laptopName = By.className("productName");
    By free = By.id("freeShipmentOption");

    public ProductsPage(WebDriver driver) {

        super(driver);

    }

    public void isProductsPage() {

        isDisplayed(free);

    }

    public void selectAProduct() {

        click(laptopName);

    }
}
