package org.com.frontend.pages;

import com.codeborne.selenide.SelenideElement;
import org.com.frontend.constants.Constants;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends  AbstractPage<LoginPage> {
    public LoginPage(){
        super();
        this.url = "http://localhost:8088/login/";
    }

    public SelenideElement getInputLoginField(){
        return $(By.xpath( "//input[@name = \"login\"]"));
    }

    public SelenideElement getInputPasswordField(){
        return $(By.xpath( "//input[@name = \"pass\"]"));
    }

    public SelenideElement getSubmitButton(){
        return $(By.xpath( "//input[@value = \"Ostium in\"]"));
    }

    public LoginPage navigate() {
        return super.navigate(this.getClass());
    }

    public LoginPage waitPageLoaded() {
        $("form :last-child").waitWhile(hidden , Constants.PAGE_LOAD_TIME);
        return this;
    }
}
