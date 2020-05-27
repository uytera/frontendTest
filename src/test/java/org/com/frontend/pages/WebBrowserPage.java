package org.com.frontend.pages;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Selenide.$;
import static org.com.frontend.constants.Constants.PAGE_LOAD_TIME;

public class WebBrowserPage extends AbstractPage<WebBrowserPage> {

    public WebBrowserPage(){
        super();
        this.url = "http://localhost:8088/FileBrowser";
    }

    public WebBrowserPage navigate() {
        return super.navigate(this.getClass());
    }

    public void logout(){
        $(".back :nth-child(3)").click();
    }

    public WebBrowserPage waitPageLoaded() {
        //$(".back :nth-child(3)").waitWhile(hidden , PAGE_LOAD_TIME);
        return this;
    }
}
