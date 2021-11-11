package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WidgetsPage {

    WebDriver driver;
    WebElement widgets;

    public WidgetsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getWidgets() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]"));
    }

    public void clickWidgets() {
        getWidgets().click();
    }
}
