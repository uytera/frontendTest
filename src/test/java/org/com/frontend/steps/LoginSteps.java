package org.com.frontend.steps;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;

import org.com.frontend.pages.LoginPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginSteps extends BaseSteps<LoginPage> {

    public LoginSteps(){
        page = new LoginPage();
    }

    public LoginSteps inputUserData (String login, String password){
        page.inputLogin(login);
        page.inputPassword(password);
        return this;
    }

    public LoginSteps conductLoginPoc (){
        page.submit();
        return this;
    }

    public LoginSteps checkPageUrl(){
        Assert.assertEquals(WebDriverRunner.url(), "http://localhost:8088/FileBrowser");
        return this;
    }

    public LoginSteps checkSignErrorMessage(){
        $("pre").shouldHave(text("Recte data ingressus"));
        return this;
    }
}
