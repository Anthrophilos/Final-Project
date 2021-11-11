package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookStorePage {

    WebDriver driver;
    WebElement bookStore;

    public BookStorePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBookStore() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]"));
    }
    public void clickBookStore() {
        getBookStore().click();
    }
}
