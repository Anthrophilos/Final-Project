package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage {
    WebDriver driver;
    WebElement elements;

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElements() {
        return driver.findElement(By.cssSelector(".avatar.mx-auto.white"));
    }

    public void clickElements (){
        getElements().click();
    }

}
