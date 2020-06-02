package org.com.frontend.pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Selenide.$;
import static org.com.frontend.constants.Constants.PAGE_LOAD_TIME;

public class MainPage extends  AbstractPage<MainPage> {
    public MainPage(){
        super();
        this.url = "http://localhost:8088";
    }

    public MainPage waitPageLoaded() {
        $("body :last-child").waitWhile(hidden , PAGE_LOAD_TIME);
        return this;
    }

    public MainPage navigate() {
        return super.navigate(this.getClass());
    }


    public SelenideElement getLoginButton(){
        return $(By.xpath( "//a[contains(text(), 'Log in')]"));
    }

    public SelenideElement getRegButton(){
        return $(By.xpath( "//a[contains(text(), 'Sign up')]"));
    }
}
