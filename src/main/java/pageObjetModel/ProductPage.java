package pageObjetModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends PageObjetModel.BasePage {

    By askQuestion = By.id("askQuestion");
    By addBasketButton = By.className("addBasketUnify");
    By basketAddText = By.className("basketTotalNum");
    By myBasketButton = By.className("myBasket");

    public ProductPage(WebDriver driver) {

        super(driver);

    }


    public void isProductPage() {

        isDisplayed(askQuestion);

    }

    public void addAProduct() {

        click(addBasketButton);

    }

    public void isIncreasedBasket() {

        isDisplayed(basketAddText);

    }

    public void clickBasketButton() {

        click(myBasketButton);

    }
}
