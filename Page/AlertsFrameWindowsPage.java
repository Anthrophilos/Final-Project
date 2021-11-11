package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsFrameWindowsPage {

    WebDriver driver;
    WebElement alertsFrameWindows;

    public AlertsFrameWindowsPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getAlertsFrameWindows() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div"));
    }
    public void clickOnAlertsFrameWindows() {
        getAlertsFrameWindows().click();
    }
}
