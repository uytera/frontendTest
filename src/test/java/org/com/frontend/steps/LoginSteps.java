package org.com.frontend.steps;

import com.codeborne.selenide.WebDriverRunner;
import org.com.frontend.pages.WebBrowserPage;
import org.testng.Assert;

import org.com.frontend.pages.LoginPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginSteps extends BaseSteps<LoginPage> {

    public LoginSteps(){
        page = new LoginPage();
    }

    public LoginSteps inputUserData (String login, String password){
        page.getInputLoginField().setValue(login);
        page.getInputPasswordField().setValue(password);
        return this;
    }

    public LoginSteps conductLoginProc (){
        page.getSubmitButton().click();
        return this;
    }

    public LoginSteps checkPageUrl(){
        WebBrowserPage webBrowserPage = new WebBrowserPage();
        webBrowserPage.shouldBeOpened();
        return this;
    }

    public LoginSteps checkSignErrorMessage(){
        $("pre").shouldHave(text("Recte data ingressus"));
        return this;
    }
}
