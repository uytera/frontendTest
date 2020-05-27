package org.com.frontend.pages;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Selenide.$;
import static org.com.frontend.constants.Constants.PAGE_LOAD_TIME;

public class MainPage extends  AbstractPage<MainPage> {
    public MainPage(){
        super();
        this.url = "http://localhost:8088";
    }

    public MainPage waitPageLoaded() {
        $("body :nth-child(4)").waitWhile(hidden , PAGE_LOAD_TIME);
        return this;
    }

    public MainPage navigate() {
        return super.navigate(this.getClass());
    }

    public String getLoginHref(){
        return $("body :nth-child(4)").getAttribute("href");
    }

    public void clickOnLoginHref(){
        $("body :nth-child(4) :first-child").click();
    }

    public void clickOnRegHref(){
        $("body :nth-child(3) :first-child").click();
    }
}
