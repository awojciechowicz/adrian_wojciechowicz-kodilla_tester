package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static java.time.Duration.*;

public class AllegroTestingAppWithCssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://selenium-drivers/Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");


//        try {
//            Thread.sleep(20000);
//
//        } catch (Exception e) {
//
//        }

//        Alert alert = driver.switchTo().alert();
//        alert.accept();
        WebElement category = driver.findElement(
                By.cssSelector("div > select"));

        Select categorySelect = new Select(category);
        categorySelect = new Select(category);
        categorySelect.selectByIndex(3);

        WebElement inputField = driver.findElement(By.cssSelector("div > input"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("h2 > a")));

        List<WebElement> element = driver.findElements(By.cssSelector("article"));

        System.out.println(element.get(1).getText());
    }
}
