package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksElementsPage {
    WebDriver driver;
    //  WebElement roller;
    WebElement elementsButton;
    WebElement linksElementsPage;
    WebElement homeLinks;
    WebElement homeDynamicLinks;
    WebElement createdLinks;
    WebElement noContentLinks;
    WebElement movedLinks;
    WebElement badRequestLinks;
    WebElement unauthorizedLinks;
    WebElement forbiddenLinks;
    WebElement notFound;
    WebElement linkResponseText;

    public LinksElementsPage(WebDriver driver) {
        this.driver = driver;
        // this.roller = roller;
    }

    public WebElement getElementsButton() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
    }

    public WebElement getLinksElementsPage() {
        return driver.findElement(By.xpath("//*[@id=\"item-5\"]"));
    }

    public WebElement getHomeLinks() {
        return driver.findElement(By.xpath("//*[@id=\"linkWrapper\"]/p[1]"));//alternativni xpath //a[@id='simpleLink']
    }

    public WebElement getHomeDynamicLinks() {
        return driver.findElement(By.xpath("//a[@id='dynamicLink']"));
    }

    public WebElement getCreatedLinks() {
        return driver.findElement(By.xpath("//a[@id='created']"));
    }

    public WebElement getNoContentLinks() {
        return driver.findElement(By.xpath("//a[@id='no-content']"));
    }

    public WebElement getMovedLinks() {
        return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/p[5]"));
    }

    public WebElement getBadRequestLinks() {
        return driver.findElement(By.xpath("//a[@id='bad-request']"));
    }

    public WebElement getUnauthorizedLinks() {
        return driver.findElement(By.xpath("//a[@id='unauthorized']"));
    }

    public WebElement getForbiddenLinks() {
        return driver.findElement(By.xpath("//a[@id='forbidden']"));
    }

    public WebElement getNotFound() {
        return driver.findElement(By.xpath("//a[@id='invalid-url']"));
    }


    public WebElement getLinkResponseText() {
        return driver.findElement(By.id("linkResponse"));
    }

    public void clickElementsButton() {
        getElementsButton().click();
    }

    public void clickLinksElementsPage() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getLinksElementsPage()); //roller.click();
        getLinksElementsPage().click();
    }

    public void clickHomeLinks() {
        getHomeLinks().click();
    }

    public void clickHomeDynamicLinks() {
        getHomeDynamicLinks().click();
    }

    public void clickCreatedLinks() {
        getCreatedLinks().click();
    }

    public void clickNoContentLinks() {
        getNoContentLinks().click();
    }

    public void clickMovedLinks() {
        getMovedLinks().click();
    }

    public void clickBadRequestLinks() {
        getBadRequestLinks().click();
    }

    public void clickUnauthorizedLinks() {
        getUnauthorizedLinks().click();
    }

    public void clickForbiddenLinks() {
        getForbiddenLinks().click();
    }

    public void clickNotFoundLinks() {
        getNotFound().click();
    }

    public void checkLinkResponseText() {
        getLinkResponseText().getText();
    }


}
