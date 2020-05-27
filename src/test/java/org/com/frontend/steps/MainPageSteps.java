package org.com.frontend.steps;

import org.com.frontend.pages.MainPage;

public class MainPageSteps extends BaseSteps<MainPage> {

    public MainPageSteps() {
        page = new MainPage();
    }

    public MainPageSteps openMainPage() {
        page.navigate();
        return this;
    }

    public LoginSteps clickOnLogin(){
        //page.getLoginHref();
        page.clickOnLoginHref();
        //LoginPage loginPage = new LoginPage();
        //loginPage.navigate();
        return new LoginSteps();
    }

    public RegSteps clickOnReg(){
        //page.getLoginHref();
        page.clickOnRegHref();
        //LoginPage loginPage = new LoginPage();
        //loginPage.navigate();
        return new RegSteps();
    }
}
