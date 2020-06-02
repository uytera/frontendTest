package org.com.frontend.pages;

import com.codeborne.selenide.SelenideElement;
import org.com.frontend.constants.Constants;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Selenide.$;

public class RegPage extends AbstractPage<RegPage> {

    public RegPage(){
        super();
        this.url = "http://localhost:8088/registration/";
    }

    public SelenideElement getLoginField(){
        return $(By.xpath( "//input[@name = \"login\"]"));
    }

    public SelenideElement getPasswordField(){
        return $(By.xpath( "//input[@name = \"pass\"]"));
    }

    public SelenideElement getEmailField(){
        return $(By.xpath( "//input[@name = \"email\"]"));
    }

    public SelenideElement getSubmitButton(){
        return $(By.xpath( "//input[@value = \"Reprehendo in\"]"));
    }

    public RegPage navigate() {
        return super.navigate(this.getClass());
    }

    public RegPage waitPageLoaded() {
        $("form :last-child").waitWhile(hidden , Constants.PAGE_LOAD_TIME);
        return this;
    }
}
