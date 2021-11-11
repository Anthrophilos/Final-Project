package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxElementsPage {

    WebDriver driver;
    WebElement checkBoxElements;
    WebElement checkBoxMenu;
    WebElement homeCheckBox;
    WebElement desktopToggle;
    WebElement notesCheckBox;
    WebElement commandsCheckBox;
    WebElement documentsToggle;
    WebElement workSpaceToggle;
    WebElement reactCheckBox;
    WebElement angularCheckBox;
    WebElement veuCheckBox;
    WebElement officeToggle;
    WebElement publicCheckBox;
    WebElement privateCheckBox;
    WebElement classifiedCheckBox;
    WebElement generalCheckBox;
    WebElement downloadsToggle;
    WebElement wordFileCheckBox;
    WebElement excelFileCheckBox;

    public CheckBoxElementsPage(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement getCheckBoxElements() {
        return driver.findElement(By.cssSelector(".card.mt-4.top-card"));
    }

    public WebElement getCheckBoxMenu() {
        return driver.findElement(By.xpath("//*[@id=\"item-1\"]"));
    }

    public WebElement getHomeCheckBox() {
        return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/span[1]/button[1]/*[1]"));
    }

    public WebElement getDesktopToggle() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"));
    }

    public WebElement getNotesCheckBox() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]"));
    }

    public WebElement getCommandsCheckBox() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[2]/span/label/span[1]"));
    }

    public WebElement getDocumentsToggle() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button"));
    }

    public WebElement getWorkSpaceToggle() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/button"));
    }

    public WebElement getReactCheckBox() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[1]/span/label/span[1]"));
    }

    public WebElement getAngularCheckBox() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[2]/span/label/span[1]"));
    }

    public WebElement getVeuCheckBox() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[3]/span/label/span[1]"));
    }

    public WebElement getOfficeToggle() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/button"));
    }

    public WebElement getPublicCheckBox() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[1]/span/label/span[1]"));
    }

    public WebElement getPrivateCheckBox() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[2]/span/label/span[1]"));
    }

    //this xPath is unreliable
    public WebElement getClassifiedCheckBox() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[3]/span/label/span[3]"));
    }

    public WebElement getGeneralCheckBox() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[4]/span/label/span[1]"));
    }

    public WebElement getDownloadsToggle() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button"));
    }

    public WebElement getWordFileCheckBox() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[1]/span/label/span[1]"));
    }

    public WebElement getExcelFileCheckBox() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[2]/span/label/span[1]"));
    }

    //ili ova ili ova sledeca metoda
    public void clickCheckBoxElements() {
        getCheckBoxElements().click();
    }

    public void clickCheckBoxMenu() {
        getCheckBoxMenu().click();
    }

    public void clickHomeCheckBox() {
        getHomeCheckBox().click();
    }

    public void clickDektopToggle() {
        getDesktopToggle().click();
    }

    public void clickNotesCheckBox() {
        getNotesCheckBox().click();
    }

    public void clickCommandsTextBox() {
        getCommandsCheckBox().click();
    }

    public void clickDocumentToggle() {
        getDocumentsToggle().click();
    }

    public void clickWorkSpaceToggle() {
        getWorkSpaceToggle().click();
    }

    public void clickReactCheckBox() {
        getReactCheckBox().click();
    }

    public void clickAngularCheckBox() {
        getAngularCheckBox().click();
    }

    public void clickVeuCheckBox() {
        getVeuCheckBox().click();
    }

    public void clickOfficeToggleCheckBox() {
        getOfficeToggle().click();
    }

    public void clickPublicCheckBox() {
        getPublicCheckBox().click();
    }

    public void clickPrivateCheckBox() {
        getPrivateCheckBox().click();
    }

    public void clickClassifiedCheckBox() {
        getClassifiedCheckBox().click();
    }

    public void clickGeneralCheckBox() throws InterruptedException {
        Thread.sleep(2000);
        getGeneralCheckBox().click();
    }

    public void clickDownloadsCheckBox() {
        getDownloadsToggle().click();
    }

    public void clickWordFileCheckBox() {
        getWordFileCheckBox().click();
    }

    public void clickExcelFileCheckBox() {
        getExcelFileCheckBox().click();
    }

    public WebElement getAllCheckedText() {
        return driver.findElement(By.id("result"));
    }

    public String allBoxIsCheckedText() {
        return getAllCheckedText().getText();
    }
}