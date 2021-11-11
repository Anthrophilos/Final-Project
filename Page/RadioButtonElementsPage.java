package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonElementsPage {
    WebDriver driver;
    WebElement elementsMenu;
    WebElement radioButton;
    WebElement yesRadioButton;

    public RadioButtonElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElementsMenu() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
    }

    public WebElement getRadioButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[3]"));
    }

    public WebElement getYesRadioButton() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]/label"));
    }

    public void clickElementsMenu() {
        getElementsMenu().click();
    }

    public void clickRadioButton() {
        getRadioButton().click();

    }

    public void clickYesRadioButton() {

        getYesRadioButton().click();
    }

    public WebElement getAnswerText() {
        return driver.findElement(By.className("mt-3"));
    }

    public String answerText() {
        return getAnswerText().getText();
    }
}
