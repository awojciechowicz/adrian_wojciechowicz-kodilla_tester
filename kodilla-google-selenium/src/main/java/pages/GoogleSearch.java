package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class GoogleSearch extends AbstractPage{
    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(css = "input[value='Szukaj w Google']")
    static List<WebElement> searchButton;
    private static GoogleResults googleResults;

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }

    public void searchResults() {
        PageFactory.initElements(driver, GoogleSearch.class);
        WebElement consentButton = driver.findElement(By.cssSelector("#zV9nZe"));
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(consentButton)).click();
        inputField.sendKeys("Kodilla");
        googleResults = loadResults(driver);
        int numberOfPages = googleResults.iSeeResults();
        Random random = new Random();
        int pageNumber = random.nextInt(numberOfPages);
        googleResults.openRandomResult(pageNumber);
    }

    public GoogleResults loadResults(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(1))).click();
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }
}
