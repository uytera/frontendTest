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
        page.getLoginButton().click();
        return new LoginSteps();
    }

    public RegSteps clickOnReg(){
        page.getRegButton().click();
        return new RegSteps();
    }
}
