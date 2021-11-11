package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormsPage {
    WebDriver driver;
    WebElement forms;

    public FormsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getForms() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div"));
    }

    public void clickForms() {
        getForms().click();

    }

}
