package pattern.pagebject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage {

    By firstProductTittle = By.xpath("//span[@class='goods-tile__title']");

    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }


    public ProductPage clickOnProductTittleByIndex(int tittleIndex) {
        List<WebElement> tittles = driver.findElements(firstProductTittle);
        tittles.get(tittleIndex).click();
        return new ProductPage(driver);
    }

}
