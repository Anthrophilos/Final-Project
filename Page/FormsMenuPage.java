package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormsMenuPage {

    WebDriver driver;
    WebDriverWait wdwait;
    WebElement formsMenu;
    WebElement practiseForm;
    WebElement firstNameForms;
    WebElement lastNameForms;
    WebElement emailForms;
    WebElement genderForms;
    WebElement mobileForms;
    WebElement dateOfBirthForms;
    WebElement monthForms;
    WebElement augustForms;
    WebElement yearBoxForms;
    WebElement yearForms;
    WebElement dayForms;
    WebElement hobbiesReading;
    WebElement selectPictureForms;
    WebElement currentAddressForms;
    WebElement stateSelectForms;
    WebElement stateInputForms;
    WebElement citySelectForms;
    WebElement cityInputForms;
    WebElement submitButtonForms;


    public FormsMenuPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFormsMenu() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]"));
    }

    public WebElement getPractiseForm() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul"));
    }

    public WebElement getFirstNameForms() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastNameForms() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getEmailForms() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getGenderForms() {
        return driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
    }

    public WebElement getMobileForms() {
        return driver.findElement(By.id("userNumber"));
    }

    public WebElement getDateOfBirthForms() {
        return driver.findElement(By.id("dateOfBirthInput"));
    }

    public WebElement getMonthForms() {
        return driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]"));
    }

    public WebElement getAugustForms() {
        return driver.findElement(By.xpath("//option[@value=\"7\"]"));
    }

    public WebElement getYearBoxForms() {
        return driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]"));
    }

    public WebElement getYearForms() {
        return driver.findElement(By.xpath("//option[@value=\"1950\"]"));
    }

    public WebElement getDayForms() {
        return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[5]"));
    }

    public WebElement getHobbiesReading() {
        return driver.findElement(By.xpath("//label[contains(text(),'Reading')]"));
    }

    public WebElement getSelectPictureForms() {
        return driver.findElement(By.xpath("//input[@id='uploadPicture']"));
    }

    public WebElement getCurrentAddressForms()
    {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getStateSelectForms()
    {
        return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]"));
    }

    public WebElement getStateInputForms()
    {
        return driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]"));
    }

    public WebElement getCitySelectForms()
    {
        return driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[10]/div[3]/div[1]"));
    }

    public WebElement getCityInputForms() {
        return driver.findElement(By.xpath("//div[contains(text(),'Jaipur')]"));
    }

    public WebElement getSubmitButtonForms() {
        return driver.findElement(By.xpath("//button[@id='submit']"));
    }

    public void clickFormsMenu() {
        getFormsMenu().click();
    }

    public void clickPractiseForm() {
        getPractiseForm().click();
    }

    public void insertFirstNameForms(String nameForms) {
        getFirstNameForms().clear();
        getFirstNameForms().sendKeys(nameForms);
    }

    public void insertLastNameForms(String surnameForms) {
        getLastNameForms().clear();
        getLastNameForms().sendKeys(surnameForms);
    }

    public void insertEmailForms(String emailForms) {
        getEmailForms().clear();
        getEmailForms().sendKeys(emailForms);
    }

    public void clickGenderForms() {
        getGenderForms().click();
    }

    public void insertMobileForms(String mobileForms) {
        getMobileForms().clear();
        getMobileForms().sendKeys(mobileForms);
    }

    public void clickDateOfBirthForms() {
        getDateOfBirthForms().click();
    }

    public void clickMonthForms() {
        getMonthForms().click();
    }

    public void clickAugustForms() {
        getAugustForms().click();
    }

    public void clickYearBoxForms() {
        getYearBoxForms().click();
    }

    public void clickYearForms() {
        getYearForms().click();
    }

    public void clickDayForms() {
        getDayForms().click();
    }

    public void clickHobbiesReading() {
        getHobbiesReading().click();
    }

    public void selectSomePictureForms(String pictureDestination) {
        getSelectPictureForms().sendKeys(pictureDestination);
    }

    public void insertCurrentAddressForms(String currentAddressForms) throws InterruptedException {
        getCurrentAddressForms().sendKeys(currentAddressForms);

    }

    public void clickStateSelectForms() throws InterruptedException {
    Thread.sleep(2000);

        // wdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]")));
        getStateSelectForms().click();
    }

    public void clickStateInputForms() {
        getStateInputForms().click();
    }

    public void clickCitySelectForms() throws InterruptedException {
        Thread.sleep(2000);
        getCitySelectForms().click();
    }

    public void clickCityInputForms() {
        getStateInputForms().click();
    }

    public void clickSubmitButtonForms() {
        getSubmitButtonForms().click();
    }

    public boolean successfulSubmittingButton() {
        driver.findElements(By.xpath("//*[@id=\"closeLargeModal\"]"));
        return true;

    }

}
