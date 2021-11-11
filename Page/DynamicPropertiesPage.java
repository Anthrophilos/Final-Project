package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPropertiesPage {

    WebDriver driver;
    WebDriverWait wdwait;
    WebElement elementsMenu;
    WebElement DynamicProperties;
    WebElement visibleAfter5SecondsButton;

    public DynamicPropertiesPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getElementsMenu() {
        return driver.findElement(By.cssSelector(".card.mt-4.top-card"));
    }

    public WebElement getDynamicProperties() {
        return driver.findElement(By.cssSelector("#item-8"));
    }

    public WebElement getVisibleAfter5SecondsButton() {
        return driver.findElement(By.id("visibleAfter"));
    }

    public void clickElementsMenu() {
        getElementsMenu().click();
    }

    public void clickDynamicProperties() throws InterruptedException {
        WebElement dynamicProperties = driver.findElement(By.cssSelector("#item-8"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dynamicProperties);
        Thread.sleep(500);
        dynamicProperties.click();
    }

    public void buttonIsVisible() throws InterruptedException {
        Thread.sleep(9000);
        getVisibleAfter5SecondsButton().getText();

    }


}
