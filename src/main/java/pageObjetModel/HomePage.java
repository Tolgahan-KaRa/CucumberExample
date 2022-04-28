package pageObjetModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageObjetModel.BasePage {

    By catogoryText = By.id("allCatBtn");
    By searchArea = By.id("searchData");
    By searchButton = By.className("iconSearch");

    public HomePage(WebDriver driver) {

        super(driver);

    }

    public void isHomePage() {

        isDisplayed(catogoryText);

    }

    public void searchArea() {

        type(searchArea,"laptop");
        click(searchButton);

    }
}
