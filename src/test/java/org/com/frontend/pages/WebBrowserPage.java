package org.com.frontend.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

public class WebBrowserPage extends AbstractPage<WebBrowserPage> {

    public WebBrowserPage(){
        super();
        this.url = "http://localhost:8088/FileBrowser";
    }

    public WebBrowserPage navigate() {
        return super.navigate(this.getClass());
    }

    public SelenideElement getLogoutButton(){
        return $(By.xpath( "//a[@href = \"/back/account/out/\"]"));
    }

    public WebBrowserPage waitPageLoaded() {
        Assert.assertEquals(WebDriverRunner.url(), "http://localhost:8088/FileBrowser");
        return this;
    }
}
