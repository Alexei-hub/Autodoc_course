package lesson23;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.fail;

public class TestIsExistInDom extends WebDriverInit {

    final String EXPECTED_LABEL_COLOR = "rgba(0, 160, 70, 1)";

    @Test
    public void firstTest() {
        driver.get("https://rozetka.com.ua/");
        List<WebElement> logo = driver.findElements(By.xpath("/a[@class=‘header__logo’]"));
        if (logo.size() > 0) {
            System.out.println("Logo appeared");
        } else {
            fail("Logo doesn't appeared");
        }
    }
}

//        Открыть https://rozetka.com.ua/
//        Перейти в раздел «Компьютеры и ноутбуки»
//        Перейти в раздел « Ноутбуки»
//        Добавить первый товар в корзину
//        Проверить что в корзину добавился один товар (проверить в кружке на кнопке корзины)
//        Перейти в корзину и проверить, что добавился правильный товар (сравнить тайтлы)
