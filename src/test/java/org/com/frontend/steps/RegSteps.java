package org.com.frontend.steps;

import com.codeborne.selenide.WebDriverRunner;
import org.com.frontend.pages.LoginPage;
import org.com.frontend.pages.RegPage;
import org.com.frontend.pages.WebBrowserPage;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class RegSteps extends BaseSteps<RegPage> {

    public RegSteps(){
        page = new RegPage();
    }

    public RegSteps inputUserData (String login, String password, String email){
        page.getLoginField().setValue(login);
        page.getPasswordField().setValue(password);
        page.getEmailField().setValue(email);
        return this;
    }

    public RegSteps conductRegProc (){
        page.getSubmitButton().click();
        return this;
    }

    public RegSteps checkPageUrl(){
        LoginPage loginPage = new LoginPage();
        loginPage.shouldBeOpened();
        return this;
    }
}
