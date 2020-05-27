package org.com.frontend.steps;

import com.codeborne.selenide.WebDriverRunner;
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
        page.inputLogin(login);
        page.inputPassword(password);
        page.inputEmail(email);
        return this;
    }

    public RegSteps conductRegPoc (){
        page.submit();
        return this;
    }

    public RegSteps checkPageUrl(){
        Assert.assertEquals(WebDriverRunner.url(), "http://localhost:8088/login/");
        return this;
    }
}
