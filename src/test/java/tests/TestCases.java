package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestCases extends BaseTest {

    @Test(priority = 1)
    public void loginTest() {
        LoginPage login = new LoginPage(driver);
        login.enterUsername("admin");
        login.enterPassword("admin");
        login.clickLogin();

        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),
                "Login did not land on dashboard.");
    }

    @Test(priority = 2)
    public void forgotPasswordTest() {
        LoginPage login = new LoginPage(driver);
        login.clickForgotPassword();

        ForgotPasswordPage forgot = new ForgotPasswordPage(driver);
        forgot.typeFavoriteMovie("3 Idiots");
        forgot.clickSubmit();

        Assert.assertTrue(driver.getCurrentUrl().contains("forget_pass")
                        || driver.getPageSource().toLowerCase().contains("submit"),
                "Forgot password submission did not behave as expected.");
    }

    @Test(priority = 3)
    public void addCustomerTest() {
        LoginPage login = new LoginPage(driver);
        login.enterUsername("admin");
        login.enterPassword("admin");
        login.clickLogin();

        DashboardPage dash = new DashboardPage(driver);
        dash.clickAddCustomer();

        AddCustomerPage add = new AddCustomerPage(driver);
        add.typeName("Amol Ujagare 1233");
        add.typeContact1("43434343");
        add.typeContact2("4343434");
        add.typeAddress("XYZ");
        add.clickAdd();

        Assert.assertTrue(driver.getCurrentUrl().contains("customers")
                        || driver.getPageSource().toLowerCase().contains("success"),
                "Customer was not added successfully.");
    }

    @Test
    public void amolTest()
    {
        System.out.println("amolTest");
    }
}
