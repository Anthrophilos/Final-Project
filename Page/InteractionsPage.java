package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InteractionsPage {

    WebDriver driver;
    WebElement interactions;

    public InteractionsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getInteractions() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]"));
    }

    public void clickInteractions() {
        getInteractions().click();
    }
}
