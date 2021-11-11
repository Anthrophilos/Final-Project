package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinksElementsPage {
    WebDriver driver;
    WebElement elementsButton;
    WebElement brokenLinksImages;
    WebElement validLink;
    WebElement brokenLink;

    public BrokenLinksElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElementsButton() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
    }

    public WebElement getBrokenLinksImages() {
        return driver.findElement(By.xpath("//*[@id=\"item-6\"]"));
    }

    public WebElement getValidLink() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/a[1]"));
    }

    public WebElement getBrokenLink() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/a[2]"));
    }

    public void clickElementsButton() {
        getElementsButton().click();
    }

    public void setBrokenLinksImagesElementsPage() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getBrokenLinksImages()); //roller.click();
        getBrokenLinksImages().click();
    }

    public void clickValidLink() {
        getValidLink().click();
    }

    public void clickBrokenLinks() {
        getBrokenLink().click();
    }

}
