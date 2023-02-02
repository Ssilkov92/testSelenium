import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class secondTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\AQA\\chromedriver_win32\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://the-internet.herokuapp.com/");
        //List elements = browser.findElements(By.tagName("/abtest"));
        WebElement link8 = browser.findElement((By.xpath("//html/body/div[2]/div/ul/li[8]/a")));

        link8.click();
        browser.quit();
    }
}

