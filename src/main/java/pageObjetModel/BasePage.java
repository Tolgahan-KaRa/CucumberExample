package PageObjetModel;

import org.jsoup.helper.W3CDom;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilites.Driver;

import java.util.List;

public abstract class BasePage {

    private WebDriver driver;


    public BasePage(WebDriver driver){

        this.driver= Driver.getDriver();

    }

    public WebElement find(By locator){

        return driver.findElement(locator);

    }

    public List<WebElement> findAll(By locator){

        return driver.findElements(locator);

    }

    public void click(By locator){

        find(locator).click();

    }

    public void type(By locator, String text){

        find(locator).sendKeys(text);

    }

    public void waiting(By locator, Integer x){

        WebDriverWait wait = new WebDriverWait(driver, x);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public boolean isDisplayed(By locator){

        return find(locator).isDisplayed();

    }

    public void scroll(Integer y, Integer x){

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy("+ y +","+ x +")");

    }

    public void selectDropdown(By locator, String text){

        Select slc = new Select(find(locator));
        slc.selectByVisibleText(text);

    }

}
