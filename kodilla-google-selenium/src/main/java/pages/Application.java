package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        driver.close();
    }
}
