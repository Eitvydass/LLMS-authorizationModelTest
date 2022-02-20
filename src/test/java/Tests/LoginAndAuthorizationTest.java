package Tests;

import Pages.AuthorizationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pages.LoginPage;
import Pages.MainPage;
import Utils.WaitUtils;
import Utils.WindowHandles;

public class LoginAndAuthorizationTest extends BaseTest {

    /*@DataProvider(name = "credentials")
    public static Object[][] createData() {
        return new Object[][]{
                new Object[]{("admin.test@kitm.lt"), ("Akademija20"), ("Coordinator"), ("Home"), ("New requests"), ("Classrooms management"), ("Learning history"), ("Help")},
                new Object[]{("regularuser.test@kitm.lt"), ("Akademija20"), ("Requestor"), ("Home"), ("New requests"), ("Learning history"), ("Help")},
                new Object[]{("teamlead.test@kitm.lt"), ("Akademija20"), ("Teacher"), ("Home"), ("New requests"), ("Classrooms management"), ("Learning history"), ("Help")},
                new Object[]{("blockuser.test@kitm.lt"), ("Akademija20"), ("Student"), ("Home"), ("New requests"), ("Classrooms management"), ("Learning history"), ("Help")}
        };*/


    @Test(priority = 1)
    public void coordinatorLoginAndAuthorizationModel() {

        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        WindowHandles windowHandles = new WindowHandles(driver);
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);


        mainPage.clickLoginButton();
        windowHandles.switchToPopUpWindow();
        loginPage.enterUsername("admin.test@kitm.lt");
        loginPage.clickOnNextButton();
        loginPage.enterPassword("Akademija20");
        loginPage.clickSignInButton();
        if (windowHandles.countWindows() != 1) {
            loginPage.clickOnDisagreeStaySignedInButton();
        }
        windowHandles.switchToMainWindow();

        authorizationPage.clickOnHomeLink("Home");
        authorizationPage.clickOnRequestsLink("New requests");
        authorizationPage.clickOnClassroomsLink("Classrooms management");
        authorizationPage.clickOnHistoryLink("Learning history");
        authorizationPage.clickOnHelpLink("Help");


    }

    @Test(priority = 2)
    public void reguestorLoginAndAuthorizationModel() {

        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        WindowHandles windowHandles = new WindowHandles(driver);
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);


        mainPage.clickLoginButton();
        windowHandles.switchToPopUpWindow();
        loginPage.enterUsername("regularuser.test@kitm.lt");
        loginPage.clickOnNextButton();
        loginPage.enterPassword("Akademija20");
        loginPage.clickSignInButton();
        if (windowHandles.countWindows() != 1) {
            loginPage.clickOnDisagreeStaySignedInButton();
        }
        windowHandles.switchToMainWindow();

        authorizationPage.clickOnHomeLink("Home");
        authorizationPage.clickOnRequestsLink("New requests");
        authorizationPage.clickOnHistoryLink("Learning history");
        authorizationPage.clickOnHelpLink("Help");


    }

    @Test(priority = 3)
    public void teacherLoginAndAuthorizationModel() {

        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        WindowHandles windowHandles = new WindowHandles(driver);
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);


        mainPage.clickLoginButton();
        windowHandles.switchToPopUpWindow();
        loginPage.enterUsername("teamlead.test@kitm.lt");
        loginPage.clickOnNextButton();
        loginPage.enterPassword("Akademija20");
        loginPage.clickSignInButton();
        if (windowHandles.countWindows() != 1) {
            loginPage.clickOnDisagreeStaySignedInButton();
        }
        windowHandles.switchToMainWindow();

        authorizationPage.clickOnHomeLink("Home");
        authorizationPage.clickOnHistoryLink("Learning history");
        authorizationPage.clickOnHelpLink("Help");


    }

    @Test(priority = 4)
    public void studentLoginAndAuthorizationModel() {

        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        WindowHandles windowHandles = new WindowHandles(driver);
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);


        mainPage.clickLoginButton();
        windowHandles.switchToPopUpWindow();
        loginPage.enterUsername("blockuser.test@kitm.lt");
        loginPage.clickOnNextButton();
        loginPage.enterPassword("Akademija20");
        loginPage.clickSignInButton();
        if (windowHandles.countWindows() != 1) {
            loginPage.clickOnDisagreeStaySignedInButton();
        }
        windowHandles.switchToMainWindow();

        authorizationPage.clickOnHomeLink("Home");
        authorizationPage.clickOnHistoryLink("Learning history");
        authorizationPage.clickOnHelpLink("Help");


    }


}
