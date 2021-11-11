package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class BrowserWindowsAFW {

    WebDriver driver;
    WebElement alertsFrameWindows;
    WebElement browserWindowsAFW;
    WebElement newTabAFW;
    WebElement newWindowAFW;
    WebElement newWindowMessageAFW;

    public BrowserWindowsAFW(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAlertsFrameWindows() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
    }

    public WebElement getBrowserWindowsAFW() {
        return driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
    }

    public WebElement getNewTabAFW() {
        return driver.findElement(By.id("tabButton"));
    }

    public WebElement getNewWindowAFW() {
        return driver.findElement(By.id("windowButton"));
    }

    public WebElement getNewWindowMessageAFW() {
        return driver.findElement(By.id("messageWindowButton"));
    }

    public void clickAlertsFrameWindows() {
        getAlertsFrameWindows().click();
    }

    public void clickBrowserWindowsAFW() throws InterruptedException {

        Thread.sleep(1000);
        getBrowserWindowsAFW().click();
    }

    public void clickNewTabAFW() {
        getNewTabAFW().click();
    }
    public void  clickNewWindowAFW() {
        getNewWindowAFW().click();
    }

    public void clickNewWindowMessage() {
        getNewWindowMessageAFW().click();
    }

    public void revertTab() {
        ArrayList<String> tabHandling = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(tabHandling.get(1));
    }

    public void revertWindow() {
        for (String windowsHandling : driver.getWindowHandles()){
            driver.switchTo().window(windowsHandling);
        }

    }



}
