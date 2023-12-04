import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static java.lang.Thread.sleep;

public class ForTest {

    @Test
    public void openTab() throws InterruptedException {
        WebDriver driver  = new ChromeDriver();
        driver.get("https://www.google.com.ua/");
        sleep(5000);
        driver.switchTo().newWindow(WindowType.TAB);
        sleep(5000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        sleep(5000);
        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles.size());

        List<String> test = new ArrayList<>(handles);
        driver.switchTo().window(test.get(0));
        sleep(5000);

        driver.quit();
    }
}



