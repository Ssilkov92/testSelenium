import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class firstTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\AQA\\chromedriver_win32\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://the-internet.herokuapp.com/");
        //List <WebElement> elements = browser.findElements(By.tagName(""));
        WebElement link7 = browser.findElement((By.xpath("//*[@id=\"content\"]/ul/li[7]/a")));
        //WebElement link7 = (new WebDriverWait(browser, 10));

        link7.click();
        browser.quit();
    }
}

