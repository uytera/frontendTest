package org.com.frontend.steps;

import com.codeborne.selenide.WebDriverRunner;
import org.com.frontend.pages.LoginPage;
import org.com.frontend.pages.MainPage;
import org.com.frontend.pages.WebBrowserPage;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LogoutSteps extends BaseSteps<WebBrowserPage> {

    public LogoutSteps(){
        page = new WebBrowserPage();
    }

    public LogoutSteps checkLogout(){
        page.getLogoutButton().click();
        LoginPage loginPage = new LoginPage();
        loginPage.shouldBeOpened();
        return this;
    }

    public LogoutSteps checkProtect(){
        page.navigate();
        $("pre").shouldHave(text("Advena. Commodo signum in"));
        return this;
    }
}
