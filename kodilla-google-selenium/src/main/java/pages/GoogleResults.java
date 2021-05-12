package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage{
    @FindBy(css = "div[class='g']")
    private List<WebElement> results;

    @FindBy(tagName = "div[class='g'] > cite")
    private List<WebElement> links;

    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public int iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
        System.out.println(links.size());
        return results.size();
    }

    public int openRandomResult(int loadPageNumber) {
//        Random random = new Random();
//        int loadPageNumber = random.nextInt(results.size());
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(results.get(loadPageNumber))).click();
        return loadPageNumber;
//Moja propozycja testu, to utworzenie listy z linkami, które będą tożsame z tymi, które pojawiają się jako wyniki
//a następnie porównanie linku wylosowanej liczby z otwartą stroną. Jedynie z realizacją jest kłopot.
    }
}
