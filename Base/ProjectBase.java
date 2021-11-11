package Base;

import Page.*;
import Page.TextBoxElementsPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

public class ProjectBase {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public DemoqaPage demoqaPage;
    public ElementsPage elementsPage;
    public FormsPage formsPage;
    public AlertsFrameWindowsPage alertsFrameWindowsPage;
    public WidgetsPage widgetsPage;
    public InteractionsPage interactionsPage;
    public BookStorePage bookStorePage;
    //______________________________

    public ButtonsElementsPage buttonsElementsPage;
    public CheckBoxElementsPage checkBoxElementsPage;
    public LinksElementsPage linksElementsPage;
    public RadioButtonElementsPage radioButtonElementsPage;
    public TextBoxElementsPage textBoxElementsPage;
    public WebTablesElementsPage webTablesElementsPage;
    public UploadAndDownloadPage uploadAndDownloadPage;
    public DynamicPropertiesPage dynamicPropertiesPage;
    //_________________________________
    public FormsMenuPage formsMenuPage;

    //_________________________________________
    public BrowserWindowsAFW browserWindowsAFW;


    //______________________________

    public ExcelReader excelReader;
    public WebElement roller;
    public JavascriptExecutor js;
    public String url;

    @BeforeClass
    public void setUp() throws IOException {
        System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, 5);
        demoqaPage = new DemoqaPage(driver);
        elementsPage = new ElementsPage(driver);
        textBoxElementsPage = new TextBoxElementsPage(driver, roller);
        formsPage = new FormsPage(driver);
        alertsFrameWindowsPage = new AlertsFrameWindowsPage(driver);
        widgetsPage = new WidgetsPage(driver);
        interactionsPage = new InteractionsPage(driver);
        bookStorePage = new BookStorePage(driver);
        buttonsElementsPage = new ButtonsElementsPage(driver);
        browserWindowsAFW = new BrowserWindowsAFW(driver);
        checkBoxElementsPage = new CheckBoxElementsPage(driver);
        dynamicPropertiesPage = new DynamicPropertiesPage(driver, wdwait);
        formsMenuPage = new FormsMenuPage(driver, wdwait);
        linksElementsPage = new LinksElementsPage(driver);
        radioButtonElementsPage = new RadioButtonElementsPage(driver);
        uploadAndDownloadPage = new UploadAndDownloadPage(driver);
        webTablesElementsPage = new WebTablesElementsPage(driver);

        excelReader = new ExcelReader("C:\\Users\\Sophie\\Documents\\Projekat1.xlsx");
        url = excelReader.getStringData("DemoqaData", 1, 0);
    }

    public void scrollIntoView(WebElement roller) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", roller);
    }


 /*   @AfterClass
    public void tearsDown() {
        driver.close();
        driver.quit();

    }
*/

}