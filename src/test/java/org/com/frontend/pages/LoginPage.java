package org.com.frontend.pages;

import org.com.frontend.constants.Constants;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends  AbstractPage<LoginPage> {
    public LoginPage(){
        super();
        this.url = "http://localhost:8088/login/";
    }

    public LoginPage inputLogin(String login){
        $("form :nth-child(1)").setValue(login);
        return this;
    }

    public LoginPage inputPassword(String password){
        $("form :nth-child(2)").setValue(password);
        return this;
    }

    public void submit(){
        $("form :nth-child(3)").click();
    }

    public LoginPage navigate() {
        return super.navigate(this.getClass());
    }

    public LoginPage waitPageLoaded() {
        $("form :nth-child(3)").waitWhile(hidden , Constants.PAGE_LOAD_TIME);
        return this;
    }
}
