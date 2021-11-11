package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablesElementsPage {

    WebDriver driver;
    WebElement elementsMenu;
    WebElement webTables;
    WebElement addWebTables;
    WebElement firstNameWebTables;
    WebElement lastNameWebTables;
    WebElement emailOnWebTables;
    WebElement ageWebTables;
    WebElement salaryWebTables;
    WebElement departmentWebTables;
    WebElement submitWebTables;

    public WebTablesElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElementsMenu() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
    }

    public WebElement getWebTables() {
        return driver.findElement(By.xpath("//*[@id=\"item-3\"]"));
    }

    public WebElement getAddWebTables() {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    public WebElement getFirstNameWebTables() {
        return driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
    }

    public WebElement getLastNameWebTables() {
        return driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
    }

    public WebElement getEmailOnWebTables() {
        return driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
    }

    public WebElement getAgeWebTables() {
        return driver.findElement(By.xpath("//*[@id=\"age\"]"));
    }

    public WebElement getSalaryWebTables() {
        return driver.findElement(By.xpath("//*[@id=\"salary\"]"));
    }

    public WebElement getDepartmentWebTables() {
        return driver.findElement(By.xpath("//*[@id=\"department\"]"));
    }

    public WebElement getSubmitWebTables() {
        return driver.findElement(By.xpath("//*[@id=\"userForm\"]/div[7]/div"));
    }

    public void clickElementsMenu() {
        getElementsMenu().click();
    }

    public void clickWebTables() {
        getWebTables().click();
    }

    public void clickAddWebTables() {
        getAddWebTables().click();
    }

    public void insertFirstNameWebTables(String firstNameWebTables) {
        getFirstNameWebTables().clear();
        getFirstNameWebTables().sendKeys(firstNameWebTables);
    }

    public void insertLastNameWebTables(String lastNameWebTables) {
        getLastNameWebTables().clear();
        getLastNameWebTables().sendKeys(lastNameWebTables);
    }

    public void insertEmailWebElement(String emailOnWebTables) {
        getEmailOnWebTables().clear();
        getEmailOnWebTables().sendKeys(emailOnWebTables);
    }

    public void insertAgeWebTables(String ageWebTables) {
        getAgeWebTables().clear();
        getAgeWebTables().sendKeys(ageWebTables);
    }

    public void insertSalaryWebTables(String salaryWebTables) {
        getSalaryWebTables().clear();
        getSalaryWebTables().sendKeys(salaryWebTables);
    }

    public void insertDepartmentWebTables(String departmentWebTables) {
        getDepartmentWebTables().clear();
        getDepartmentWebTables().sendKeys(departmentWebTables);
    }

    public void clickSubmitWebTables() {
        getSubmitWebTables().click();
    }

}


