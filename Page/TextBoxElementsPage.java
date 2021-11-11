package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxElementsPage {
    WebDriver driver;
    WebElement roller;
    WebElement elementsButton; //DemoqaPage
    WebElement textBoxButton;
    WebElement fullNameField;
    WebElement emailField;
    WebElement currentAddressField;
    WebElement permanentAddressField;
    WebElement submitButtonTextBox;


    public TextBoxElementsPage(WebDriver driver, WebElement scrollElement) {
        this.driver = driver;
        this.roller = roller;

    }

    public WebElement getElementsMenu() {
        return driver.findElement(By.cssSelector(".avatar.mx-auto.white"));
    }

    public WebElement getTextBoxButton() {
        return driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
    }

    public WebElement getFullNameField() {
        return driver.findElement(By.xpath("//*[@id=\"userName\"]"));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
    }

    public WebElement getCurrentAddressField() {
        return driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
    }

    public WebElement getPermanentAddressField() {
        return driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
    }

    public WebElement getSubmitButtonTextBox() {
        return driver.findElement(By.xpath("//*[@id=\"userForm\"]/div[5]/div"));
    }

    public void clickElementsButton() {
        getElementsMenu().click();
    }

    public void clickTextBoxButton() {
        getTextBoxButton().click();
    }

    public void insertFullName(String fullNameData) {
        getFullNameField().clear();
        getFullNameField().sendKeys(fullNameData);
    }

    public void insertEmail(String emailData) {
        getEmailField().clear();
        getEmailField().sendKeys(emailData);
    }

    public void insertCurrentAddress(String currentAddressData) {
        getCurrentAddressField().clear();
        getCurrentAddressField().sendKeys(currentAddressData);
    }

    public void insertPermanentAddress(String permanentAddressData) {
        getPermanentAddressField().clear();
        getPermanentAddressField().sendKeys(permanentAddressData);
    }

    public void clickSubmitButtonTextBox() {
        getSubmitButtonTextBox().click();
    }


 /*   public String nameText(){
        return getFullNameField().getText();
    }

    public String emailText() {
        return  getEmailField().getText();
    }

    public String currentAddressText() {
        return getCurrentAddressField().getText();
    }

    public String permanentAddressText() {
        return getPermanentAddressField().getText();
    }
*/

}