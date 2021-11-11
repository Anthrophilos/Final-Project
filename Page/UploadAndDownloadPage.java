package Page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadAndDownloadPage {

    WebDriver driver;
    WebElement elementsMenu;
    WebElement uploadAndDownload;
    WebElement download;
    WebElement upload;

    public UploadAndDownloadPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElementsMenu() {
        return driver.findElement(By.cssSelector(".card.mt-4.top-card"));
    }

    public WebElement getUploadAndDownload() {
        return driver.findElement(By.xpath("//*[@id=\"item-7\"]"));
    }

    public WebElement getDownload() {
        return driver.findElement(By.xpath("//*[@id=\"downloadButton\"]"));
    }

    public WebElement getUpload() {
        return driver.findElement(By.id("uploadFile"));
    }

    public void clickElementsMenu() {
        getElementsMenu().click();
    }

    public void clickDownloadAndUpload() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getUploadAndDownload());
        getUploadAndDownload().click();
    }

    public void clickDownload() {
        getDownload().click();
    }

    public void selectFileToUpload(String uploadPicturePath) {
        getUpload().sendKeys(uploadPicturePath);


    }


}
