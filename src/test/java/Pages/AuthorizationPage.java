package Pages;

import Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthorizationPage {

    WebDriver driver;

    public By homeLinkInput = By.xpath("//*[@id=\"basic-navbar-nav\"]/nav/nav/div[1]/a");
    public By requestsLinkInput = By.xpath("//*[@id=\"basic-navbar-nav\"]/nav/nav/div[2]/a[2]");
    public By classroomsLinkInput = By.xpath("//*[@id=\"basic-navbar-nav\"]/nav/nav/div[2]/a[5]");
    public By learningLinkInput = By.xpath("//*[@id=\"basic-navbar-nav\"]/nav/nav/div[2]/a[1]");
    public By helpLinkInput = By.xpath("//*[@id=\"basic-navbar-nav\"]/nav/nav/div[2]/a[4]");

    public AuthorizationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnHomeLink(String homeLink) {
        WaitUtils.waitUntilVisibilityOfElementLocated(driver, homeLinkInput, 10);
        driver.findElement(homeLinkInput).click();
    }

    public void clickOnRequestsLink(String requestsLink) {
        WaitUtils.waitUntilVisibilityOfElementLocated(driver, requestsLinkInput, 10);
        driver.findElement(requestsLinkInput).click();
    }

    public void clickOnClassroomsLink(String requestsLink) {
        WaitUtils.waitUntilVisibilityOfElementLocated(driver, classroomsLinkInput, 10);
        driver.findElement(classroomsLinkInput).click();
    }

    public void clickOnHistoryLink(String historyLink) {
        WaitUtils.waitUntilVisibilityOfElementLocated(driver, learningLinkInput, 10);
        driver.findElement(learningLinkInput).click();
    }

    public void clickOnHelpLink(String helpLink) {
        WaitUtils.waitUntilVisibilityOfElementLocated(driver, helpLinkInput, 10);
        driver.findElement(helpLinkInput).click();
    }
}



