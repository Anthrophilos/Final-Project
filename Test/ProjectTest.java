package Test;

import Base.ProjectBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class ProjectTest extends ProjectBase {
    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to(url);

    }

/*    @Test(priority = 10)
    public void checkDemoqaPage() throws InterruptedException {
        demoqaPage.getElements();
        demoqaPage.getForms();
        demoqaPage.getAlertsFrameWindows();
        demoqaPage.getWidgets();
        demoqaPage.getInteractions();
        demoqaPage.getBookStore();

        Assert.assertTrue(demoqaPage.getElements().isDisplayed());
        Assert.assertTrue(demoqaPage.getForms().isDisplayed());
        Assert.assertTrue(demoqaPage.getAlertsFrameWindows().isDisplayed());
        Assert.assertTrue(demoqaPage.getWidgets().isDisplayed());
        Assert.assertTrue(demoqaPage.getInteractions().isDisplayed());
        Assert.assertTrue(demoqaPage.getBookStore().isDisplayed());
        //   Thread.sleep(2000);
    }

    @Test(priority = 20)
    public void checkDemoqaPageElementsSection() throws InterruptedException {
        elementsPage.getElements();
        elementsPage.clickElements();
        String urlElements = excelReader.getStringData("DemoqaData", 2, 0);
        Assert.assertEquals(urlElements, driver.getCurrentUrl());
        driver.navigate().back();
        //   Thread.sleep(200);
    }

    @Test(priority = 30)
    public void checkDemoqaPageFormsSection() throws InterruptedException {
        formsPage.getForms();
        formsPage.clickForms();
        String urlForms = excelReader.getStringData("DemoqaData", 3, 0);
        Assert.assertEquals(urlForms, driver.getCurrentUrl());
        driver.navigate().back();
        Thread.sleep(200);
    }

    @Test(priority = 40)
    public void checkDemoqaPageAlertsFrameWindowsSection() throws InterruptedException {
        alertsFrameWindowsPage.getAlertsFrameWindows();
        alertsFrameWindowsPage.clickOnAlertsFrameWindows();
        String urlAlertsFrameWindows = excelReader.getStringData("DemoqaData", 4, 0);
        driver.navigate().back();
        Thread.sleep(2000);
    }

    @Test(priority = 50)
    public void checkDemoqaPageWidgetsSection() throws InterruptedException {
        widgetsPage.getWidgets();
        widgetsPage.clickWidgets();
        String urlWidgets = excelReader.getStringData("DemoqaData", 5, 0);
        Assert.assertEquals(urlWidgets, driver.getCurrentUrl());
        driver.navigate().back();
        Thread.sleep(2000);
    }

    @Test(priority = 60)
    public void checkDemoqaPageInteractionsSection() throws InterruptedException {
        interactionsPage.getInteractions();
        interactionsPage.clickInteractions();
        String urlInteractions = excelReader.getStringData("DemoqaData", 6, 0);
        Assert.assertEquals(urlInteractions, driver.getCurrentUrl());
        driver.navigate().back();
        Thread.sleep(2000);
    }

    @Test(priority = 70)
    public void checkDemoqaPageBookStoreSection() throws InterruptedException {
        bookStorePage.getBookStore();
        bookStorePage.clickBookStore();
        String urlBookStore = excelReader.getStringData("DemoqaData", 7, 0);
        Assert.assertEquals(urlBookStore, driver.getCurrentUrl());
        driver.navigate().back();
        Thread.sleep(2000);
    }

    @Test(priority = 80)
    public void checkTextBoxData() throws InterruptedException {

        textBoxElementsPage.getElementsMenu();
        textBoxElementsPage.clickElementsButton();

        textBoxElementsPage.getTextBoxButton();
        textBoxElementsPage.clickTextBoxButton();

        String fullName = excelReader.getStringData("DemoqaData", 1, 2);
        String email = excelReader.getStringData("DemoqaData", 1, 3);
        String currentAddress = excelReader.getStringData("DemoqaData", 1, 4);
        String permanentAddress = excelReader.getStringData("DemoqaData", 1, 5);

        textBoxElementsPage.insertFullName(fullName);
        textBoxElementsPage.insertEmail(email);
        textBoxElementsPage.insertCurrentAddress(currentAddress);
        textBoxElementsPage.insertPermanentAddress(permanentAddress);
        Thread.sleep(2000);


        //boolean
        Assert.assertTrue(textBoxElementsPage.getFullNameField().isDisplayed());
        Assert.assertTrue(textBoxElementsPage.getEmailField().isDisplayed());
        Assert.assertTrue(textBoxElementsPage.getCurrentAddressField().isDisplayed());
        Assert.assertTrue(textBoxElementsPage.getPermanentAddressField().isDisplayed());


    }

    @Test(priority = 90)
    public void fillCheckBoxElementPage() throws InterruptedException {

        checkBoxElementsPage.getCheckBoxElements();
        checkBoxElementsPage.clickCheckBoxElements();
        Thread.sleep(500);
        checkBoxElementsPage.getCheckBoxMenu();
        checkBoxElementsPage.clickCheckBoxMenu();
        Thread.sleep(500);
        checkBoxElementsPage.getHomeCheckBox();
        checkBoxElementsPage.clickHomeCheckBox();
        Thread.sleep(500);
        checkBoxElementsPage.getDesktopToggle();
        checkBoxElementsPage.clickDektopToggle();
        Thread.sleep(500);
        checkBoxElementsPage.getNotesCheckBox();
        checkBoxElementsPage.clickNotesCheckBox();
        Thread.sleep(500);
        checkBoxElementsPage.getCommandsCheckBox();
        checkBoxElementsPage.clickCommandsTextBox();
        Thread.sleep(500);
        checkBoxElementsPage.getDocumentsToggle();
        checkBoxElementsPage.clickDocumentToggle();
        Thread.sleep(500);
        checkBoxElementsPage.getWorkSpaceToggle();
        checkBoxElementsPage.clickWorkSpaceToggle();
        Thread.sleep(500);
        checkBoxElementsPage.getReactCheckBox();
        checkBoxElementsPage.clickReactCheckBox();
        Thread.sleep(500);
        checkBoxElementsPage.getAngularCheckBox();
        checkBoxElementsPage.clickAngularCheckBox();
        Thread.sleep(500);
        checkBoxElementsPage.getVeuCheckBox();
        checkBoxElementsPage.clickVeuCheckBox();
        Thread.sleep(500);
        checkBoxElementsPage.getOfficeToggle();
        checkBoxElementsPage.clickOfficeToggleCheckBox();
        Thread.sleep(1000);
        checkBoxElementsPage.getPublicCheckBox();
        checkBoxElementsPage.clickPublicCheckBox();
        Thread.sleep(500);
        checkBoxElementsPage.getPrivateCheckBox();
        checkBoxElementsPage.clickPrivateCheckBox();
        Thread.sleep(500);
        checkBoxElementsPage.getClassifiedCheckBox();
        checkBoxElementsPage.clickClassifiedCheckBox();
        Thread.sleep(500);
        checkBoxElementsPage.getGeneralCheckBox();
        checkBoxElementsPage.clickGeneralCheckBox();
        Thread.sleep(500);
        checkBoxElementsPage.getDownloadsToggle();
        checkBoxElementsPage.clickDownloadsCheckBox();
        Thread.sleep(500);
        checkBoxElementsPage.getWordFileCheckBox();
        checkBoxElementsPage.clickWordFileCheckBox();
        Thread.sleep(500);
        checkBoxElementsPage.getExcelFileCheckBox();
        checkBoxElementsPage.clickExcelFileCheckBox();
        Thread.sleep(500);
        Assert.assertTrue(checkBoxElementsPage.getAllCheckedText().isDisplayed());

    }


    @Test(priority = 100)

    public void checkingElementOnRadioButton() {
        radioButtonElementsPage.getElementsMenu();
        radioButtonElementsPage.clickElementsMenu();

        radioButtonElementsPage.getRadioButton();
        radioButtonElementsPage.clickRadioButton();

        radioButtonElementsPage.getYesRadioButton();
        radioButtonElementsPage.clickYesRadioButton();

        Assert.assertTrue(radioButtonElementsPage.getAnswerText().isDisplayed());

    }

    @Test(priority = 110)
    public void insertDataWebTables() throws InterruptedException {
        webTablesElementsPage.getElementsMenu();
        webTablesElementsPage.clickElementsMenu();

        webTablesElementsPage.getWebTables();
        webTablesElementsPage.clickWebTables();

        webTablesElementsPage.getAddWebTables();
        webTablesElementsPage.clickAddWebTables();
        Thread.sleep(500);
        String firstNameWebTables = excelReader.getStringData("DemoqaData", 1, 10);
        String lastNameWebTables = excelReader.getStringData("DemoqaData", 1, 11);
        String emailOnWebPage = excelReader.getStringData("DemoqaData", 1, 2);
        String ageWebTables = excelReader.getStringData("Demoqadata", 1, 6);
        String salaryWebTables = excelReader.getStringData("DemoqaData", 1, 7);
        String departmentWebTables = excelReader.getStringData("DemoqaData", 1, 8);
        Thread.sleep(500);
        webTablesElementsPage.insertFirstNameWebTables(firstNameWebTables);
        webTablesElementsPage.insertLastNameWebTables(lastNameWebTables);
        webTablesElementsPage.insertEmailWebElement(emailOnWebPage);
        webTablesElementsPage.insertAgeWebTables(ageWebTables);
        webTablesElementsPage.insertSalaryWebTables(salaryWebTables);
        webTablesElementsPage.insertDepartmentWebTables(departmentWebTables);
        Thread.sleep(500);
        webTablesElementsPage.getSubmitWebTables();
        webTablesElementsPage.clickSubmitWebTables();
        Thread.sleep(500);
        Assert.assertTrue(webTablesElementsPage.getFirstNameWebTables().isDisplayed());
        Assert.assertTrue(webTablesElementsPage.getLastNameWebTables().isDisplayed());
        Assert.assertTrue(webTablesElementsPage.getEmailOnWebTables().isDisplayed());
        Assert.assertTrue(webTablesElementsPage.getAgeWebTables().isDisplayed());
        Assert.assertTrue(webTablesElementsPage.getSalaryWebTables().isDisplayed());
        Assert.assertTrue(webTablesElementsPage.getDepartmentWebTables().isDisplayed());

    }

    @Test(priority = 120)
    public void testingLinksResponse() {
        linksElementsPage.getElementsButton();
        linksElementsPage.clickElementsButton();

        linksElementsPage.getLinksElementsPage();
        linksElementsPage.clickLinksElementsPage();

        linksElementsPage.getHomeLinks();
        linksElementsPage.clickHomeLinks();

        linksElementsPage.getHomeDynamicLinks();
        linksElementsPage.clickHomeDynamicLinks();
        linksElementsPage.getLinksElementsPage();
        //_______________________________________________________
        //checking API call
        linksElementsPage.getCreatedLinks();
        linksElementsPage.clickCreatedLinks();

        linksElementsPage.getNoContentLinks();
        linksElementsPage.clickNoContentLinks();

        linksElementsPage.getMovedLinks();
        linksElementsPage.clickMovedLinks();

        linksElementsPage.getBadRequestLinks();
        linksElementsPage.clickBadRequestLinks();

        linksElementsPage.getUnauthorizedLinks();
        linksElementsPage.clickUnauthorizedLinks();

        linksElementsPage.getForbiddenLinks();
        linksElementsPage.clickForbiddenLinks();

        linksElementsPage.getNotFound();
        linksElementsPage.clickNotFoundLinks();

        Assert.assertTrue(linksElementsPage.getHomeLinks().isDisplayed());
        Assert.assertTrue(linksElementsPage.getHomeDynamicLinks().isDisplayed());

        Assert.assertTrue(linksElementsPage.getLinkResponseText().isDisplayed());

    }


    @Test(priority = 130)
    public void checkIfUserCanDownloadAndUploadFiles() throws InterruptedException {
        uploadAndDownloadPage.getElementsMenu();
        uploadAndDownloadPage.clickElementsMenu();

        uploadAndDownloadPage.getUploadAndDownload();
        uploadAndDownloadPage.clickDownloadAndUpload();

        uploadAndDownloadPage.getDownload();
        uploadAndDownloadPage.clickDownload();


        String uploadPicturePath = excelReader.getStringData("DemoqaData", 1, 14);
        uploadAndDownloadPage.selectFileToUpload(uploadPicturePath);

        Assert.assertFalse(uploadAndDownloadPage.equals(uploadPicturePath));
    }

    @Test(priority = 140)

    public void presenceOfElementAfter5Seconds() throws InterruptedException {

        dynamicPropertiesPage.getElementsMenu();
        dynamicPropertiesPage.clickElementsMenu();

        dynamicPropertiesPage.getDynamicProperties();
        dynamicPropertiesPage.clickDynamicProperties();
        Thread.sleep(6000);
        dynamicPropertiesPage.getVisibleAfter5SecondsButton();

        Assert.assertTrue(dynamicPropertiesPage.getVisibleAfter5SecondsButton().isDisplayed());

    }


    @Test(priority = 150)

    public void fillingFormsPageData() throws InterruptedException {

        formsMenuPage.getFormsMenu();
        formsMenuPage.clickFormsMenu();

        formsMenuPage.getPractiseForm();
        formsMenuPage.clickPractiseForm();

        String firstNameForms = excelReader.getStringData("DemoqaData", 1, 10);
        String lastNameForms = excelReader.getStringData("DemoqaData", 1, 11);
        String emailForms = excelReader.getStringData("DemoqaData", 1, 2);

        formsMenuPage.insertFirstNameForms(firstNameForms);
        formsMenuPage.insertLastNameForms(lastNameForms);
        formsMenuPage.insertEmailForms(emailForms);

        formsMenuPage.getGenderForms();
        formsMenuPage.clickGenderForms();

        String mobileForms = excelReader.getStringData("DemoqaData", 1, 5);
        formsMenuPage.insertMobileForms(mobileForms);

        formsMenuPage.getDateOfBirthForms();
        formsMenuPage.clickDateOfBirthForms();

        formsMenuPage.getMonthForms();
        formsMenuPage.clickMonthForms();

        formsMenuPage.getAugustForms();
        formsMenuPage.clickAugustForms();

        formsMenuPage.getYearBoxForms();
        formsMenuPage.clickYearBoxForms();

        formsMenuPage.getYearForms();
        formsMenuPage.clickYearForms();

        formsMenuPage.getDayForms();
        formsMenuPage.clickDayForms();

        formsMenuPage.getHobbiesReading();
        formsMenuPage.clickHobbiesReading();

        String pictureDestinationForms = excelReader.getStringData("DemoqaData", 1, 14);
        String currentAddressForms = excelReader.getStringData("DemoqaData", 1, 3);

        formsMenuPage.selectSomePictureForms(pictureDestinationForms);
        formsMenuPage.insertCurrentAddressForms(currentAddressForms);

        formsMenuPage.getStateSelectForms();
        formsMenuPage.clickStateSelectForms();

        formsMenuPage.getStateInputForms();
        formsMenuPage.clickStateInputForms();

        formsMenuPage.getCitySelectForms();
        formsMenuPage.clickCitySelectForms();

        formsMenuPage.getCityInputForms();
        formsMenuPage.clickCityInputForms();

        formsMenuPage.getSubmitButtonForms();
        formsMenuPage.clickSubmitButtonForms();

     //   Assert.assertTrue(formsMenuPage.successfulSubmittingButton());
    }



 */

    @Test (priority = 160)
        public void checkBrowserWindowsFunctions() throws InterruptedException {

        browserWindowsAFW.getAlertsFrameWindows();
        browserWindowsAFW.clickAlertsFrameWindows();

        browserWindowsAFW.getBrowserWindowsAFW();
        browserWindowsAFW.clickBrowserWindowsAFW();

        browserWindowsAFW.getNewTabAFW();
        browserWindowsAFW.clickNewTabAFW();

        browserWindowsAFW.getNewWindowAFW();
        browserWindowsAFW.clickNewWindowAFW();


        browserWindowsAFW.getNewWindowMessageAFW();
        browserWindowsAFW.clickNewWindowMessage();
    }


    }
