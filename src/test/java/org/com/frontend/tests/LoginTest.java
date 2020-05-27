package org.com.frontend.tests;

import org.com.frontend.BaseTest;
import org.com.frontend.steps.LoginSteps;
import org.com.frontend.steps.LogoutSteps;
import org.com.frontend.steps.MainPageSteps;
import org.com.frontend.steps.RegSteps;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class LoginTest extends BaseTest {
    @DataProvider(name = "rightSign")
    public Object[][] createRightSignData() {
        return new Object[][]{
                {"User", "User"},
                {"joe", "joe"}
        };
    }

    @DataProvider(name = "wrongSign")
    public Object[][] createWrongSignData() {
        return new Object[][]{
                {"joeqwdq", "joe"},
                {"User", "dsfsdfsd"}
        };
    }

    @Test(dataProvider = "rightSign")
    public void rightSign(String login, String password)  {
        MainPageSteps mainPageSteps = new MainPageSteps();
        LoginSteps loginSteps = mainPageSteps.openMainPage().clickOnLogin();

        loginSteps.inputUserData(login, password)
                .conductLoginPoc()
                .checkPageUrl();
    }

    @Test(dataProvider = "wrongSign")
    public void wrongSign(String login, String password)  {
        MainPageSteps mainPageSteps = new MainPageSteps();
        LoginSteps loginSteps = mainPageSteps.openMainPage().clickOnLogin();

        loginSteps.inputUserData(login, password)
                .conductLoginPoc()
                .checkSignErrorMessage();
    }

    @Test()
    public void logout()  {
        MainPageSteps mainPageSteps = new MainPageSteps();
        LoginSteps loginSteps = mainPageSteps.openMainPage().clickOnLogin();

        loginSteps.inputUserData("User", "User")
                .conductLoginPoc();
        LogoutSteps logoutSteps = new LogoutSteps();
        logoutSteps.checkLogout()
                .checkProtect();
    }

    @Test()
    public void registration()  {
        String login = generateString(new Random(), "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", 5);
        String password = generateString(new Random(), "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", 5);
        MainPageSteps mainPageSteps = new MainPageSteps();
        RegSteps regSteps = mainPageSteps.openMainPage().clickOnReg();
        regSteps.inputUserData(login, password, "home@yandex.ru")
                .conductRegPoc()
                .checkPageUrl();

        LoginSteps loginSteps = new LoginSteps();
        loginSteps.inputUserData(login, password)
                .conductLoginPoc();
    }

    public static String generateString(Random rng, String characters, int length)
    {
        char[] text = new char[length];
        for (int i = 0; i < length; i++)
        {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }
}
