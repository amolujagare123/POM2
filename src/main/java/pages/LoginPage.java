package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private final WebDriver driver;

    @FindBy(id = "login-username")
    private WebElement txtUsername;

    @FindBy(id = "login-password")
    private WebElement txtPassword;

    @FindBy(name = "submit")
    private WebElement btnLogin;

    @FindBy(linkText = "Forgot your password?")
    private WebElement lnkForgotPassword;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String user) {
        txtUsername.clear();
        txtUsername.sendKeys(user);
    }

    public void enterPassword(String pass) {
        txtPassword.clear();
        txtPassword.sendKeys(pass);
    }

    public void clickLogin() {
        btnLogin.click();
    }

    public void clickForgotPassword() {
        lnkForgotPassword.click();
    }

    public void pravinTest()
    {
        System.out.println("Pravin Changes added.")
    }
}
