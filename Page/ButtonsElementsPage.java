package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ButtonsElementsPage {

    WebDriver driver;
    WebElement buttonsElements;
    WebElement clickMeButtons;
    WebElement rightClickMeButtons;
    WebElement doubleClickMeButtons;
    Actions action;

    public ButtonsElementsPage(WebDriver driver) {
        this.driver = driver;

    }

    public WebElement getButtonsElements() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[5]"));
    }

    public WebElement getClickMeButtons() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/button"));
    }

    public WebElement getRightClickMeButtons() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/button"));
    }

    public WebElement getDoubleClickMeButtons() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/button"));
    }

    public void clickButtonsElements() {
        getButtonsElements().click();
    }

    public void clickMeButtons() {
        getClickMeButtons().click();
    }

    public void clickRightClickMeButtons() {
        action.contextClick(rightClickMeButtons).perform();
    }

    public void clickDoubleClickMeButtons() {
        action.doubleClick(doubleClickMeButtons).perform();
    }

    public String textAfterClicking() {
        return clickMeButtons.getText();
    }
}
