package org.com.frontend.pages;

import org.com.frontend.constants.Constants;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Selenide.$;

public class RegPage extends AbstractPage<RegPage> {

    public RegPage(){
        super();
        this.url = "http://localhost:8088/registration/";
    }

    public RegPage inputLogin(String login){
        $("form :nth-child(1)").setValue(login);
        return this;
    }

    public RegPage inputPassword(String password){
        $("form :nth-child(2)").setValue(password);
        return this;
    }

    public RegPage inputEmail(String email){
        $("form :nth-child(3)").setValue(email);
        return this;
    }

    public void submit(){
        $("form :nth-child(4)").click();
    }

    public RegPage navigate() {
        return super.navigate(this.getClass());
    }

    public RegPage waitPageLoaded() {
        $("form :nth-child(4)").waitWhile(hidden , Constants.PAGE_LOAD_TIME);
        return this;
    }
}
