package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoqaPage {
    WebDriver driver;
    WebElement elements;
    WebElement forms;
    WebElement alertsFrameWindows;
    WebElement widgets;
    WebElement interactions;
    WebElement bookStore;

    public DemoqaPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElements() {
        return driver.findElement(By.cssSelector(".card.mt-4.top-card"));
    }

    public WebElement getForms() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]"));
    }

    public WebElement getAlertsFrameWindows() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
    }

    public WebElement getWidgets() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]"));
    }

    public WebElement getInteractions() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]"));
    }

    public WebElement getBookStore() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]"));
    }

    public String elementsButtonText() {
        return getElements().getText();
    }

    public String formsButtonText() {
        return getForms().getText();
    }

    public String alertsFrameWindowsButtonText() {
        return getAlertsFrameWindows().getText();
    }

    public String widgetsButtonText() {
        return getWidgets().getText();
    }

    public String interactionsButtonText() {
        return getInteractions().getText();
    }

    public String bookStoreButtonText() {
        return getBookStore().getText();
    }
}
