package pageObjetModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends PageObjetModel.BasePage {

    By checkControl = By.className("checkoutContainer");
    By closeModalButton = By.xpath(".//*[@id='userKvkkModal']/div[1]/div[2]/span");
    By deleteProduct = By.cssSelector(".removeProd.svgIcon.svgIcon_trash");
    By emptyBasket = By.className("cartEmptyText");

    public BasketPage(WebDriver driver) {

        super(driver);

    }

    public void isBasketPage() {
        click(closeModalButton);
        isDisplayed(checkControl);

    }

    public void deleteAProduct() {

        click(deleteProduct);

    }

    public void isEmptyBasket() {

        isDisplayed(emptyBasket);

    }
}
