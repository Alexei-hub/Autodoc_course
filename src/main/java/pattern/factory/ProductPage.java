package pattern.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    @FindBy(xpath = "//div[@class='product__heading']/h1")
    private WebElement tittleOfProduct;
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public String getTittleText() {
        return tittleOfProduct.getAttribute("innerText");
    }

}


//    Открыть https://rozetka.com.ua/
//        Перейти в раздел «Компьютеры и ноутбуки»
//        Перейти в раздел « Ноутбуки»
//        Добавить первый товар в корзину
//        Проверить что в корзину добавился один товар
//        Перейти в корзину и проверить, что добавился правильный товар
